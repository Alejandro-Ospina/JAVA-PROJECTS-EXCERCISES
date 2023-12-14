package com.Alejandro.EggNewsLoginUsers.Services;

import com.Alejandro.EggNewsLoginUsers.Entidades.Periodista;
import com.Alejandro.EggNewsLoginUsers.Entidades.Usuarios;
import com.Alejandro.EggNewsLoginUsers.Exceptions.Excepciones;
import com.Alejandro.EggNewsLoginUsers.Repositories.PeriodistaRepository;
import com.Alejandro.EggNewsLoginUsers.Repositories.UsuariosRepository;
import com.Alejandro.EggNewsLoginUsers.UsersRole.Roles;
import jakarta.servlet.http.HttpSession;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsersService implements UserService{

    private final UsuariosRepository usuariosRepository;
    private final PeriodistaRepository periodistaRepository;

    @Autowired
    public UsersService(UsuariosRepository usuariosRepository, PeriodistaRepository periodistaRepository) {
        this.usuariosRepository = usuariosRepository;
        this.periodistaRepository = periodistaRepository;
    }

    @Override
    public UserDetails loadUserByEmail(String email) throws UsernameNotFoundException {
        Optional<Usuarios> usuario = usuariosRepository.obtenerUsuarioPorEmail(email);
        if (usuario.isPresent()){
            List<GrantedAuthority> permisos = new ArrayList<>();
            GrantedAuthority grantedAuthority =
                    new SimpleGrantedAuthority("ROLE_" + usuario.get().getRol().toString());
            permisos.add(grantedAuthority);
            ServletRequestAttributes attributes =
                    (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            HttpSession httpSession = attributes.getRequest().getSession(true);
            httpSession.setAttribute("usuario", usuario);
            return new User(usuario.get().getEmail(), usuario.get().getPassword(), permisos);
        }
        return null;
    }

    @Transactional
    public void crearUsuario(String username, String email, String password) throws Excepciones.RegistroExistente {
        Optional<Usuarios> usuario = usuariosRepository.obtenerUsuarioPorEmail(email);
        Optional<Usuarios> usuario2 = usuariosRepository.obtenerUsuarioPorNombre(username);
        if(usuario.isPresent() || usuario2.isPresent()){
            throw new Excepciones.RegistroExistente("Ya existe un usuario con el nombre o email establecidos");
        }
        usuariosRepository.save(new Usuarios(username, email, password, Roles.USER));
    }

    @Transactional
    public void crearPeriodista(String username, String email, String password, Long sueldo) throws Excepciones.RegistroExistente {
        Optional<Periodista> usuario = periodistaRepository.findByName(username);
        Optional<Periodista> usuario2 = periodistaRepository.findByEmail(email);
        if(usuario.isPresent() || usuario2.isPresent()){
            throw new Excepciones.RegistroExistente("Ya existe un periodista con el nombre o email establecidos");
        }
        usuariosRepository.save(new Periodista(username, email, password, Roles.PERIODISTA, sueldo));
    }
}
package com.Alejandro.EggNewsLoginUsers.Services;

import com.Alejandro.EggNewsLoginUsers.Entidades.Periodista;
import com.Alejandro.EggNewsLoginUsers.Entidades.Usuarios;
import com.Alejandro.EggNewsLoginUsers.Exceptions.Excepciones;
import com.Alejandro.EggNewsLoginUsers.Repositories.PeriodistaRepository;
import com.Alejandro.EggNewsLoginUsers.Repositories.UsuariosRepository;
import com.Alejandro.EggNewsLoginUsers.UsersRole.Roles;
import jakarta.servlet.http.HttpSession;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
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
@RequiredArgsConstructor
public class UsersService extends UserService{

    private final UsuariosRepository usuariosRepository;
    private final PeriodistaRepository periodistaRepository;

    @Override
    public UserDetails loadUserByEmail(String email) throws UsernameNotFoundException {
        Usuarios usuario = usuariosRepository.obtenerUsuarioPorEmail(email).orElseThrow(
                () -> new UsernameNotFoundException("Usuario no encontrado"));
        List<GrantedAuthority> permisos = new ArrayList<>();
        GrantedAuthority grantedAuthority =
                new SimpleGrantedAuthority("ROLE_" + usuario.getRol().toString());
        permisos.add(grantedAuthority);
        ServletRequestAttributes attributes =
                    (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpSession httpSession = attributes.getRequest().getSession(true);
        httpSession.setAttribute("usuario", usuario);
        return new User(usuario.getEmail(), usuario.getPassword(), permisos);
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
        Optional<Periodista> usuario = periodistaRepository.findByUserName(username);
        Optional<Periodista> usuario2 = periodistaRepository.findByEmail(email);
        if(usuario.isPresent() || usuario2.isPresent()){
            throw new Excepciones.RegistroExistente("Ya existe un periodista con el nombre o email establecidos");
        }
        usuariosRepository.save(new Periodista(username, email, password, Roles.PERIODISTA, sueldo));
    }

    @Transactional
    public void darDeBajaPeriodista(String idPeriodista) throws Excepciones.RegistroNoExistente {
        Optional<Periodista> periodista = periodistaRepository.findById(idPeriodista);
        if(periodista.isEmpty()){
            throw new Excepciones.RegistroNoExistente("No existe un periodista con el id dado");
        }
        Periodista periodista1 = periodista.get();
        periodista1.setActivo(false);
        periodistaRepository.save(periodista1);
    }

    @Transactional
    public void actualizarPeriodista (String idPeriodista, String userName, String email, Long sueldoMensual) throws Excepciones.RegistroNoExistente {
        Optional<Periodista> periodista = periodistaRepository.findById(idPeriodista);
        if(periodista.isEmpty()){
            throw new Excepciones.RegistroNoExistente("No existe un periodista con el id dado");
        }
        Periodista periodista1 = periodista.get();
        periodista1.setUserName(userName); periodista1.setEmail(email); periodista1.setSueldoMensual(sueldoMensual);
        periodistaRepository.save(periodista1);
    }

    @Transactional
    public void actualizarUsuario (String idUsuario, String userName, String email) throws Excepciones.RegistroNoExistente {
        Optional<Usuarios> usuario = usuariosRepository.findById(idUsuario);
        if(usuario.isEmpty()){
            throw new Excepciones.RegistroNoExistente("No existe un usuario con el id dado");
        }
        Usuarios usuarios = usuario.get();
        usuarios.setUserName(userName); usuarios.setEmail(email);
        usuariosRepository.save(usuarios);
    }

    @Transactional
    public void darDeBajaUsuario (String idUsuario) throws Excepciones.RegistroNoExistente {
        Optional<Usuarios> usuario = usuariosRepository.findById(idUsuario);
        if(usuario.isEmpty()){
            throw new Excepciones.RegistroNoExistente("No existe un usuario con el id dado");
        }
        Usuarios usuarios = usuario.get();
        usuarios.setActivo(false);
        usuariosRepository.save(usuarios);
    }


}
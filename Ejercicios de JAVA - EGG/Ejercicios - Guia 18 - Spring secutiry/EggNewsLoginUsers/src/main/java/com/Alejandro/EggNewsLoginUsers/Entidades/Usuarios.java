package com.Alejandro.EggNewsLoginUsers.Entidades;

import com.Alejandro.EggNewsLoginUsers.UsersRole.Roles;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Usuarios {

    @Id
    @GeneratedValue (generator = "uuid")
    private String id;
    @Column (nullable = false, unique = true)
    private String userName;

    @Column (nullable = false, unique = true)
    @Email (regexp = "^[A-Za-z0-9._-]+@[A-Za-z]+\\.[A-Za-z]{2,3}$", message = "Email format not valid!")
    private String email;
    @Column (nullable = false)
    private String password;
    @Enumerated (EnumType.STRING)
    private Roles rol;
    private Boolean activo;

    public Usuarios(String userName, String email, String password, Roles rol) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.rol = rol;
        this.activo = true;
    }
}
package com.Alejandro.EggNewsLoginUsers.Entidades;

import com.Alejandro.EggNewsLoginUsers.UsersRole.Roles;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public final class Periodista extends Usuarios{

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "periodista")
    private List<Noticias> noticiasList;
    @Column (nullable = false)
    private Long sueldoMensual;

    public Periodista(String userName, String email, String password, Roles rol, Long sueldoMensual) {
        super(userName, email, password, rol);
        this.sueldoMensual = sueldoMensual;
    }
}
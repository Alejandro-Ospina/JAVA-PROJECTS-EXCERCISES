
package com.alejandro.EggNews.Entidades;

import java.util.Calendar;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
// @author new53

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Noticias{

    @Id
    @GeneratedValue (generator = "uuid")
    @GenericGenerator (name = "uuid", strategy = "uuid2")
    private String idNoticia;
    
    @Column(length = 500, columnDefinition = "TEXT")
    private String nombreNoticia;
    @Column (columnDefinition = "LONGTEXT")
    private String cuerpoNoticia;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fechaCreacion;

    public Noticias(String nombreNoticia, String cuerpoNoticia, Calendar fechaCreacion) {
        this.nombreNoticia = nombreNoticia;
        this.cuerpoNoticia = cuerpoNoticia;
        this.fechaCreacion = fechaCreacion;
    }    
}
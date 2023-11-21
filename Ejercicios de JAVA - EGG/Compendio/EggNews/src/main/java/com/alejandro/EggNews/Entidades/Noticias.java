
package com.alejandro.EggNews.Entidades;

import com.sun.tracing.dtrace.ArgsAttributes;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;


// @author new53
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Noticias implements Serializable{
    
    @Id
    @GeneratedValue (generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String idNoticia;
    private String nombreNoticia;
    private String cuerpoNoticia;

    public Noticias(String nombreNoticia, String cuerpoNoticia) {
        this.nombreNoticia = nombreNoticia;
        this.cuerpoNoticia = cuerpoNoticia;
    }    
}
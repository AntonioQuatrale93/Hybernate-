package it.develhope.HybernateExercise.entities;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @Column(nullable = false)
    private String lastname;
    @NotNull
    @Column(nullable = false)
    private String firstname;
    @NotNull
    @Column(nullable = false)
    private String email;


}

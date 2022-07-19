package it.develhope.HybernateExercise.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Students students;
    @ManyToOne
    private Classes classes;
}

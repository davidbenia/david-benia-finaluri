package edu.btu.david.benia.davidbenia1.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
public class tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ToString.Exclude
    @ManyToOne
    private Book book;
}

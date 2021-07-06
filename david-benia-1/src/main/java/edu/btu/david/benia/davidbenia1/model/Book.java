package edu.btu.david.benia.davidbenia1.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;

    @ToString.Exclude
    @OneToMany
    private List<tag> tags = new ArrayList<>();

    @ToString.Exclude
    @OneToOne
    private attachment attachment;

    @ToString.Exclude
    @ManyToMany
    private List<author> authors = new ArrayList<>();
}

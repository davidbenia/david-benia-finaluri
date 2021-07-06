package edu.btu.david.benia.davidbenia1.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    @ToString.Exclude
    @ManyToMany
    private List<Book> books = new ArrayList<>();
}

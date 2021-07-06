package edu.btu.david.benia.davidbenia1.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
public class attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String pdfUrl;

    @ToString.Exclude
    @OneToOne
    private Book book;
}

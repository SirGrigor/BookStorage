package com.ilgrig.study.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "TB_BOOK")
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, name = "ITLE")
    private String title;

    @Column(nullable = false, name = "AUTHOR")
    private String author;

    @Column(nullable = false, name = "COVERPHOTOURL")
    private String coverPhotoURL;

    @Column(nullable = false, name = "ISBNNUMBER")
    private Long isbnNumber;

    @Column(nullable = false, name = "PRICE")
    private Double price;

    @Column(nullable = false, name = "LANGUAGE")
    private String language;

    @Column(nullable = false, name = "GENRE")
    private String genre;
}

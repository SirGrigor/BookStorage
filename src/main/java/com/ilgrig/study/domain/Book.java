package com.ilgrig.study.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "tb_book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, name = "title")
    private String title;

    @Column(nullable = false, name = "author")
    private String author;

    @Column(nullable = false, name = "cover_photo_url")
    private String coverPhotoURL;

    @Column(nullable = false, name = "is_bn_number")
    private Long isbnNumber;

    @Column(nullable = false, name = "price")
    private Double price;

    @Column(nullable = false, name = "language")
    private String language;

    @Column(nullable = false, name = "genre")
    private String genre;
}

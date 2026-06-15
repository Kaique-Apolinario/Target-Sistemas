package com.fiap.airmaxxing.entities;

@Entity
public class OrgaoResponsavel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String regiao;
}
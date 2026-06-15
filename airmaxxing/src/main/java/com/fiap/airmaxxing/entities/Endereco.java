package com.fiap.airmaxxing.entities;

@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String logradouro;

    private String numero;

    private String bairro;

    private String cidade;

    private String cep;
}
package com.fiap.airmaxxing.entities;

import java.time.LocalDateTime;


import com.fiap.airmaxxing.enums.StatusDenuncia;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Denuncia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    private String endereco;

    private String bairro;

    private String cidade;


    private LocalDateTime dataCriacao;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private OrgaoResponsavel orgaoResponsavel;
    
    @Enumerated(EnumType.STRING)
    private StatusDenuncia status;
}
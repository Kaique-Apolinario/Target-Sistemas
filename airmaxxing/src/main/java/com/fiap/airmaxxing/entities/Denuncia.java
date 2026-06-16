package com.fiap.airmaxxing.entities;

import java.time.LocalDateTime;

import com.fiap.airmaxxing.enums.StatusDenuncia;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Denuncia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private String enderecoLocal;
    private LocalDateTime dataCriacao;

    @Enumerated(EnumType.STRING)
    private StatusDenuncia status;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaFumaca categoria;

    @ManyToOne
    @JoinColumn(name = "duracao_id")
    private EstimativaDuracao duracao;

    @ManyToOne
    @JoinColumn(name = "orgao_id")
    private OrgaoResponsavel orgaoResponsavel;
}
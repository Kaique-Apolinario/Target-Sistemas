package com.fiap.airmaxxing.entities;

@Entity
public class Denuncia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    private String endereco;

    private String bairro;

    private String cidade;

    private String status;

    private LocalDateTime dataCriacao;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private OrgaoResponsavel orgaoResponsavel;
    
    @Enumerated(EnumType.STRING)
    private StatusDenuncia status;
}
package com.fiap.airmaxxing.services;

@Service
public class DenunciaService {

    private final DenunciaRepository repository;

    public DenunciaService(DenunciaRepository repository) {
        this.repository = repository;
    }

    public List<Denuncia> listar() {
        return repository.findAll();
    }

    public Denuncia salvar(Denuncia denuncia) {
        denuncia.setDataCriacao(LocalDateTime.now());
        denuncia.setStatus("PENDENTE");
        return repository.save(denuncia);
    }

    public Denuncia buscar(Long id) {
        return repository.findById(id)
                .orElseThrow();
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
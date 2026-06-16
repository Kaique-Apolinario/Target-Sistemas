package com.fiap.airmaxxing.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fiap.airmaxxing.entities.Denuncia;
import com.fiap.airmaxxing.enums.StatusDenuncia;
import com.fiap.airmaxxing.repositories.DenunciaRepository;

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
        denuncia.setStatus(StatusDenuncia.PENDENTE);
        return repository.save(denuncia);
    }

    public Denuncia buscar(Long id) {
        return repository.findById(id)
                .orElseThrow();
    }
    
    public List<Denuncia> buscarPorStatus(StatusDenuncia status) {
        return repository.findByStatus(status);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
    
    public Denuncia atualizarStatus(Long id, StatusDenuncia status) {

        Denuncia denuncia = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Denúncia não encontrada"));

        denuncia.setStatus(status);

        return repository.save(denuncia);
    }
}
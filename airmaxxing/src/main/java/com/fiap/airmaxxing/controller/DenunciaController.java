package com.fiap.airmaxxing.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.airmaxxing.entities.Denuncia;
import com.fiap.airmaxxing.enums.StatusDenuncia;
import com.fiap.airmaxxing.services.DenunciaService;

@RestController
@RequestMapping("/denuncias")
public class DenunciaController {

    private final DenunciaService service;

    public DenunciaController(DenunciaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Denuncia> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Denuncia buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @PostMapping
    public Denuncia criar(@RequestBody Denuncia denuncia) {
        return service.salvar(denuncia);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
    
    @PatchMapping("/{id}/status")
    public Denuncia atualizarStatus(
            @PathVariable Long id,
            @RequestParam StatusDenuncia status) {

        return service.atualizarStatus(id, status);
    }
    
    @GetMapping("/status/{status}")
    public List<Denuncia> buscarPorStatus(
            @PathVariable StatusDenuncia status) {

        return service.buscarPorStatus(status);
    }
}
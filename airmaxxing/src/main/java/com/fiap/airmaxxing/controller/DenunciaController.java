package com.fiap.airmaxxing.controller;

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
            @RequestParam String status) {

        return service.atualizarStatus(id, status);
    }
}
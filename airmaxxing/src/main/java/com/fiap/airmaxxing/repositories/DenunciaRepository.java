package com.fiap.airmaxxing.repositories;

import java.util.List;

import com.fiap.airmaxxing.entities.Denuncia;

@Repository
public interface DenunciaRepository
        extends JpaRepository<Denuncia, Long> {

    List<Denuncia> findByStatus(String status);

    List<Denuncia> findByBairro(String bairro);
}
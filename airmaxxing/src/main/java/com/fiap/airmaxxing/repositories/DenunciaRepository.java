package com.fiap.airmaxxing.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.airmaxxing.entities.Denuncia;
import com.fiap.airmaxxing.enums.StatusDenuncia;

@Repository
public interface DenunciaRepository
        extends JpaRepository<Denuncia, Long> {

    List<Denuncia> findByStatus(StatusDenuncia status);
}
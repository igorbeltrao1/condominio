package com.condominio.ateus.model.repository;

import com.condominio.ateus.model.entities.Condominio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondominioRepository extends JpaRepository<Condominio, Long> {
}

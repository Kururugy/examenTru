package com.examen.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.persistence.jpa.model.OrdenesJpaEntity;

@Repository
public interface OrdenJpaRepository extends JpaRepository<OrdenesJpaEntity, Integer> {

}

package com.examen.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.persistence.jpa.model.SucursalesJpaEntity;

@Repository
public interface SucursalJpaRepository extends JpaRepository<SucursalesJpaEntity, Integer> {

}

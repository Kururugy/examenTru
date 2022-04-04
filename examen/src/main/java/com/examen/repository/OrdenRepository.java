package com.examen.repository;

import java.util.Optional;

import com.examen.entities.Ordenes;
import com.examen.persistence.jpa.model.OrdenesJpaEntity;

public interface OrdenRepository {
	
	Optional<Ordenes> saveOrden(OrdenesJpaEntity orden);

}

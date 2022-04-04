package com.examen.repositoryImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.examen.entities.Ordenes;
import com.examen.jpa.converter.OrdenesConverterJpa;
import com.examen.jpa.repository.OrdenJpaRepository;
import com.examen.persistence.jpa.model.OrdenesJpaEntity;
import com.examen.repository.OrdenRepository;

public class OrdenRepositoryImpl implements OrdenRepository {
	
	@Autowired
	private OrdenJpaRepository ordenJpaRepository;

	@Override
	public Optional<Ordenes> saveOrden(OrdenesJpaEntity orden) {
		return Optional.of(OrdenesConverterJpa.OrdenJpaToOrdenDto(ordenJpaRepository.save(orden)));
	}

}

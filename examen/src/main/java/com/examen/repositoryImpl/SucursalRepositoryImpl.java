package com.examen.repositoryImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.examen.entities.Sucursales;
import com.examen.jpa.converter.SucursalConverterJpa;
import com.examen.jpa.repository.SucursalJpaRepository;
import com.examen.repository.SucursalRepository;

public class SucursalRepositoryImpl implements SucursalRepository {
	
	@Autowired
	private SucursalJpaRepository sucursalJpaRepository;

	@Override
	public Optional<Sucursales> getSucursal(Integer sucursalId) {		
		return Optional.of(SucursalConverterJpa.sucursalJpaToSucursalDto(sucursalJpaRepository.getById(sucursalId)));		
	}
	
}

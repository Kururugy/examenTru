package com.examen.repository;

import java.util.Optional;

import com.examen.entities.Sucursales;

public interface SucursalRepository {

	Optional<Sucursales> getSucursal(Integer sucursalId);
	
}

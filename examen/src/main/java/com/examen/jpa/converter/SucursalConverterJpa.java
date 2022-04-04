package com.examen.jpa.converter;

import com.examen.entities.Sucursales;
import com.examen.persistence.jpa.model.SucursalesJpaEntity;

public class SucursalConverterJpa {
	
	private SucursalConverterJpa() {}
	
	public static Sucursales sucursalJpaToSucursalDto(SucursalesJpaEntity sucursal) {
		return Sucursales.builder()
				.setSucursalId(sucursal.getSucursalId())
				.setNombre(sucursal.getNombre())
				.build();
	}

}

package com.examen.jpa.converter;

import com.examen.entities.Ordenes;
import com.examen.persistence.jpa.model.OrdenesJpaEntity;

public class OrdenesConverterJpa {
	
	private OrdenesConverterJpa() {}
	
	public static Ordenes OrdenJpaToOrdenDto(OrdenesJpaEntity orden) {
		return Ordenes.builder()
				.setOrdenId(orden.getOrdenId())
				.setSucursal(SucursalConverterJpa.sucursalJpaToSucursalDto(orden.getSucursal()))
				.setFecha(orden.getFecha())
				.setTotal(orden.getTotal())
				.build();
	}

}

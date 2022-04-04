package com.examen.managerImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.entities.Ordenes;
import com.examen.entities.Sucursales;
import com.examen.manager.OrdenManager;
import com.examen.repository.OrdenRepository;
import com.examen.repository.SucursalRepository;
import com.examen.rest.model.request.OrdenRequestDto;
import com.examen.rest.model.request.ProductosRequestDto;

@Service
public class OrdenManagerImpl implements OrdenManager {
	
	@Autowired 
	private OrdenRepository ordenRepository;
	
	@Autowired
	private SucursalRepository sucursalRepository;
	

	@Override
	public Ordenes saveOrder(OrdenRequestDto orden) {
		
		Double total = orden.getProductos().stream().mapToDouble(ProductosRequestDto::getPrecio).sum();
		
		Optional<Sucursales> sucursales = sucursalRepository.getSucursal(orden.getSucursalId()); 
		
		Ordenes newOrden = Ordenes.builder().build();
		
		if(sucursales.isPresent()) {
			newOrden.setSucursal(sucursales.get());
//			newOrden.setFecha(new Time);
		}
		
		
		return null;
	}

}

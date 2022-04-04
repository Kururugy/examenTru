package com.examen.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder(setterPrefix = "set", toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Ordenes {
	
	private Integer OrdenId;
	private Sucursales sucursal;
	private String fecha;
	private Double total;

}

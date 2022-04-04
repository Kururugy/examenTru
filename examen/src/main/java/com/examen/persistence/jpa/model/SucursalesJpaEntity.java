package com.examen.persistence.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "sucursales")
@Getter
@Setter
@Builder(setterPrefix = "set", toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class SucursalesJpaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sucursal_id", updatable = false, nullable = false)
	private Integer sucursalId;
	
	@Column(name = "nombre")
	private String nombre;

}

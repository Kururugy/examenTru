package com.examen.persistence.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ordenes")
@Getter
@Setter
@Builder(setterPrefix = "set", toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class OrdenesJpaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "orden_id", updatable = false, nullable = false)
	private Integer ordenId;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "sucursal_id", referencedColumnName = "sucursal_id", insertable = true,  updatable = true)
	private SucursalesJpaEntity sucursal; 

	@Column(name = "fecha")
	private String fecha;
	
	@Column(name = "total")
	private Double total;
	
}

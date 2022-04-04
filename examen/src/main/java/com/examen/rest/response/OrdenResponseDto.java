package com.examen.rest.response;

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
public class OrdenResponseDto {

	private Integer ordenId;
	private Integer sucursalId;
	private String fecha;
	private Double total;
	
}

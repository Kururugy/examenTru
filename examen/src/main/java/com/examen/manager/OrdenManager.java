package com.examen.manager;

import com.examen.entities.Ordenes;
import com.examen.rest.model.request.OrdenRequestDto;

public interface OrdenManager {
	
	Ordenes saveOrder(OrdenRequestDto orden);

}

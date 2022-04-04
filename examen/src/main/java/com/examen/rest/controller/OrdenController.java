package com.examen.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.examen.rest.model.request.OrdenRequestDto;
import com.examen.rest.response.OrdenResponseDto;

@RestController
@RequestMapping(value = "/orden")
public class OrdenController {

	public @ResponseBody ResponseEntity<OrdenResponseDto> orden(@RequestBody OrdenRequestDto ordenRequestDto) {
	
		OrdenResponseDto response;
		
		OrdenResponseDto.OrdenResponseDtoBuilder result = OrdenResponseDto.builder();
		
		response = result.build();
		
		return new ResponseEntity<OrdenResponseDto>(response, HttpStatus.OK);
		
	}
	
}

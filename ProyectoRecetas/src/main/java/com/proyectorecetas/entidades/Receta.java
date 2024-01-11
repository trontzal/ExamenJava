package com.proyectorecetas.entidades;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Receta {
	private Long id;
	private String nombre;
	private Dificultad dificultad;
	
	 @Override
	    public String toString() {
	        return "Receta(id=" + id + ", nombre=" + nombre + ", dificultad=" + dificultad.getDificultad() + ")";
	    }
}

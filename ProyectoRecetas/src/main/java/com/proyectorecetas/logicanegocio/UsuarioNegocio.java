package com.proyectorecetas.logicanegocio;

import com.proyectorecetas.entidades.Receta;

public interface UsuarioNegocio {

	Iterable<Receta> listadoRecetas();
	
}

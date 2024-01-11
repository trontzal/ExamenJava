package com.proyectorecetas.logicanegocio;

import com.proyectorecetas.entidades.Receta;

public interface AdminNegocio extends UsuarioNegocio{

	Receta insertarReceta(Receta receta);
	
}

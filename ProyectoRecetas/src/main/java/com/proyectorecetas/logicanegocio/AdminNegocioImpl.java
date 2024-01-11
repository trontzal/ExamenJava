package com.proyectorecetas.logicanegocio;

import org.springframework.stereotype.Component;

import com.proyectorecetas.entidades.Receta;

@Component
public class AdminNegocioImpl extends UsuarioNegocioImpl implements AdminNegocio{

	@Override
	public Receta insertarReceta(Receta receta) {
		return daoReceta.insertar(receta);
		// faltan mejoras
	}

}

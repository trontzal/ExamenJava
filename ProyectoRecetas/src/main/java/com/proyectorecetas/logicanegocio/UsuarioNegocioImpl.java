package com.proyectorecetas.logicanegocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.proyectorecetas.accesodatos.DaoReceta;
import com.proyectorecetas.entidades.Receta;

@Component
@Primary
class UsuarioNegocioImpl implements UsuarioNegocio{
	
	@Autowired
	protected DaoReceta daoReceta;

	@Override
	public Iterable<Receta> listadoRecetas() {
		return daoReceta.obtenerTodos();
	}

}

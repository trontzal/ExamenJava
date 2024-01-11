package com.proyectorecetas.presentacion.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.proyectorecetas.logicanegocio.UsuarioNegocio;

@Controller
public class IndexControllerJsp {
	
	@Autowired
	private UsuarioNegocio user;
	
	@GetMapping("/")
	public String mostrarHolaJSP(Model modelo) {
		modelo.addAttribute("recetas", user.listadoRecetas());
		System.out.println(user.listadoRecetas());
		return "mostrar";
	}
	
	@GetMapping("ver-receta")
	public String verReceta() {
		return "noImplementado";
	}
}

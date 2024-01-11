package com.proyectorecetas.presentacion.controladores;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

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
	
	@GetMapping("/error")
	public String error(Model modelo, HttpServletRequest request) {

		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

		modelo.addAttribute("status", status);

		return "_error";
	}
}

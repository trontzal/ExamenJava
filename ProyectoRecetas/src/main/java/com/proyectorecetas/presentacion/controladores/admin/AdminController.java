package com.proyectorecetas.presentacion.controladores.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyectorecetas.entidades.Receta;
import com.proyectorecetas.logicanegocio.AdminNegocio;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminNegocio admin;

	@GetMapping
	public String index(Model modelo) {
		modelo.addAttribute("recetas", admin.listadoRecetas());
		return "admin/insertar";
	}

	@PostMapping("/insertar")
    public String insertarReceta(@ModelAttribute Receta receta, Model model) {
        try {
            Receta nuevaReceta = admin.insertarReceta(receta);

            model.addAttribute("nuevaReceta", nuevaReceta);

            return "redirect:/";
        } catch (Exception e) {
            model.addAttribute("error", "Error al insertar la receta");
            return "error";
        }
    }

}

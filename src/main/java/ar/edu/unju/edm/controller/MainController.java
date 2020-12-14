package ar.edu.unju.edm.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unju.edm.model.UsuarioModelo;
import ar.edu.unju.edm.service.UsuarioService;
@Controller
@RequestMapping("/home")
public class MainController {
		@Autowired
		UsuarioService UsuarioService;
		@GetMapping ("/formualario")
		public ModelAndView getform() {
			return new ModelAndView("formulario").addObject("usuariomodelo", new UsuarioModelo());
		}

		@GetMapping ("/formulario")
		public String form() {
			return "formulario";
		}
}

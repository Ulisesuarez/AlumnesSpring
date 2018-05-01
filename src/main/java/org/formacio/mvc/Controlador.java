package org.formacio.mvc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controlador {
	@Autowired
	private org.formacio.component.ServeiAlumnat Servei;
	@RequestMapping(path="/alumnes")
	@ResponseBody
	public Integer nombreAlumnes() {
		
	return Servei.getRepoAlumnes().llistaAlumnes().size(); }
	@RequestMapping(path="/")
	@ResponseBody
	public String llistaAlumnes() {
		String result="";
		for (String Alumne : Servei.getRepoAlumnes().llistaAlumnes()) {
			result=result+Alumne+"<br>";
		}
		
	return result ; }


}

package org.formacio.component;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServeiAlumnat {
	
	@Autowired
	private RepositoriAlumnes repoAlumnes;
	public RepositoriAlumnes getRepoAlumnes() {
		return repoAlumnes;
	}
	@PostConstruct
	public void init() {
		matricula(1, "Antonia");
		matricula(2, "Joan");
	}
	public boolean matricula (int id, String alumne) {
		if(alumne == null) {
			return false;
		}
		repoAlumnes.altaAlumne(id, alumne);
		return true;
	}
	
	
}

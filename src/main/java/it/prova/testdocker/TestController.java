package it.prova.testdocker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
	Utente fabio = new Utente(1l, "Fabio","Pulcinelli");
	Utente loris = new Utente(2l, "Loris","Saija");
	List<Utente> utenti = Arrays.asList(fabio, loris);
	
	@GetMapping()
    public String test() {
        return "Ciao da Fabio";
    }
	
	@GetMapping("/list")
	public List<Utente> lista() {
        return utenti;
    }
}
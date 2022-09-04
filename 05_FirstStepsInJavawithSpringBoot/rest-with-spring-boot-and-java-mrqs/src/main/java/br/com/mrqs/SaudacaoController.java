/*
 * - paa duplicar uma linha: ctrl + alt + seta para baixo
 * */
//
package br.com.mrqs;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaudacaoController {
	private static final String template = "Curso de Spring Boot com %s!!!";
	private final AtomicInteger contador = new AtomicInteger();
	
	@RequestMapping("/saudacao")
	public Saudacao saudacao(@RequestParam(value = "name", defaultValue = "Paulo Marques") String name) {
		return new Saudacao(contador.incrementAndGet(), String.format(template, name));
	}

}

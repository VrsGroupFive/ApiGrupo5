package br.com.apigrupo5.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.apigrupo5.api.dao.ContaDao;
import br.com.apigrupo5.api.model.Conta;

@RestController
public class ContaController {
	@Autowired
	private ContaDao dao;

	@GetMapping("/contas")
	public List<Conta> getAll() {
		return (List<Conta>) dao.findAll();
	}

	@GetMapping("/contas/{numero}")
	public Conta getByNumero(@PathVariable int numero) {
		return dao.findById(numero).orElse(null);
	}
}

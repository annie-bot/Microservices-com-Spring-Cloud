package br.comloja.abella.arquitetura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.comloja.abella.arquitetura.controller.dto.CompraDTO;
import br.comloja.abella.arquitetura.service.CompraService;

@RestController
@RequestMapping ("/compra")

public class CompraController {
	
	@Autowired
	private CompraService compraService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void RealizaCompra(@RequestBody CompraDTO compra) {
		compraService.realizaCompra (compra);
	}

}
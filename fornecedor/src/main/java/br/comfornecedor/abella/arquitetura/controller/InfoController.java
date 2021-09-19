package br.comfornecedor.abella.arquitetura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.comfornecedor.abella.arquitetura.model.InfoFornecedor;
import br.comfornecedor.abella.arquitetura.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {

	@Autowired
	private InfoService infoService;
	
	@RequestMapping("/{estado}")
	public InfoFornecedor getInfoPorEstado (@PathVariable String estado) {
		return infoService.getInfoPorEstado(estado);
		
	}
	
}

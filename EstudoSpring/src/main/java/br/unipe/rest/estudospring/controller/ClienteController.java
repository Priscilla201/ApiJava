package br.unipe.rest.estudospring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unipe.rest.estudospring.model.Cliente;
import br.unipe.rest.estudospring.repository.ClienteRepository;

@RestController
@RequestMapping("api")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	@GetMapping("/cliente")
	public List<Cliente> buscarClientes(){
		return clienteRepository.findAll();
	}
	@PostMapping("/cliente")
	public Cliente salvar( @RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
		
	}
	@GetMapping("/mensagem")
	public String mensagem () {
		return "Conseguimos!";
	}
	@GetMapping("/soma/{n1}/{n2}")
	public String soma(@PathVariable int n1 , @PathVariable int n2) {
		int resultado = n1+n2;
		return "O resultado é :  "+ resultado;
	}
	@GetMapping("/cliente/id/{id}")
	public Optional<Cliente> buscarClientesById(@PathVariable Long id) {
		return clienteRepository.findById(id);
		
	}
}

package com.curso.cursonew.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.cursonew.domain.Categoria;
import com.curso.cursonew.repositories.CategoriaRepository;
@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional <Categoria> obj = repo.findById(id);
			return obj.orElse(null);
		
	}


	}



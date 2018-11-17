package br.com.proj.modelo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.proj.modelo.domain.Categoria;
import br.com.proj.modelo.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoria;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = categoria.findById(id);
		return obj.orElse(null);

	}

}

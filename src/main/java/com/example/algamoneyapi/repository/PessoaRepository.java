package com.example.algamoneyapi.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoneyapi.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	/*
	public Page<Pessoa> findSearchByName(String nome, Pageable pageable);
	*/
	public Page<Pessoa> findByNomeContaining(String nome, Pageable pageable);
}

package br.com.dsm.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dsm.projeto.model.Contato;

public interface Contatos extends JpaRepository<Contato, Long> {
  
}

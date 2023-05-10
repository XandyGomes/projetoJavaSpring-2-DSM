package br.com.dsm.projeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data

public class Contato {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  
  String name;

  String email;
}

package com.cenfotec.graphqlexa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cenfotec.graphqlexa.entities.Cliente;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Integer> {

}

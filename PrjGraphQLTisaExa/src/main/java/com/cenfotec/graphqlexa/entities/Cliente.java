package com.cenfotec.graphqlexa.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Entity
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "nombre", nullable = false)
	 private String nombre;
	
	 @Column(name = "apellidoUno", nullable = false)
	 private String apellidoUno;
	 
	 @Column(name = "apellidoDos", nullable = false)
	 private String apellidoDos;
	 
	 @Column(name = "direccionResidencia", nullable = false)
	 private String direccionResidencia;
	
	 @Column(name = "direccionCobro", nullable = false)
	 private String direccionCobro;
	 
	 @Column(name = "numeroTarjeta", nullable = false)
	 private String numeroTarjeta;
	 
	 @Column(name = "vencimiento", nullable = false)
	 private String vencimiento;
	

}

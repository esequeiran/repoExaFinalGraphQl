package com.cenfotec.graphqlexa.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cenfotec.graphqlexa.entities.Cliente;
import com.cenfotec.graphqlexa.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepo;
	
	public List<Cliente> getAllClientes(int count) {
		return
	this.clienteRepo.findAll().stream().limit(count).collect(Collectors.toList());
		}
	
		public Optional<Cliente> getCliente(int id) {
		return this.clienteRepo.findById(id);
		}
		
		public Cliente createCliente(int id, String nombre, String apellidoUno,
		 String apellidoDos, String direccionResidencia, String direccionCobro, String numeroTarjeta, String vencimiento) {

			Cliente cliente = new Cliente();
			cliente.setId(id);
			cliente.setNombre(nombre);
			cliente.setApellidoUno(apellidoUno);
			cliente.setApellidoDos(apellidoDos);
			cliente.setDireccionResidencia(direccionResidencia);
			cliente.setDireccionCobro(direccionCobro);
			cliente.setNumeroTarjeta(numeroTarjeta);
			cliente.setVencimiento(vencimiento);
		
		 return this.clienteRepo.save(cliente);
		}
		
		public boolean deleteCliente(int id) {
			
			try {
				this.clienteRepo.deleteById(id);
				
				return true;
				
			}catch(Exception err) {
				return false;
			}
			
			
		}

		public Cliente updateCliente(int id, String nombre, String apellidoUno,
				 String apellidoDos, String direccionResidencia, String direccionCobro, String numeroTarjeta, String vencimiento) {

					Cliente cliente = new Cliente();
					cliente.setId(id);
					cliente.setNombre(nombre);
					cliente.setApellidoUno(apellidoUno);
					cliente.setApellidoDos(apellidoDos);
					cliente.setDireccionResidencia(direccionResidencia);
					cliente.setDireccionCobro(direccionCobro);
					cliente.setNumeroTarjeta(numeroTarjeta);
					cliente.setVencimiento(vencimiento);
				
				 return this.clienteRepo.save(cliente);
				}
		
}

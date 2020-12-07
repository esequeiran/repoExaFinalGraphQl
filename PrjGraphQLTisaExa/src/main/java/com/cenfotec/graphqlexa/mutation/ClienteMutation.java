package com.cenfotec.graphqlexa.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cenfotec.graphqlexa.entities.Cliente;
import com.cenfotec.graphqlexa.services.ClienteService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class ClienteMutation implements GraphQLMutationResolver {
	
	@Autowired
	private ClienteService clienteService;
	
	public Cliente createCliente(int id, String nombre, String apellidoUno,
			 String apellidoDos, String direccionResidencia, String direccionCobro, String numeroTarjeta, String vencimiento) {
		
		return this.clienteService.createCliente(id, nombre, apellidoUno, apellidoDos, direccionResidencia, direccionCobro, numeroTarjeta, vencimiento);
	}
	
	public Cliente updateCliente(int id, String nombre, String apellidoUno,
			 String apellidoDos, String direccionResidencia, String direccionCobro, String numeroTarjeta, String vencimiento) {
		
		return this.clienteService.updateCliente(id, nombre, apellidoUno, apellidoDos, direccionResidencia, direccionCobro, numeroTarjeta, vencimiento);
	}
	
	public Boolean deleteCliente(int id) {
		return this.clienteService.deleteCliente(id);
		
	}
}

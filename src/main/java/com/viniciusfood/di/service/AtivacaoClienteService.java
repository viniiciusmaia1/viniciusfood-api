package com.viniciusfood.di.service;


import org.springframework.stereotype.Component;
import com.viniciusfood.di.modelo.Cliente;
import com.viniciusfood.di.notificador.NotificadorEmail;

@Component
public class AtivacaoClienteService {

	private NotificadorEmail notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}
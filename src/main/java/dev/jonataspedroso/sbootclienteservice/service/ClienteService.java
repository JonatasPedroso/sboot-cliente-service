package dev.jonataspedroso.sbootclienteservice.service;

import dev.jonataspedroso.sbootclienteservice.domain.entity.Cliente;
import dev.jonataspedroso.sbootclienteservice.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ClienteService {

	private final ClienteRepository repository;

	@Transactional
	public Cliente save (final Cliente cliente) {
		return repository.save(cliente);
	}

	public Optional<Cliente> getByCPF(final String cpf) {
		return repository.findByCpf(cpf);
	}
}

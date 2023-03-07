package dev.jonataspedroso.sbootclienteservice.repository;

import dev.jonataspedroso.sbootclienteservice.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	Optional<Cliente> findByCpf(String cpf);
}

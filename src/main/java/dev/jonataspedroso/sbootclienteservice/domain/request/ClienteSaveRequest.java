package dev.jonataspedroso.sbootclienteservice.domain.request;

import dev.jonataspedroso.sbootclienteservice.domain.entity.Cliente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteSaveRequest {
	private String cpf;
	private String nome;
	private Integer idade;

	public Cliente toModel() {
		return Cliente.builder()
				.cpf(cpf)
				.nome(nome)
				.idade(idade)
				.build();
	}
}

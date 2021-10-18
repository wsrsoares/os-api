package com.william.os.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.william.os.domain.Cliente;
import com.william.os.domain.OS;
import com.william.os.domain.Tecnico;
import com.william.os.domain.enuns.Prioridade;
import com.william.os.domain.enuns.Status;
import com.william.os.repositories.ClienteRepository;
import com.william.os.repositories.OSRepository;
import com.william.os.repositories.TecnicoRepository;

@Service
public class DBService {
	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private OSRepository osRepository;


	public void instaciaDB() {
		Tecnico t1 = new Tecnico(null, "Valdir Cezar", "411.864.640-46", "(11) 99588-4488");
		Tecnico t2 = new Tecnico(null, "Beto Cezar", "839.147.450-02", "(11) 99588-4488");
		Tecnico t3 = new Tecnico(null, "Carlos Augusto", "692.880.780-61", "(11) 99588-4788");
		Tecnico t4 = new Tecnico(null, "Oscar Dupre", "556.360.310-50", "(11) 99588-4428");
		Tecnico t5 = new Tecnico(null, "João Filho", "154.982.620-43", "(11) 99588-4498");
		Cliente c1 = new Cliente(null, "Paulo José", "331.546.458-88", "(11) 99588-4499");
		
		OS os1 = new OS(null, Prioridade.ALTA, "teste teste", Status.ANDAMENTO, t1, c1);

		t1.getList().add(os1);
		c1.getList().add(os1);

		tecnicoRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5));
		clienteRepository.saveAll(Arrays.asList(c1));
		osRepository.saveAll(Arrays.asList(os1));
	}
}

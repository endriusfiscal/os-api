package com.endrius.os.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.endrius.os.domain.Cliente;
import com.endrius.os.domain.OS;
import com.endrius.os.domain.Tecnico;
import com.endrius.os.domain.enuns.Prioridade;
import com.endrius.os.domain.enuns.Status;
import com.endrius.os.ripositories.ClienteRepository;
import com.endrius.os.ripositories.OSRepository;
import com.endrius.os.ripositories.TecnicoRepository;

@Service
public class DBServices {

	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private OSRepository osRepository;

	
	public void instanciaDB() {

		Tecnico t1 = new Tecnico(null, "Endrius Pontes", "856.772.610-76", "(41)99999-9999");
		Cliente c1 = new Cliente(null, "Betina Campos", "266.757.750-73", "(41)98999-9999");
		OS os1 = new OS(null, Prioridade.ALTA, "Teste Create OS", Status.ANDAMENTO, t1, c1);

		t1.getList().add(os1);
		c1.getList().add(os1);

		tecnicoRepository.saveAll(Arrays.asList(t1));
		clienteRepository.saveAll(Arrays.asList(c1));
		osRepository.saveAll(Arrays.asList(os1));
	}

}

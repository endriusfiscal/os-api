package com.endrius.os.ripositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.endrius.os.domain.Cliente;
import com.endrius.os.domain.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Cliente, Integer>{
	@Query("SELECT obj FROM Pessoa obj WHERE obj.cpf =:cpf")
	Pessoa findByCPF(@Param("cpf")String cpf);
}
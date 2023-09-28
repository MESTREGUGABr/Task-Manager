package com.tskm.taskmanager.dados;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tskm.taskmanager.negocio.basico.Funcionario;

@Repository
public interface InterfaceColecaoFuncionario extends JpaRepository<Funcionario,Long>{
}

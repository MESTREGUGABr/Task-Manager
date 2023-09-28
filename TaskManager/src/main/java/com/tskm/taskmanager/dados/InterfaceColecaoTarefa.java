package com.tskm.taskmanager.dados;

import com.tskm.taskmanager.negocio.basico.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface InterfaceColecaoTarefa extends JpaRepository<Tarefa,Long> {
}

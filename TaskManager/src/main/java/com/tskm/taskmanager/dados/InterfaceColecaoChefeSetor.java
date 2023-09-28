package com.tskm.taskmanager.dados;

import com.tskm.taskmanager.negocio.basico.ChefeSetor;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface InterfaceColecaoChefeSetor extends JpaRepository<ChefeSetor, Long> {
}

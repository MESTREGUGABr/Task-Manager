package com.tskm.taskmanager.dados;

import com.tskm.taskmanager.negocio.basico.Enum.Cargo;
import com.tskm.taskmanager.negocio.basico.Enum.EstadoAtual;
import com.tskm.taskmanager.negocio.basico.Funcionario;
import com.tskm.taskmanager.negocio.basico.Tarefa;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class InterfaceColecaoTarefaTeste {

    Cargo carg = Cargo.FUNCIONARIO;
    EstadoAtual estd = EstadoAtual.NAOINICIADA;
    private Date datateste;
    @Autowired
    private InterfaceColecaoTarefa colecaoTarefa;
    @Autowired
    private InterfaceColecaoFuncionario colecaoFuncionario;



    void cadastroTarefa(){

        long qtdTarefa = colecaoTarefa.count();

        Tarefa taf = new Tarefa("Titulo","descricao",datateste,estd,);
        colecaoTarefa.save(taf);
        long qtdTarefa1 = colecaoTarefa.count();

        assertEquals(qtdTarefa1, qtdTarefa + 1);
    }

}

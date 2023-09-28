package com.tskm.taskmanager.dados;

import com.tskm.taskmanager.negocio.basico.Enum.Cargo;
import com.tskm.taskmanager.negocio.basico.Enum.EstadoAtual;
import com.tskm.taskmanager.negocio.basico.Funcionario;
import com.tskm.taskmanager.negocio.basico.Tarefa;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class InterfaceColecaoTarefaTeste {

    EstadoAtual estd = EstadoAtual.EXECUTANDO;
    Cargo carg = Cargo.FUNCIONARIO;
    Date dataTeste = new Date();
    @Autowired
    private InterfaceColecaoTarefa colecaoTarefa;
    @Autowired
    private InterfaceColecaoFuncionario colecaoFuncionario;



    @Test
    void cadastroTarefa(){

        long qtdTarefa = colecaoTarefa.count();
        Funcionario func = new Funcionario(carg,"teste@gmail.com","123456","Nome Fake");
        Tarefa taf = new Tarefa("Alteração no banco","alt",dataTeste,estd,func);
        colecaoTarefa.save(taf);
        long qtdTarefa1 = colecaoTarefa.count();

        assertEquals(qtdTarefa1, qtdTarefa + 1);
    }

}

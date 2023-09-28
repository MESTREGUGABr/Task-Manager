package com.tskm.taskmanager.dados;

import com.tskm.taskmanager.negocio.basico.Enum.Cargo;
import com.tskm.taskmanager.negocio.basico.Funcionario;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class InterfaceColecaoFuncionarioTeste {
    Cargo carg = Cargo.FUNCIONARIO;

    @Autowired
    private InterfaceColecaoFuncionario colecaoFuncionario;

    @Test
    void cadastroFuncionario(){
        long qtdFuncionario = colecaoFuncionario.count();
        Funcionario fun = new Funcionario(carg,"paloma@gmail.com","12345","Paloma Martins");
        colecaoFuncionario.save(fun);
        long qtdFuncionario1 = colecaoFuncionario.count();

        assertEquals(qtdFuncionario+1,qtdFuncionario1);
    }
}

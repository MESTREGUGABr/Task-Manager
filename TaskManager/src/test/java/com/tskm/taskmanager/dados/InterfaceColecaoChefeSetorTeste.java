package com.tskm.taskmanager.dados;

import com.tskm.taskmanager.negocio.basico.ChefeSetor;
import com.tskm.taskmanager.negocio.basico.Enum.Cargo;
import com.tskm.taskmanager.negocio.basico.Funcionario;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class InterfaceColecaoChefeSetorTeste {

    @Autowired
    private InterfaceColecaoChefeSetor colecaoChefeSetor;
    Cargo carg = Cargo.CHEFESETOR;
    @Test
    void criaChefeSetor(){
        long qtdChefe = colecaoChefeSetor.count();
        ChefeSetor chefe = new ChefeSetor(carg,"eribeatriz@gmail.com","27052023","Érica Beatriz");
        colecaoChefeSetor.save(chefe);
        long qtdChefe1 = colecaoChefeSetor.count();

        assertEquals(qtdChefe+1,qtdChefe1);
    }
}

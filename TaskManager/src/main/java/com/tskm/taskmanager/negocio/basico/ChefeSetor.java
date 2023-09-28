package com.tskm.taskmanager.negocio.basico;

import com.tskm.taskmanager.negocio.basico.Enum.Cargo;
import jakarta.persistence.*;

import java.util.List;
import java.util.Date;
import java.util.ArrayList;

@Entity
public class ChefeSetor extends Usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "chefeSetor") // Relação OneToMany com Funcionários
    private List<Funcionario> funcionarios = new ArrayList<>();

    public ChefeSetor(){
        super();
    }


    public ChefeSetor(Cargo cargo, String email, String senha, String nome){
        super(cargo,email,senha,nome);
    }

    public long getId(){
        return id;
    }

    public void setId(long Id){
        this.id = id;
    }
}

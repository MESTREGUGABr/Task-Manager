package com.tskm.taskmanager.negocio.basico;

import com.tskm.taskmanager.negocio.basico.Enum.Cargo;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

@Entity
public class Funcionario extends Usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne // Relação ManyToOne com ChefeSetor
    private ChefeSetor chefeSetor;

    @OneToMany(mappedBy = "funcionario") // Relação OneToMany com Tarefas
    private List<Tarefa> tarefas = new ArrayList<>();

    public Funcionario(){
        super();
    }

    public Funcionario(Cargo cargo, String email, String senha, String nome){
        super(cargo,email,senha,nome);
    }

    public void setId(long id) {
        this.id = id;
    }

}

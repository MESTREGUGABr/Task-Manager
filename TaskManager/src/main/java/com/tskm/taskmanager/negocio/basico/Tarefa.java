package com.tskm.taskmanager.negocio.basico;

import java.util.Date;

import com.tskm.taskmanager.negocio.basico.Enum.EstadoAtual;
import jakarta.persistence.*;

@Entity
@Table(name="tarefa")
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private String descricao;
    private Date validade;
    private EstadoAtual estado;

    @ManyToOne // Relação ManyToOne com Funcionario
    private Funcionario funcionario;

    public Tarefa(){
        super();
    }
    public Tarefa(String titulo, String descricao, Date validade, EstadoAtual estado, Funcionario funcionario) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.validade = validade;
        this.estado = estado;
        this.funcionario = funcionario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public EstadoAtual getEstado() {
        return estado;
    }

    public void setEstado(EstadoAtual estado) {
        this.estado = estado;
    }

}

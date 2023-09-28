package com.tskm.taskmanager.negocio.basico;

import jakarta.persistence.*;

import java.util.Date;
import com.tskm.taskmanager.negocio.basico.Enum.Cargo;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Cargo cargo;
    private String email;
    private String senha;
    private String nome;

    public Usuario(){

    }

    public Usuario(Cargo cargo, String email, String senha, String nome) {
        this.cargo = cargo;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}

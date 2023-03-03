package com.example.listadealunos;

public class Aluno {
    public String nome;
    public String morada;
    public String email;

    public Aluno() {
        nome = " ";
        morada = " ";
        email = " ";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  nome;
    }
}

package models;

public class FuncionarioModel {
    private String nome;
    private int id;

    public FuncionarioModel(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }
}
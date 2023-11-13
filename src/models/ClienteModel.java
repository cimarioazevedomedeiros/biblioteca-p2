package models;

public class ClienteModel {
    private String nome;
    private int id;

    public ClienteModel(String nome, int id) {
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

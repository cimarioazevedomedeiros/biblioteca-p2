package models;

public class VisitanteModel {
    private String nome;
    private int id;

    public VisitanteModel(String nome, int id) {
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
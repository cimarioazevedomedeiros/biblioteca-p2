package models;

public class LivroModel {
    private String nome;
    private int qntPaginas;
    private boolean emprestado;
    private int id;

    public LivroModel(String titulo, int id) {
        this.nome = titulo;
        this.id = id;
        this.emprestado = false;
    }

    public String getNome() {
        return nome;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQntPaginas() {
        return qntPaginas;
    }

    public void setQntPaginas(int qntPaginas) {
        this.qntPaginas = qntPaginas;
    }
}

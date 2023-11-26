package controllers;

import models.ClienteModel;
import models.FuncionarioModel;
import models.LivroModel;
import views.BibliotecaView;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaController {
    private List<ClienteModel> clienteModels;
    private List <FuncionarioModel> funcionarioModels;
    private List<LivroModel> livros;
    private List<ClienteModel> clientesComLivrosEmprestados;
    private BibliotecaView view;

    public BibliotecaController() {
        this.clienteModels = new ArrayList<>();
        this.livros = new ArrayList<>();
        this.clientesComLivrosEmprestados = new ArrayList<>();
        this.view = new BibliotecaView();
    }

    public void adicionarCliente(String nome) {
        int novoId = clienteModels.size() +1;
        ClienteModel novoClienteModel = new ClienteModel(nome, novoId);
        clienteModels.add(novoClienteModel);
    }

    public void adicionarFuncionario(String nome) {
        int novoId = funcionarioModels.size() +1;
        FuncionarioModel novoFuncionarioModel = new FuncionarioModel(nome, novoId);
        funcionarioModels.add(novoFuncionarioModel);
    }

    public void adicionarLivro(String titulo) {
        int novoId = livros.size() + 1;
        LivroModel novoLivro = new LivroModel(titulo, novoId);
        livros.add(novoLivro);
    }

    public void emprestarLivro(int idLivro, int idCliente) {
        LivroModel livro = procurarLivroPorId(idLivro);
        ClienteModel clienteModel = procurarClientePorId(idCliente);

        if (livro != null && clienteModel != null && !livro.isEmprestado()) {
            livro.setEmprestado(true);
            clientesComLivrosEmprestados.add(clienteModel);
        }
    }

    public List<LivroModel> getLivros() {
        return this.livros;
    }

    public List<ClienteModel> getClientes() {
        return this.clientesComLivrosEmprestados;
    }

    private LivroModel procurarLivroPorId(int id) {
        return livros.stream().filter(livro -> livro.getId() == id).findFirst().orElse(null);
    }

    private ClienteModel procurarClientePorId(int id) {
        return clienteModels.stream().filter(clienteModel -> clienteModel.getId() == id).findFirst().orElse(null);
    }

    private FuncionarioModel procurarFuncionarioPorId(int id) {
        return funcionarioModels.stream().filter(funcionarioModel -> funcionarioModel.getId() == id).findFirst().orElse(null);
    }
}

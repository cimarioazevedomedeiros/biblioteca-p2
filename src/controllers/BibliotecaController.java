package controllers;

import models.ClienteModel;
import models.FuncionarioModel;
import models.LivroModel;
import models.VisitanteModel;
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

    public void adicionarVisitante(String nome) {
        int novoId = visitanteModels.size() +1;
        VisitanteModel novovisitanteModel = new VisitanteModel(nome, novoId);
        visitanteModels.add(novoVisitanteModel);
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

    public static void main(String[] args) {
        BibliotecaController bibliotecaController = new BibliotecaController();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à biblioteca!");

    while (true) {
                System.out.println("Escolha uma opção:");
                System.out.println("1. Cadastrar Cliente");
                System.out.println("2. Cadastrar Visitante");
                System.out.println("3. Sair");

                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.println("Digite o nome do cliente:");
                        String nomeCliente = scanner.next();
                        bibliotecaController.adicionarUsuario(nomeCliente);
                        break;
                    case 2:
                        System.out.println("Digite o nome do visitante:");
                        String nomeVisitante = scanner.next();
                        bibliotecaController.adicionarVisitante(nomeVisitante);
                        break;
                    case 3:
                        System.out.println("Saindo...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
    }
}

package views;

import models.ClienteModel;
import models.LivroModel;
import models.FuncionarioModel;

import java.util.List;

public class BibliotecaView {
    public void mostrarLivros(List<LivroModel> livros) {
        System.out.println("Livros:");
        for (LivroModel livro : livros) {
            String status = livro.isEmprestado() ? "Emprestado" : "Disponível";
            System.out.println("ID: " + livro.getId() + ", Título: " + livro.getNome() + ", Status: " + status);
        }
        System.out.println();
    }

    public void mostrarClientes(List<ClienteModel> clientes) {
        System.out.println("Clientes:");
        for (ClienteModel cliente : clientes) {
            System.out.println("ID: " + cliente.getId() + ", Nome: " + cliente.getNome());
        }
        System.out.println();
    }

    public void mostrarFuncionarios(List<FuncionarioModel> funcionarios) {
        System.out.println("Funcionários:");
        for (FuncionarioModel funcionario : funcionarios) {
            System.out.println("ID: " + funcionario.getId() + ", Nome: " + funcionario.getNome());
        }
        System.out.println();
    }

    public void mostrarClientesComLivrosEmprestados(List<ClienteModel> clientes) {
        System.out.println("Clientes com livros emprestados:");
        for (ClienteModel cliente : clientes) {
            System.out.println("ID: " + cliente.getId() + ", Nome: " + cliente.getNome());
        }
        System.out.println();
    }
}

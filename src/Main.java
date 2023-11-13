import controllers.BibliotecaController;
import views.BibliotecaView;

public class Main {
    public static void main(String[] args) {
        BibliotecaController controller = new BibliotecaController();
        BibliotecaView view = new BibliotecaView();

        controller.adicionarCliente("João");
        controller.adicionarCliente("Maria");

        controller.adicionarLivro("Java Programming");
        controller.adicionarLivro("Design Patterns");

        controller.emprestarLivro(1, 1);
        controller.emprestarLivro(2, 2);

        view.mostrarClientesComLivrosEmprestados(controller.getClientes());
        view.mostrarLivros(controller.getLivros());
}
}
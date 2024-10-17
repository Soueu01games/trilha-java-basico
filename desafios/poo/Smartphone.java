
// Interface para Reprodutor Musical
interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

// Interface para Aparelho Telefônico
interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

// Interface para Navegador na Internet
interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}
// Classe Smartphone implementando todas as funcionalidades
public class Smartphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos do Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // Implementação dos métodos do Aparelho Telefônico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz.");
    }

    // Implementação dos métodos do Navegador na Internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();

        // Testando os métodos do Reprodutor Musical
        smartphone.selecionarMusica("Imagine - John Lennon");
        smartphone.tocar();
        smartphone.pausar();

        // Testando os métodos do Aparelho Telefônico
        smartphone.ligar("123-4567");
        smartphone.atender();
        smartphone.iniciarCorreioVoz();

        // Testando os métodos do Navegador na Internet
        smartphone.exibirPagina("https://www.dio.me");
        smartphone.adicionarNovaAba();
        smartphone.atualizarPagina();
    }
}
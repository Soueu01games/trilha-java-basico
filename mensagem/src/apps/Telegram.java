package apps;
public class Telegram extends ServicoMensagemInstantanea{
    //Jeito herdado  e abstraído
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    } 
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Telegram\n");
    }
}

/*Jeito arcaico
public class Telegram {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Telegram");
        System.out.println();

    }
    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagen");
    }
}
*/
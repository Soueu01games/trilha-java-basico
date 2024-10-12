public class FacebookMenssenger extends ServicoMensagemInstantanea{
    //Jeito herdado  e abstraído
    public void enviarMensagem(){
        System.out.println("Enviando mensagem pelo Facebook");
    } 
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Facebook");
    }
}

/*Jeito arcaico
public class FacebookMenssenger {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Facebook");
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
public class MSNMenssenger extends ServicoMensagemInstantanea{
    //Jeito herdado  
}

/*Jeito arcaico
public class MSNMenssenger {
    public void enviarMensagem(){
        System.out.println();
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo MSN");
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
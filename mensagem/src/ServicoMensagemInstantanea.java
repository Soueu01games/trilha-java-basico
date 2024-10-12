public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    
    /*Sem abstrair
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem\n");
    }

    private void validarConectadoInternet(){
        System.out.println("\nValidando se está conectado a internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico de mensagens");
    }
    */
}
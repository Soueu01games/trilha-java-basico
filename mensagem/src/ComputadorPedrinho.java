import apps.FacebookMenssenger;
import apps.MSNMenssenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args){
    ServicoMensagemInstantanea smi = null; 
    //Não sabe o app, mas tem que enviar e receber

    String appEscolhido="fcb";

    if(appEscolhido.equals("msn"))
        smi = new MSNMenssenger();
    else if(appEscolhido.equals("fcb")) 
        smi = new FacebookMenssenger();
    else if(appEscolhido.equals("tlg"))
        smi = new  Telegram();  

    smi.enviarMensagem();
    smi.receberMensagem();
    }

    /*Código antes do polimorfismo
    public static void main(String[]args){
        System.out.println("\nMSN:");
        MSNMenssenger msn = new MSNMenssenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("\nFacebook:");
        FacebookMenssenger fcb = new FacebookMenssenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println("\nTelegram:");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
        System.out.println();
    }
        */
}

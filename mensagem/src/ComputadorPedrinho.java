public class ComputadorPedrinho {
//O mesmo código é feito 3 vezes em 3 arquivo, isso não é prático
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
}

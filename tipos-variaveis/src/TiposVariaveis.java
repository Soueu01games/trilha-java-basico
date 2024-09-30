
public class TiposVariaveis {

    public static void main(String[] args) {
        String primeiroNome = "Emanuela";
        String segundoNome = "Helena";
        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
        // final determina uma CONSTANTE e deve ser escrita no CAPS_LOCK
        // variáveis de Float e Long deve terminar com F e L respectivamente
    }
}


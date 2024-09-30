public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        
        // Modificar o volume
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        // Ligar a TV
        smartTv.ligar();
        System.out.println("Novo status: TV Ligada? " + smartTv.ligada);

        // Aumentar o canal
        smartTv.aumentarCanal();
        System.out.println("Canal Atual: " + smartTv.canal);

        // Diminuir o canal
        smartTv.diminuirCanal();
        System.out.println("Canal Atual: " + smartTv.canal);

        //Mudar o Canal
        smartTv.mudarCanal();
        System.out.println("Canal Atual: " + smartTv.canal);
    }
}
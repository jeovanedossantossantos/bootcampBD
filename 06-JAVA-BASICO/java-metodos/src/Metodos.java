public class Metodos {
    public static void main(String[] args) throws Exception {
        SmartTV tv = new SmartTV();
        tv.setLigada(true);

        System.out.println("Esta ligada? " + tv.getLigada());

        tv.setCanal(5);

        System.out.println("Qual canal? " + tv.getCanal());

        System.out.println("Qual o volume? " + tv.getVolume());

        tv.aumentarVolume();

        System.out.println("Qual o volume? " + tv.getVolume());
        tv.aumentarVolume();

        System.out.println("Qual o volume? " + tv.getVolume());
        tv.diminuirVolume();

        System.out.println("Qual o volume? " + tv.getVolume());

        tv.setLigada(false);

        System.out.println("Esta ligada? " + tv.getLigada());
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Carro carro = new Carro("Fusca", "M2", 1970, "Azul", 4, 140);

        System.out.println(carro.getModelo());
        System.out.println(carro.getAno());
        System.out.println(carro.getCor());
        System.out.println(carro.getQuntMarcha());
        System.out.println(carro.getAtualMarcha());

        carro.setLigado(true);
        carro.aumentarMarcha();
        System.out.println(carro.getAtualMarcha());

        carro.setVelocidade(30);
        System.out.println(carro.getVelocidade());

        carro.aumentarMarcha();
        System.out.println(carro.getAtualMarcha());

        carro.setVelocidade(60);
        System.out.println(carro.getVelocidade());

        carro.aumentarMarcha();
        System.out.println(carro.getAtualMarcha());

        carro.setVelocidade(100);
        System.out.println(carro.getVelocidade());

        carro.aumentarMarcha();
        System.out.println(carro.getAtualMarcha());

        carro.setVelocidade(140);
        System.out.println(carro.getVelocidade());

        carro.aumentarMarcha();
        System.out.println(carro.getAtualMarcha());

        carro.setVelocidade(150);
        System.out.println(carro.getVelocidade());

    }
}

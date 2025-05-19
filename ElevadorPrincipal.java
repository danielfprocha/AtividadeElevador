public class ElevadorPrincipal {
    public static void main(String[] args) {
        Elevador elevador = new Elevador();
        elevador.inicializar(5, 10);

        elevador.entrar();
        elevador.subir();

        System.out.println("Andar atual: " + elevador.getAndarAtual());
        System.out.println("Pessoas no elevador: " + elevador.getQuantidadePessoas());
    }
}

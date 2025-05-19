public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int quantidadePessoas;

    public Elevador() {
        this.andarAtual = 0;
        this.quantidadePessoas = 0;
    }

    public void inicializar(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.quantidadePessoas = 0;
    }

    public void entrar() {
        if (quantidadePessoas < capacidade) {
            quantidadePessoas++;
        } else {
            System.out.println("Elevador cheio. Não é possível adicionar mais pessoas.");
        }
    }

    public void sair() {
        if (quantidadePessoas > 0) {
            quantidadePessoas--;
        } else {
            System.out.println("O elevador está vazio.");
        }
    }

    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        } else {
            System.out.println("O elevador já está no último andar.");
        }
    }

    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
        } else {
            System.out.println("O elevador já está no térreo.");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }
}

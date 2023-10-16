import java.util.Random;

public class Veiculo {
    private int velocidade;
    private int distancia;

    public Veiculo() {
        this.velocidade = 0;
        this.distancia = 0;
    }

    public void atualizarVelocidade() {
        Random random = new Random();
        this.velocidade = random.nextInt(3) + 1; // Gera um número aleatório entre um e tres
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void mover() {
        this.distancia += this.velocidade;
    }

    public int getDistancia() {
        return this.distancia;
    }
}

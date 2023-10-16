public class SimuladorCorrida {
    private static final int DISTANCIA_MAXIMA = 20;

    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo();
        Veiculo veiculo2 = new Veiculo();

        while (veiculo1.getDistancia() < DISTANCIA_MAXIMA && veiculo2.getDistancia() < DISTANCIA_MAXIMA) {
            veiculo1.atualizarVelocidade();
            veiculo2.atualizarVelocidade();

            veiculo1.mover();
            veiculo2.mover();

            // Mostrar a corrida na tela (usando espaços em branco para representar a distância)
            System.out.println("--------------------");
            System.out.println(" ".repeat(veiculo1.getDistancia()) + "#"); // "# (" + veiculo1.getVelocidade() + ")");
            System.out.println(" ".repeat(veiculo2.getDistancia()) + "#"); // "# (" + veiculo2.getVelocidade() + ")");
            System.out.println("--------------------");
            System.out.println("");

            try {
                Thread.sleep(100); // Aguarda 1 segundo antes de atualizar a tela
            } catch (InterruptedException e) {
                e.printStackTrace();
                //é uma chamada a um método que geralmente é usado para imprimir informações sobre uma exceção (um erro) que ocorreu em seu programa.
            }
        }

        // Determinar o vencedor
        if (veiculo1.getDistancia() >= DISTANCIA_MAXIMA && veiculo2.getDistancia() >= DISTANCIA_MAXIMA) {
            System.out.println("Empate!");
        } else if (veiculo1.getDistancia() >= DISTANCIA_MAXIMA) {
            System.out.println("Veículo 1 venceu!");
        } else {
            System.out.println("Veículo 2 venceu!");
        }
    }
}
package furacao;

public class RPM {

    public double calcularRPM(double velocidadeDeCorte, double diametro) {
        // Fórmula: RPM = (Vc * 1000) / (π * D)
        return (velocidadeDeCorte * 1000) / (Math.PI * diametro);
    }

}

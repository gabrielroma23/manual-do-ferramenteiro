package materiais;

import java.util.HashMap;
import java.util.Map;

public class Materiais {
    private Map<String, Map<String, Double>> mapaMateriais;

    public Materiais() {
        // Inicializa o mapa de materiais com valores predefinidos
        mapaMateriais = new HashMap<>();
        inicializarMateriais();
    }

    // Método para inicializar os materiais e suas velocidades de corte
    private void inicializarMateriais() {
        // Inicializa os valores de corte para diferentes ferramentas e materiais
        Map<String, Double> velocidadesHSS = new HashMap<>();
        velocidadesHSS.put("Aço Carbono (C<0,45%)", 25.0);
        velocidadesHSS.put("Aço Carbono (C>0,45%)", 20.0);
        velocidadesHSS.put("Aço inoxidável", 10.0);
        velocidadesHSS.put("Aço ferramenta", 7.0);

        Map<String, Double> velocidadesMetalDuro = new HashMap<>();
        velocidadesMetalDuro.put("Aço Carbono (C<0,45%)", 70.0);
        velocidadesMetalDuro.put("Aço Carbono (C>0,45%)", 60.0);
        velocidadesMetalDuro.put("Aço inoxidável", 40.0);
        velocidadesMetalDuro.put("Aço ferramenta", 25.0);

        mapaMateriais.put("Aço Rápido (HSS)", velocidadesHSS);
        mapaMateriais.put("Metal duro", velocidadesMetalDuro);
    }

    // Obtém a velocidade de corte para um material específico e uma ferramenta específica
    public double getVelocidadeDeCorte(String materialFerramenta, String materialPeca) {
        Map<String, Double> velocidades = mapaMateriais.get(materialFerramenta);
        if (velocidades != null) {
            return velocidades.getOrDefault(materialPeca, 0.0);
        }
        return 0.0;
    }
}

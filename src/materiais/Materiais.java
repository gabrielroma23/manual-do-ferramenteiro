package materiais;

import java.util.HashMap;
import java.util.Map;

public class Materiais {
    private Map<String, Double> mapaMateriaisFuracao;
    public Materiais(){
        mapaMateriaisFuracao = new HashMap<>();
    }
    public void inicializarMaterial(){
        mapaMateriaisFuracao.put("Aço Carbono (C < 0,45%)", 25.0 );
    }
}

package simon.projetos.pessoal.car.price_tracking.service.coleta;

import simon.projetos.pessoal.car.price_tracking.entity.Ano;
import simon.projetos.pessoal.car.price_tracking.entity.Veiculo;
import simon.projetos.pessoal.car.price_tracking.entity.Marca;
import simon.projetos.pessoal.car.price_tracking.entity.Modelo;

import java.util.List;
import java.util.Map;

public class FipeMockWrapper {
    private List<Marca> marcas;
    private Map<String, List<Modelo>> modelos;
    private Map<String, List<Ano>> anos;
    private Map<String, Veiculo> veiculos;

    public List<Marca> getMarcas() {
        return marcas;
    }

    public void setMarcas(List<Marca> marcas) {
        this.marcas = marcas;
    }

    public Map<String, List<Modelo>> getModelos() {
        return modelos;
    }

    public void setModelos(Map<String, List<Modelo>> modelos) {
        this.modelos = modelos;
    }

    public Map<String, List<Ano>> getAnos() {
        return anos;
    }

    public void setAnos(Map<String, List<Ano>> anos) {
        this.anos = anos;
    }

    public Map<String, Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Map<String, Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}

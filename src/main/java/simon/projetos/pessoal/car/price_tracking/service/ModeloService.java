package simon.projetos.pessoal.car.price_tracking.service;

import org.springframework.stereotype.Service;
import simon.projetos.pessoal.car.price_tracking.entity.Marca;
import simon.projetos.pessoal.car.price_tracking.entity.Modelo;
import simon.projetos.pessoal.car.price_tracking.entity.ModeloAno;
import simon.projetos.pessoal.car.price_tracking.repository.ModeloAnoRepository;
import simon.projetos.pessoal.car.price_tracking.repository.ModeloRepository;
import simon.projetos.pessoal.car.price_tracking.service.coleta.DataFetcher;
import simon.projetos.pessoal.car.price_tracking.service.coleta.JsonDataFetcher;

import java.util.List;

@Service
public class ModeloService {
    private final DataFetcher dataFetcher;
    private final ModeloRepository modeloRepository;

    public ModeloService() {
        dataFetcher = new JsonDataFetcher();
        modeloRepository = new ModeloRepository(gerarModelos());
    }

    private List<Modelo> gerarModelos(List<Marca> marcas) {
        return dataFetcher.getModelos(marcas);
    }

    public List<Modelo> getModelos() {
        return modeloRepository.getModelos();
    }
}

package simon.projetos.pessoal.car.price_tracking.service;

import org.springframework.stereotype.Service;
import simon.projetos.pessoal.car.price_tracking.entity.Marca;
import simon.projetos.pessoal.car.price_tracking.repository.MarcaRepository;
import simon.projetos.pessoal.car.price_tracking.service.coleta.DataFetcher;
import simon.projetos.pessoal.car.price_tracking.service.coleta.JsonDataFetcher;

import java.util.List;

@Service
public class MarcaService {
    private DataFetcher dataFetcher;
    private MarcaRepository marcaRepository;

    public MarcaService() {
        this.dataFetcher = new JsonDataFetcher();
        this.marcaRepository = new MarcaRepository(gerarMarcasDeCarros());
    }

    private List<Marca> gerarMarcasDeCarros() {
        return dataFetcher.getMarcasDeCarros();
    }

    public List<Marca> getMarcas(){
        return marcaRepository.getMarcas();
    }
}

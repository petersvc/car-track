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
    private final MarcaRepository marcaRepository;

    public MarcaService() {
        this.dataFetcher = new JsonDataFetcher();
        this.marcaRepository = new MarcaRepository();
        gerarMarcasDeCarros();
    }

    private void gerarMarcasDeCarros() {
//        return dataFetcher.getMarcasDeCarros();
        Marca marca1 = new Marca("001", "Fiat");
        Marca marca2 = new Marca("002", "Volkswagen");
        Marca marca3 = new Marca("003", "Chevrolet");
        marcaRepository.addMarca(marca1);
        marcaRepository.addMarca(marca2);
        marcaRepository.addMarca(marca3);
    }

    public List<Marca> getMarcas(){
        return marcaRepository.getMarcas();
    }

    public Marca getMarcaByCodigo(String codigo){
        for (Marca i : marcaRepository.getMarcas()) {
            if (i.getCodigo().equals(codigo)){
                return i;
            }
        }
        return null;
    }
}

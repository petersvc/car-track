package simon.projetos.pessoal.car.price_tracking.service;

import org.springframework.stereotype.Service;
import simon.projetos.pessoal.car.price_tracking.entity.Marca;
import simon.projetos.pessoal.car.price_tracking.repository.MarcaRepository;

import java.util.List;

@Service
public class MarcaService {
    private ApiService apiService;
    private MarcaRepository marcaRepository;

    public MarcaService() {
        this.apiService = new ApiService();
        this.marcaRepository = new MarcaRepository(gerarMarcasDeCarros());
    }

    private List<Marca> gerarMarcasDeCarros() {
        return apiService.getMarcasDeCarros();
    }

    public List<Marca> getMarcas(){
        return marcaRepository.getMarcas();
    }
}

package simon.projetos.pessoal.car.price_tracking.service;

import org.springframework.stereotype.Service;
import simon.projetos.pessoal.car.price_tracking.entity.Marca;
import simon.projetos.pessoal.car.price_tracking.entity.Modelo;
import simon.projetos.pessoal.car.price_tracking.entity.ModeloAno;
import simon.projetos.pessoal.car.price_tracking.repository.ModeloAnoRepository;

import java.util.List;

@Service
public class ModeloService {
    private final ApiService apiService;
    private final ModeloAnoRepository modeloAnoRepository;

    public ModeloService() {
        apiService = new ApiService();
        modeloAnoRepository = new ModeloAnoRepository(gerarModelos());
    }

    private List<ModeloAno> gerarModelos() {
        return apiService.getModelos();
    }

    public List<ModeloAno> getModelos() {
        return modeloAnoRepository.getModelos();
    }
}

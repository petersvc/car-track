package simon.projetos.pessoal.car.price_tracking.service;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import simon.projetos.pessoal.car.price_tracking.entity.Marca;
import simon.projetos.pessoal.car.price_tracking.entity.ModeloAno;
import simon.projetos.pessoal.car.price_tracking.repository.MarcaRepository;
import java.util.Comparator;
import java.util.List;

@Service
public class ApiService {
    RestTemplate restTemplate = new RestTemplate();
    private final String BASE_URL = "https://parallelum.com.br/fipe/api/v1";

    public List<Marca> getMarcasDeCarros() {
        String url = BASE_URL + "/carros/marcas";

        ResponseEntity<List<Marca>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Marca>>() {}
        );

        List<Marca> marcas = response.getBody();

        // Ordena pelo campo 'codigo' em ordem crescente
        if (marcas != null) {
            marcas.sort(Comparator.comparing(Marca::getNome));
        }

        return marcas;
    }

    public List<ModeloAno> getModelos() {
        return null;
//        String url = BASE_URL;
//
//        ResponseEntity<List<ModeloAno>> response = restTemplate.exchange(
//                url,
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<List<ModeloAno>>() {}
//        );
//
//        List<ModeloAno> modelos = response.getBody();
//
//        return modelos;
    }
}

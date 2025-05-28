package simon.projetos.pessoal.car.price_tracking.service.coleta;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import simon.projetos.pessoal.car.price_tracking.entity.*;
import simon.projetos.pessoal.car.price_tracking.service.coleta.wrapper.ModeloWrapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JsonDataFetcher implements DataFetcher {
    private final String filePath;
    private final ObjectMapper objectMapper = new ObjectMapper();

    public JsonDataFetcher() {
         this.filePath = "src/main/java/simon/projetos/pessoal/car/price_tracking/local_resources/";
     }


    @Override
    public List<Marca> getMarcasDeCarros() {
        try {
            File file = new File(filePath+"marcas.json");
            List<Marca> wrapper = objectMapper.readValue(file, new TypeReference<List<Marca>>(){});
            return wrapper;
        } catch (Exception e) {
            e.printStackTrace();
            return List.of();
        }
    }

    public Map<String, List<ModeloWrapper>> getModelosWrapped() {
        try {
            File file = new File(filePath+"modelos.json");
            Map<String, List<ModeloWrapper>> wrapper = objectMapper.readValue(file, new TypeReference<Map<String, List<ModeloWrapper>>>(){});
            return wrapper;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Modelo> getModelos(List<Marca> marcas) {
        List<Modelo> modelos = new ArrayList<>();
        Map<String, List<ModeloWrapper>> modelosPorMarca = getModelosWrapped();

        for (Map.Entry<String, List<ModeloWrapper>> entry : modelosPorMarca.entrySet()) {
            String codigoMarca = entry.getKey();
            List<ModeloWrapper> listaWrappers = entry.getValue();

            // Busca a marca correspondente
            Marca marca = marcas.stream()
                    .filter(m -> m.getCodigo().equals(codigoMarca))
                    .findFirst()
                    .orElse(null); // ou lançar exceção se marca for obrigatória

            if (marca != null) {
                for (ModeloWrapper wrapper : listaWrappers) {
                    Modelo modelo = new Modelo();
                    modelo.setMarca(marca);
                    modelo.setCodigo(wrapper.getCodigo());
                    modelo.setNome(wrapper.getNome());
                    modelos.add(modelo);
                }
            }
        }

        return modelos;
    }
}

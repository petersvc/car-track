package simon.projetos.pessoal.car.price_tracking.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;
import simon.projetos.pessoal.car.price_tracking.entity.Marca;
import simon.projetos.pessoal.car.price_tracking.entity.ModeloAno;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Repository
public class ModeloAnoRepository {
    List<ModeloAno> modelos;

    public void addModelo(ModeloAno modeloAno) {
        modelos.add(modeloAno);
    }

    public List<ModeloAno> getByMarca(Marca marca){
//        List<ModeloAno> modelos = new ArrayList<>();
//        for (ModeloAno modeloAno : modelos) {
//            if (modeloAno.getMarca().equals(marca)) {
//                modelos.add(modeloAno);
//            }
//        }
//        return modelos;
        return null;
    }
}

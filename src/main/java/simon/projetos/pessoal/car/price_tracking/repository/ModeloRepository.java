package simon.projetos.pessoal.car.price_tracking.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;
import simon.projetos.pessoal.car.price_tracking.entity.Modelo;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Repository
public class ModeloRepository {
    List<Modelo> modelos = new ArrayList<>();

    public void addModelo(Modelo modelo) {
        modelos.add(modelo);
    }
}

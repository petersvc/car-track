package simon.projetos.pessoal.car.price_tracking.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;
import simon.projetos.pessoal.car.price_tracking.entity.Modelo;
import simon.projetos.pessoal.car.price_tracking.entity.Veiculo;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Repository
public class VeiculoRepository {
    List<Veiculo> veiculos = new ArrayList<>();

    public void add(Veiculo veiculo) {
        veiculos.add(veiculo);
    }
}

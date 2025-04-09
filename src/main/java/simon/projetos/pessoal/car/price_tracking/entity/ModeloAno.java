package simon.projetos.pessoal.car.price_tracking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModeloAno {
    private Marca marca;
    private Ano ano;
    private Modelo modelo;
}

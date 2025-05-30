package simon.projetos.pessoal.car.price_tracking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Modelo {
    private Marca marca;
    private String codigo;
    private String nome;
}

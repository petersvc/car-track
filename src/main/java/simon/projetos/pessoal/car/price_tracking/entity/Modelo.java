package simon.projetos.pessoal.car.price_tracking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import simon.projetos.pessoal.car.price_tracking.service.MarcaService;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Modelo {
    private Marca marca;
    private String codigo;
    private String nome;
}

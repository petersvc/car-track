package simon.projetos.pessoal.car.price_tracking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo {
    private String CodigoFipe;
    private Modelo Modelo;
    private Integer Ano;
    private String Combustivel;
    private String SiglaCombustivel;
    private Integer TipoVeiculo;
    private BigDecimal Valor;
    private String MesReferencia;
}

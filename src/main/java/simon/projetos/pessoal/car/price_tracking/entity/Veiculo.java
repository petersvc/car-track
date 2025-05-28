package simon.projetos.pessoal.car.price_tracking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo {
    private String TipoVeiculo;
    private String Valor;
    private Modelo Modelo;
    private String Ano;
    private String Combustivel;
    private String CodigoFipe;
    private String MesReferencia;
    private String SiglaCombustivel;
}

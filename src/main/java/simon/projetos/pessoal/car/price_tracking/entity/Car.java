package simon.projetos.pessoal.car.price_tracking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String TipoVeiculo;
    private String Valor;
    private Marca Marca;
    private Modelo Modelo;
    private Ano AnoModelo;
    private String Combustivel;
    private String CodigoFipe;
    private String MesReferencia;
    private String SiglaCombustivel;
}

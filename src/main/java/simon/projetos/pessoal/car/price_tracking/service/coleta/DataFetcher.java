package simon.projetos.pessoal.car.price_tracking.service.coleta;

import simon.projetos.pessoal.car.price_tracking.entity.Marca;
import simon.projetos.pessoal.car.price_tracking.entity.Modelo;

import java.util.List;

public interface DataFetcher {
    List<Marca> getMarcasDeCarros();

    List<Modelo> getModelos(List<Marca> marcas);
}

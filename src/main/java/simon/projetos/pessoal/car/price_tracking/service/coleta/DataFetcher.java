package simon.projetos.pessoal.car.price_tracking.service.coleta;

import simon.projetos.pessoal.car.price_tracking.entity.*;

import java.io.IOException;
import java.util.List;

public interface DataFetcher {
    List<Marca> getMarcasDeCarros();

    List<Modelo> getModelos(List<Marca> marcas);
}

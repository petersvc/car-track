package simon.projetos.pessoal.car.price_tracking.service;

import org.springframework.stereotype.Service;
import simon.projetos.pessoal.car.price_tracking.entity.Veiculo;
import simon.projetos.pessoal.car.price_tracking.repository.VeiculoRepository;
import simon.projetos.pessoal.car.price_tracking.service.coleta.DataFetcher;
import simon.projetos.pessoal.car.price_tracking.service.coleta.JsonDataFetcher;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class VeiculoService {
    private final ModeloService modeloService;
    private final VeiculoRepository veiculoRepository;
    private final DataFetcher dataFetcher;

    public VeiculoService(ModeloService modeloService) {
        this.modeloService = modeloService;
        this.veiculoRepository = new VeiculoRepository();
        this.dataFetcher = new JsonDataFetcher();
        gerarVeiculosIniciais();
    }

    private void gerarVeiculosIniciais(){
        veiculoRepository.add(new Veiculo("0010010", modeloService.getModeloByCodigo("1001"),
                2022, "Gasolina", "G", 1, new BigDecimal("42500.00"), "maio de 2024"));

        veiculoRepository.add(new Veiculo("0010011", modeloService.getModeloByCodigo("1001"),
                2021, "Gasolina", "G", 1, new BigDecimal("41000.00"), "maio de 2024"));

        veiculoRepository.add(new Veiculo("0010012", modeloService.getModeloByCodigo("1001"),
                2020, "Gasolina", "G", 1, new BigDecimal("39700.00"), "maio de 2024"));

        veiculoRepository.add(new Veiculo("0010020", modeloService.getModeloByCodigo("1002"),
                2022, "Flex", "F", 1, new BigDecimal("45500.00"), "maio de 2024"));

        veiculoRepository.add(new Veiculo("0010021", modeloService.getModeloByCodigo("1002"),
                2021, "Flex", "F", 1, new BigDecimal("44000.00"), "maio de 2024"));

        veiculoRepository.add(new Veiculo("0010022", modeloService.getModeloByCodigo("1002"),
                2020, "Flex", "F", 1, new BigDecimal("42600.00"), "maio de 2024"));

        veiculoRepository.add(new Veiculo("0020010", modeloService.getModeloByCodigo("2001"),
                2022, "Gasolina", "G", 1, new BigDecimal("48000.00"), "maio de 2024"));

        veiculoRepository.add(new Veiculo("0020011", modeloService.getModeloByCodigo("2001"),
                2021, "Gasolina", "G", 1, new BigDecimal("46500.00"), "maio de 2024"));

        veiculoRepository.add(new Veiculo("0020012", modeloService.getModeloByCodigo("2001"),
                2020, "Gasolina", "G", 1, new BigDecimal("45200.00"), "maio de 2024"));

        veiculoRepository.add(new Veiculo("0020020", modeloService.getModeloByCodigo("2002"),
                2022, "Flex", "F", 1, new BigDecimal("51500.00"), "maio de 2024"));

        veiculoRepository.add(new Veiculo("0020021", modeloService.getModeloByCodigo("2002"),
                2021, "Flex", "F", 1, new BigDecimal("50000.00"), "maio de 2024"));

        veiculoRepository.add(new Veiculo("0020022", modeloService.getModeloByCodigo("2002"),
                2020, "Flex", "F", 1, new BigDecimal("48600.00"), "maio de 2024"));

        veiculoRepository.add(new Veiculo("0030010", modeloService.getModeloByCodigo("3001"),
                2022, "Gasolina", "G", 1, new BigDecimal("53000.00"), "maio de 2024"));

        veiculoRepository.add(new Veiculo("0030011", modeloService.getModeloByCodigo("3001"),
                2021, "Gasolina", "G", 1, new BigDecimal("51500.00"), "maio de 2024"));

        veiculoRepository.add(new Veiculo("0030012", modeloService.getModeloByCodigo("3001"),
                2020, "Gasolina", "G", 1, new BigDecimal("50000.00"), "maio de 2024"));

        veiculoRepository.add(new Veiculo("0030020", modeloService.getModeloByCodigo("3002"),
                2022, "Flex", "F", 1, new BigDecimal("49000.00"), "maio de 2024"));

        veiculoRepository.add(new Veiculo("0030021", modeloService.getModeloByCodigo("3002"),
                2021, "Flex", "F", 1, new BigDecimal("47500.00"), "maio de 2024"));

        veiculoRepository.add(new Veiculo("0030022", modeloService.getModeloByCodigo("3002"),
                2020, "Flex", "F", 1, new BigDecimal("46200.00"), "maio de 2024"));
    }
    public List<Veiculo> getVeiculos(){
        return veiculoRepository.getVeiculos();
    }

    public List<Veiculo> getVeiculoByModeloCodigoid(String codigo){
        List<Veiculo> veiculosRetorno = new ArrayList<>();
        for (Veiculo veiculo : veiculoRepository.getVeiculos()) {
            if (veiculo.getModelo().getCodigo().equals(codigo)){
                veiculosRetorno.add(veiculo);
            }
        }
        return veiculosRetorno;
    }
}

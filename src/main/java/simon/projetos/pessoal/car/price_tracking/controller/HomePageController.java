package simon.projetos.pessoal.car.price_tracking.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import simon.projetos.pessoal.car.price_tracking.entity.Ano;
import simon.projetos.pessoal.car.price_tracking.entity.Marca;
import simon.projetos.pessoal.car.price_tracking.entity.Modelo;
import simon.projetos.pessoal.car.price_tracking.entity.ModeloAno;
import simon.projetos.pessoal.car.price_tracking.repository.ModeloAnoRepository;
import simon.projetos.pessoal.car.price_tracking.service.ApiService;
import simon.projetos.pessoal.car.price_tracking.service.MarcaService;
import simon.projetos.pessoal.car.price_tracking.service.ModeloService;

import java.util.ArrayList;
import java.util.List;

// Criar um metodo para marcas selecionadas
// Buscar por anos por marca selecionada
// Buscar por modelos por ano selecionado
// Mostra os dados dos modelos daquele ano

@RestController
public class HomePageController {
    MarcaService marcaService;
    ModeloService modeloService;
    ModeloAnoRepository modeloRepository;

    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView model = new ModelAndView("index");
//        marcaService = new MarcaService();
//        modeloService = new ModeloService();

        List<Marca> marcas = gerarMarcasPadrao();
//        List<Marca> marcas = marcaService.getMarcas();
        model.addObject("marcas", marcas);

//        List<ModeloAno> modelos = gerarModelosPadrao();
//        List<ModeloAno> modelos = ModeloService.getModelos();
//        model.addObject("modelos", modelos);

        return model;
    }

    private List<Marca> gerarMarcasPadrao(){
        Marca marca = new Marca("59", "VW - VolksWagen");
        List<Marca> marcas = new ArrayList<>();
        marcas.add(marca);
        return marcas;
    }

    private List<ModeloAno> gerarModelosPadrao(Marca marca){
        Modelo modelo1 = new Modelo("1", "teste_modelo1");
        Modelo modelo2 = new Modelo("2", "teste_modelo2");
        Modelo modelo3 = new Modelo("3", "teste_modelo3");
        Ano ano1 = new Ano("1", "teste_ano1");
        Ano ano2 = new Ano("2", "teste_ano2");
        Ano ano3 = new Ano("3", "teste_ano3");

        List<ModeloAno> modelos = new ArrayList<>();
        modelos.add(new ModeloAno(marca, ano1, modelo1));
        modelos.add(new ModeloAno(marca, ano2, modelo1));
        modelos.add(new ModeloAno(marca, ano3, modelo1));
        modelos.add(new ModeloAno(marca, ano1, modelo2));
        modelos.add(new ModeloAno(marca, ano2, modelo2));
        modelos.add(new ModeloAno(marca, ano3, modelo2));
        modelos.add(new ModeloAno(marca, ano1, modelo3));
        modelos.add(new ModeloAno(marca, ano2, modelo3));
        modelos.add(new ModeloAno(marca, ano3, modelo3));
        return modelos;
    }
}

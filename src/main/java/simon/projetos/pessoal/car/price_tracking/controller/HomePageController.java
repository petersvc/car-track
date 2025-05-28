package simon.projetos.pessoal.car.price_tracking.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import simon.projetos.pessoal.car.price_tracking.entity.Marca;
import simon.projetos.pessoal.car.price_tracking.entity.Modelo;
import simon.projetos.pessoal.car.price_tracking.service.MarcaService;
import simon.projetos.pessoal.car.price_tracking.service.ModeloService;

import java.util.List;

// Criar um metodo para marcas selecionadas
// Buscar por anos por marca selecionada
// Buscar por modelos por ano selecionado
// Mostra os dados dos modelos daquele ano

@RestController
public class HomePageController {
    MarcaService marcaService = new MarcaService();
    ModeloService modeloService = new ModeloService(marcaService);

    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView model = new ModelAndView("index");

        List<Marca> marcas = marcaService.getMarcas();
        model.addObject("marcas", marcas);

        List<Modelo> modelos = modeloService.getModelos();
        model.addObject("modelos", modelos);

        return model;
    }
    @GetMapping("/modelos/{codigoMarca}")
    public ResponseEntity<List<Modelo>> getModelosByMarca(@PathVariable String codigoMarca) {
        List<Modelo> modelos = modeloService.getModelosByMarcaCodigo(codigoMarca);
        return ResponseEntity.ok(modelos);
    }
}

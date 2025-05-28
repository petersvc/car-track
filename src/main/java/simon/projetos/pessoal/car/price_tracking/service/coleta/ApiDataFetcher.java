package simon.projetos.pessoal.car.price_tracking.service.coleta;

//@Service
//public class ApiDataFetcher implements DataFetcher {
//    RestTemplate restTemplate = new RestTemplate();
//    private final String BASE_URL = "https://parallelum.com.br/fipe/api/v1";
//
//    public List<Marca> getMarcasDeCarros() {
//        String url = BASE_URL + "/carros/marcas";
//
//        ResponseEntity<List<Marca>> response = restTemplate.exchange(
//                url,
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<List<Marca>>() {}
//        );
//
//        List<Marca> marcas = response.getBody();
//
//        // Ordena pelo campo 'codigo' em ordem crescente
//        if (marcas != null) {
//            marcas.sort(Comparator.comparing(Marca::getNome));
//        }
//
//        return marcas;
//    }
//
//    public List<ModeloAno> getModelos() {
//        return null;
////        String url = BASE_URL;
////
////        ResponseEntity<List<ModeloAno>> response = restTemplate.exchange(
////                url,
////                HttpMethod.GET,
////                null,
////                new ParameterizedTypeReference<List<ModeloAno>>() {}
////        );
////
////        List<ModeloAno> modelos = response.getBody();
////
////        return modelos;
//    }
//
//    @Override
//    public List<Ano> getAnos() {
//        return null;
//    }
//
//    @Override
//    public Car getVeiculo() {
//        return null;
//    }
//
//    @Override
//    public List<Car> getVeiculos() {
//        return null;
//    }
//}

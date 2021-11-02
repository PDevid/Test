package fabrick.appFabrick.controller;

import fabrick.appFabrick.model.Conto;
import fabrick.appFabrick.repository.ContoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    ContoRepository contoRepository;

    @PostMapping("saveConto")
    public void saveConto(@RequestBody Conto conto) {
        contoRepository.save(conto);
    }

    @GetMapping("getConto")
    public Conto getConto() {
        return (Conto) contoRepository.findAll();
    }


}

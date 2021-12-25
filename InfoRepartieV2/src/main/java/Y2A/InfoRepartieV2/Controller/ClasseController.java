package Y2A.InfoRepartieV2.Controller;

import Y2A.InfoRepartieV2.Service.Classe.IClasseService;
import Y2A.InfoRepartieV2.models.Classe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClasseController {

    @Autowired
    private IClasseService classeService;

    @GetMapping("/Classe")
    public Classe Classe(@RequestParam int id) {
        return classeService.findById(id).get();
    }
}

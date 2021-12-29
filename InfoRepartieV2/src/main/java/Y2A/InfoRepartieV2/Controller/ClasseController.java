package Y2A.InfoRepartieV2.Controller;

import Y2A.InfoRepartieV2.Service.Classe.IClasseService;
import Y2A.InfoRepartieV2.models.Classe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/classe")
public class ClasseController {

    @Autowired
    private IClasseService classeService;

    @GetMapping(value = "/all")
    public Iterable<Classe> getAllClasses() {
        return classeService.getAllClasses();
    }
}

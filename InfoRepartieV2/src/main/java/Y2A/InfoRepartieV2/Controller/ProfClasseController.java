package Y2A.InfoRepartieV2.Controller;

import Y2A.InfoRepartieV2.Service.ProfClasse.IProfClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/profclasse")
public class ProfClasseController {

    @Autowired
    private IProfClasseService profClasseService;
}

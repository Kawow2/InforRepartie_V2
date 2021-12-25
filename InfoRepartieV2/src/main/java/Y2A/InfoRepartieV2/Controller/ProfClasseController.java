package Y2A.InfoRepartieV2.Controller;

import Y2A.InfoRepartieV2.Service.ProfClasse.IProfClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfClasseController {

    @Autowired
    private IProfClasseService profClasseService;
}

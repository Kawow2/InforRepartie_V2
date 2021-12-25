package Y2A.InfoRepartieV2.Controller;

import Y2A.InfoRepartieV2.Service.Etudiant.IEtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EtudiantController {
    @Autowired
    private IEtudiantService etudiantService;
}

package Y2A.InfoRepartieV2.Controller;


import Y2A.InfoRepartieV2.Service.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntrepriseController {

    @Autowired
    private EntrepriseService entrepriseService;

    @GetMapping("/hello")
    public String hello() {
        return entrepriseService.findById(1).get().toString();
    }
}

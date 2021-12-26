package Y2A.InfoRepartieV2.Controller;

import Y2A.InfoRepartieV2.Service.Specialite.SpecialiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/specialite")
public class SpecialiteController {

    @Autowired
    private SpecialiteService specialiteService;
}

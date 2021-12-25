package Y2A.InfoRepartieV2.Controller;

import Y2A.InfoRepartieV2.Service.Stage.IStageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StageController {

    @Autowired
    private IStageService stageService;
}

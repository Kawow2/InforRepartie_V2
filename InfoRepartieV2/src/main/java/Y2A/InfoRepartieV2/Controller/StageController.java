package Y2A.InfoRepartieV2.Controller;

import Y2A.InfoRepartieV2.Service.Stage.IStageService;
import Y2A.InfoRepartieV2.models.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/stage")
public class StageController {

    @Autowired
    private IStageService stageService;

    @PostMapping(value = "/create")
    public Stage CreateStage(@RequestBody Stage stage) {
        return stageService.createStage(stage);
    }

    @GetMapping(value = "/bynumentreprise/{id}")
    public Iterable<Stage> GetStageByNumentreprise(@PathVariable int id) {
        return stageService.getStagesFromEntreprise(id);
    }
}

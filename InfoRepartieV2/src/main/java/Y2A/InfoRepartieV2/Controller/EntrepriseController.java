package Y2A.InfoRepartieV2.Controller;

import Y2A.InfoRepartieV2.Service.Entreprise.IEntrepriseService;
import Y2A.InfoRepartieV2.Service.Mission.IMissionService;
import Y2A.InfoRepartieV2.Service.SpecEntreprise.ISpecEntrepriseService;
import Y2A.InfoRepartieV2.Service.Stage.IStageService;
import Y2A.InfoRepartieV2.models.Entreprise;
import Y2A.InfoRepartieV2.models.Mission;
import Y2A.InfoRepartieV2.models.Output.EntrepriseEtSpec;
import Y2A.InfoRepartieV2.models.SpecEntreprise;
import Y2A.InfoRepartieV2.models.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/entreprise")
public class EntrepriseController {

    @Autowired
    private IEntrepriseService entrepriseService;
    @Autowired
    private ISpecEntrepriseService specEntrepriseService;
    @Autowired
    private IStageService stageService;
    @Autowired
    private IMissionService missionService;

    @GetMapping(value = "/all")
    public Iterable<Entreprise> getAllEntreprise() {
        return entrepriseService.getAllEntreprise();
    }

    @PostMapping(value = "/create")
    public Entreprise createEntreprise(@RequestBody Entreprise ent) {
        this.specEntrepriseService.deleteSpecFromEntreprise(ent.getNumEntreprise());
        return entrepriseService.createEntreprise(ent);
    }

    @DeleteMapping(value = "/{id}")
    public int deleteEntreprise(@PathVariable int id) {
        var stages = stageService.getStagesFromEntreprise(id);
        ArrayList<Integer> missions = new ArrayList<>();
        ArrayList<Integer> stagesIds = new ArrayList<>();
        for (Stage s : stages) {
            var list = (missionService.getMissionsFromStage(s.getNumStage()));
            for (Mission m : list) {
                missions.add(m.getNumMission());
            }
            stagesIds.add(s.getNumStage());
        }
        missionService.deleteMissionsFromStage(missions);
        stageService.deleteStageFromEnterprise(stagesIds);
        specEntrepriseService.deleteSpecFromEntreprise(id);
        return entrepriseService.deleteEntreprise(id);
    }


    @GetMapping(value = "/{id}")
    public EntrepriseEtSpec getEntreprise(@PathVariable int id) {

        EntrepriseEtSpec entrepriseEtSpec = this.entrepriseService.findEntrepriseAndSpecById(id);

        Iterable<SpecEntreprise> specEntreprises = this.specEntrepriseService.findAllByNumEntreprise(entrepriseEtSpec.getEntreprise().get().getNumEntreprise());
        entrepriseEtSpec.setSpecEntreprises(specEntreprises);

        return entrepriseEtSpec;
    }

}

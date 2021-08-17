package louisefethienzo.projetgroupe.groupeController;

import louisefethienzo.projetgroupe.groupeEntity.GroupeEntity;
import louisefethienzo.projetgroupe.groupeService.GroupeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GroupeController {
    @Autowired
    GroupeService groupeService;
    @GetMapping("afficherLesMembres")
    public List<GroupeEntity> displayMembers() {
        List<GroupeEntity> members = new ArrayList<>();
        displayMembers().add(new GroupeEntity("louise"));
        displayMembers().add(new GroupeEntity("enzo"));
        displayMembers().add(new GroupeEntity("fethi"));
        return members;
    }



}

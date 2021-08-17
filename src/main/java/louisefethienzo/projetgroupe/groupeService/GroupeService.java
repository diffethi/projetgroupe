package louisefethienzo.projetgroupe.groupeService;

import louisefethienzo.projetgroupe.groupeEntity.GroupeEntity;
import louisefethienzo.projetgroupe.groupeRepository.GroupeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class GroupeService {
    @Autowired
    GroupeRepository groupeRepository;
    public List<GroupeEntity> getMembers(){
        return groupeRepository.findAll();
    }
    public void addMember(GroupeEntity newMember) {
        groupeRepository.save(newMember);
    }

}

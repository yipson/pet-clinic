package guru.springframework.petclinic.services.map;

import guru.springframework.petclinic.model.Visit;
import guru.springframework.petclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
@Profile({"default", "map"})
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return null;
    }

    @Override
    public Visit findById(Long id) {
        return null;
    }

    @Override
    public Visit save(Visit visit) {

        if(visit.getPet() == null ||
                visit.getPet().getOwner() == null ||
                visit.getPet().getId() == null ||
                visit.getPet().getOwner().getId() == null){
            throw new RuntimeException("Invalid Visit ");
        }

        return super.save(visit);
    }

    @Override
    public void delete(Visit object) {

    }

    @Override
    public void deleteById(Long id) {

    }
}

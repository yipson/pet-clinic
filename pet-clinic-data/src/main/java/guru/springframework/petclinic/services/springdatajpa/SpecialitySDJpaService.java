package guru.springframework.petclinic.services.springdatajpa;

import guru.springframework.petclinic.model.Speciality;
import guru.springframework.petclinic.repositories.SpecialityReposiatory;
import guru.springframework.petclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialityService {

    private final SpecialityReposiatory specialityReposiatory;

    public SpecialitySDJpaService(SpecialityReposiatory specialityReposiatory) {
        this.specialityReposiatory = specialityReposiatory;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityReposiatory.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityReposiatory.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityReposiatory.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialityReposiatory.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityReposiatory.deleteById(aLong);
    }
}

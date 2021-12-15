package guru.springframework.petclinic.repositories;

import guru.springframework.petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityReposiatory extends CrudRepository<Speciality, Long> {
}

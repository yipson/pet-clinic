package guru.springframework.petclinic.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {

    @Column(name = "name")
    private String name;

    @ManyToOne
    //this pet have a type
    @JoinColumn(name = "type_id")
    private PetType petType;

    @ManyToOne
    //many pets could below to one owner
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @Column(name = "birth_date")
    private LocalDate birhtDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    //One pet could have many visits
    private Set<Visit> visits = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirhtDate() {
        return birhtDate;
    }

    public void setBirhtDate(LocalDate birhtDate) {
        this.birhtDate = birhtDate;
    }
}

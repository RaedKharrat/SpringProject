package Entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.Set;
import java.util.HashSet;
import jakarta.persistence.ManyToMany;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
@ToString
public class Reservation{
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReservation;
    private Date anneeUniversitaire;
    private Boolean estValide;



    @ManyToMany
    @JoinTable(name = "reservation_etudiant",
            joinColumns = @JoinColumn(name = "reservation_id"),
            inverseJoinColumns = @JoinColumn(name = "etudiant_id")
    )
    private Set<Etudiant> etudiants = new HashSet<>();
}

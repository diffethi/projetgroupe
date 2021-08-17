package louisefethienzo.projetgroupe.groupeEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GroupeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nom;

    public GroupeEntity() {

    }

    public GroupeEntity(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "GroupeEntity{" +
                "nom='" + nom + '\'' +
                '}';
    }
}

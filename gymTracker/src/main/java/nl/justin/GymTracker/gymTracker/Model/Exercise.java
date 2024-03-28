package nl.justin.GymTracker.gymTracker.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Justin Lamberts
 * Purpose for the class
 **/
@Entity
public class Exercise {
    @Id @GeneratedValue
    private String naam;
    private int gewicht;
    private int reps;

    public Exercise(String naam, int gewicht, int reps) {
        this.naam = naam;
        this.gewicht = gewicht;
        this.reps = reps;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public Exercise() {

    }
}

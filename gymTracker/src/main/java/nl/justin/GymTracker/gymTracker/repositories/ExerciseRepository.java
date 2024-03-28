package nl.justin.GymTracker.gymTracker.repositories;

import nl.justin.GymTracker.gymTracker.Model.Exercise;
import nl.justin.GymTracker.gymTracker.Model.Machine;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Justin Lamberts
 * Purpose for the class
 **/
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}

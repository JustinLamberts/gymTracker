package nl.justin.GymTracker.gymTracker.Controller;

import nl.justin.GymTracker.gymTracker.repositories.ExerciseRepository;
import nl.justin.GymTracker.gymTracker.repositories.MachineRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

/**
 * @author Justin Lamberts
 * Purpose for the class
 **/

@Controller
public class CopyController {
    private final ExerciseRepository exerciseRepository;
    private final MachineRepository machineRepository;


    public CopyController(ExerciseRepository exerciseRepository, MachineRepository machineRepository) {
        this.exerciseRepository = exerciseRepository;
        this.machineRepository = machineRepository;
    }

    @GetMapping("/Exercise/new/{bookId}")
    private String createNewCopy(@PathVariable("bookId") Long bookId) {
        Optional<Book> optionalBook = bookRepository.findById(bookId);

        if (optionalBook.isPresent()) {
            Copy copy = new Copy();
            copy.setBook(optionalBook.get());
            copyRepository.save(copy);
        }

        return "redirect:/";
    }
}
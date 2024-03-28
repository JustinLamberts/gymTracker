package nl.justin.GymTracker.gymTracker.Controller;

import nl.justin.GymTracker.gymTracker.Model.Exercise;
import nl.justin.GymTracker.gymTracker.Model.Machine;
import nl.justin.GymTracker.gymTracker.repositories.ExerciseRepository;
import nl.justin.GymTracker.gymTracker.repositories.MachineRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Justin Lamberts
 * Purpose for the class
 **/

@Controller
public class GymTrackerController {
    private final MachineRepository machineRepository;

    public GymTrackerController(MachineRepository machineRepository) {
        this.machineRepository = machineRepository;
    }

    @GetMapping("/")
    private String showgymOverview(Model model) {

        model.addAttribute("allMachines", machineRepository.findAll());

        return "gymOverview";
    }

    @GetMapping("/exercise/new")
    private String showexerciseForm(Model model) {
        model.addAttribute("book", new excercise());

        return "bookForm";
    }

    @PostMapping("/exercise/new")
    private String saveExercise(@ModelAttribute("Exercise") Exercise exercisetobesaved, BindingResult result) {
        if (!result.hasErrors()) {
            ExerciseRepository.save(exercisetobesaved);
        }

        return "redirect:/";
    }
}

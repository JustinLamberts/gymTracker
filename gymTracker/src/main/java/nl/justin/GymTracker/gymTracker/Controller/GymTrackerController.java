package nl.justin.GymTracker.gymTracker.Controller;

import nl.justin.GymTracker.gymTracker.Model.Machine;
import nl.justin.GymTracker.gymTracker.repositories.MachineRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}

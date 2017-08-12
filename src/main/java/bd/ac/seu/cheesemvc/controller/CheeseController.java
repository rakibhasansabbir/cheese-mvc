package bd.ac.seu.cheesemvc.controller;

import bd.ac.seu.cheesemvc.models.Cheese;
import bd.ac.seu.cheesemvc.models.CheeseData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.ArrayList;

/**
 * Created by R@kib Hasan Sabbir
 */


@Controller
@RequestMapping("cheese")
public class CheeseController {


    // Request path: /cheese
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("List1", CheeseData.getAll());
        model.addAttribute("title", "My List");

        return "Cheese/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddCheeseForm(Model model) {
        model.addAttribute("title", "Add To List");
        model.addAttribute(new Cheese());
        return "Cheese/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddCheeseForm(@ModelAttribute @Valid  Cheese newCheese,Errors errors,Model model) {


        if(errors.hasErrors()){
            model.addAttribute("title", "Add To List");
            return "Cheese/add";
        }else

        CheeseData.add(newCheese);
        return "redirect:";
    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemoveCheeseForm(Model model) {
        model.addAttribute("List1", CheeseData.getAll());
        model.addAttribute("title", "Remove List");
        return "Cheese/remove";
    }

    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveCheeseForm(@RequestParam int[] cheeseIds) {

        for (int cheeseID : cheeseIds) {
            CheeseData.remove(cheeseID);
        }

        return "redirect:";
    }

}

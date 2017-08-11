package bd.ac.seu.cheesemvc.controller;

import bd.ac.seu.cheesemvc.models.Cheese;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by R@kib Hasan Sabbir
 */


@Controller
@RequestMapping("cheese")
public class CheeseController {

    static ArrayList<Cheese> AList1 = new ArrayList<>();

    // Request path: /cheese
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("List1", AList1);
        model.addAttribute("title", "My List");

        return "Cheese/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddCheeseForm(Model model) {
        model.addAttribute("title", "Add To List");
        return "Cheese/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddCheeseForm(@RequestParam String cheeseName,
                                       @RequestParam String cheeseID,
                                       @RequestParam String cheeseEmail) {
        Cheese newCheese = new Cheese(cheeseName,cheeseID,cheeseEmail);
        AList1.add(newCheese);
        return "redirect:";
    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemoveCheeseForm(Model model) {
        model.addAttribute("List1", AList1);
        model.addAttribute("title", "Remove List");
        return "Cheese/remove";
    }

    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveCheeseForm(@RequestParam ArrayList<String> cheese) {

        for (String aCheese : cheese) {
            AList1.remove(aCheese);
        }

        return "redirect:";
    }

}

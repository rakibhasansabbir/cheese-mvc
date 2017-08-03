package bd.ac.seu.cheesemvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by R@kib Hasan Sabbir
 */

@Controller
@RequestMapping("rakib")
public class CheeseController {

    @RequestMapping(value = "")
    public String index(Model model){
        model.addAttribute("title","Welcome Rakib Hasan");
        return "Cheese/index";
    }


}

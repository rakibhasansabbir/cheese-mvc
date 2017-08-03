package bd.ac.seu.cheesemvc.controller;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * Created by R@kib Hasan Sabbir
 */

@Controller
@RequestMapping("names")
public class CheeseController {
    static ArrayList<String> list1 = new ArrayList<>();


    @RequestMapping(value = "")
    public String index(Model model){


        model.addAttribute("name",list1);
        model.addAttribute("title","Welcome Rakib Hasan");
        return "Cheese/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddNamesFrom(Model model){
        model.addAttribute("title","Add Names");
        return "Cheese/add";

    }
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddNamesFrom(@RequestParam String names){

        list1.add(names);
        return "redirect:";
    }


}

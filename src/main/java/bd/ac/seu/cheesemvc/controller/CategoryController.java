package bd.ac.seu.cheesemvc.controller;

import bd.ac.seu.cheesemvc.models.Category;
import bd.ac.seu.cheesemvc.models.Cheese;
import bd.ac.seu.cheesemvc.models.data.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "category")
public class CategoryController {

    @Autowired
    private CategoryDao categoryDao;


    @RequestMapping(value = "")
    public String index(Model model){
        model.addAttribute("List1", categoryDao.findAll());
        model.addAttribute("title", "Category");
        return "Category/index";

    }

    @RequestMapping(value = "category", method = RequestMethod.GET)
    public String category(Model model,@RequestParam int Ids) {

        Category cat = categoryDao.findOne(Ids);
        List<Cheese> cheeses = cat.getCheeses();
        model.addAttribute("List1", cheeses);
        model.addAttribute("title", "Cheeses in Category: "+ cat.getName());
        return "Cheese/index";
    }
}

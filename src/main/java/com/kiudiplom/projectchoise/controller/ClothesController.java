package com.kiudiplom.projectchoise.controller;

import com.kiudiplom.projectchoise.entity.Clothes;
//import com.kiudiplom.projectchoise.entity.Order;
import com.kiudiplom.projectchoise.service.ClothesService;
//import com.kiudiplom.projectchoise.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@SessionAttributes("clothesService")
public class ClothesController {

    private final ClothesService clothesService;

    public ClothesController(ClothesService clothesService) {
        this.clothesService = clothesService;
    }


    @RequestMapping("/bascket")
        public String viewClothes(Model model){
        Iterable<Clothes> clothes = clothesService.findAll();
        model.addAttribute("clothes",clothes);
        return "bascket";
    }
}

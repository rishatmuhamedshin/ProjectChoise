package com.kiudiplom.projectchoise.controller;


import com.kiudiplom.projectchoise.entity.Clothes;
import com.kiudiplom.projectchoise.service.ClothesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MansController {

    private final ClothesService clothesService;

    public MansController(ClothesService clothesService) {
        this.clothesService = clothesService;
    }

    @GetMapping("/mans-outwear")
    public String manOutwearGet(Model model) {
        model.addAttribute("Clothes1",clothesService.findById(1L));
        model.addAttribute("Clothes2",clothesService.findById(2L));
        model.addAttribute("Clothes3",clothesService.findById(3L));
        model.addAttribute("Clothes4",clothesService.findById(4L));
        model.addAttribute("Clothes5",clothesService.findById(5L));
        model.addAttribute("Clothes6",clothesService.findById(6L));
        return "mans/outerwear";
    }

    @PostMapping("/mans-outwear/add/{name}")
    public String addClothes(
            @PathVariable String name
    ) {
        switch (name){
            case "Clothes1":
                clothesService.addProduct(clothesService.findById(1L));
                break;
            case "Clothes2":
                clothesService.addProduct(clothesService.findById(2L));
                break;
            case "Clothes3":
                clothesService.addProduct(clothesService.findById(3L));
                break;
            case "Clothes4":
                clothesService.addProduct(clothesService.findById(4L));
                break;
            case "Clothes5":
                clothesService.addProduct(clothesService.findById(5L));
                break;
            case "Clothes6":
                clothesService.addProduct(clothesService.findById(6L));
                break;
        }
        return "redirect:/mans-outwear";
    }

    @GetMapping("/mans-jacket")
    public String manJacketGet() {
        return "mans/jackets";
    }

    @GetMapping("/mans-shoes")
    public String manShoesGet() {
        return "mans/shoes";
    }

    @GetMapping("/mans-trouser")
    public String manTrousersGet() {
        return "mans/trousers";
    }

    @GetMapping("/mans-cardigan")
    public String manCardigansGet() {
        return "mans/cardigan";
    }


}

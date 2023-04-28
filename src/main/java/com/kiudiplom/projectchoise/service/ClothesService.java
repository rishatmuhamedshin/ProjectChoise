package com.kiudiplom.projectchoise.service;

import com.kiudiplom.projectchoise.entity.Clothes;
import com.kiudiplom.projectchoise.repository.ClothesRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Optional;

@Service
@SessionScope
public class ClothesService {

    private final ClothesRepository clothesRepository;
//    private final OrderService orderService;

    public ClothesService(ClothesRepository clothesRepository){
        this.clothesRepository = clothesRepository;
    }
    public Clothes findById(Long id){
        Optional<Clothes> clothes = clothesRepository.findById(id);
        return clothes.get();
    }
    public void addProduct(Clothes clothes) {
        clothesRepository.save(clothes);
    }
    public Iterable<Clothes> findAll(){
        return clothesRepository.findAll();
    }


}

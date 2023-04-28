package com.kiudiplom.projectchoise.repository;

import com.kiudiplom.projectchoise.entity.Clothes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClothesRepository extends CrudRepository<Clothes,Long> {
    @Override
    Optional<Clothes> findById(Long aLong);
}

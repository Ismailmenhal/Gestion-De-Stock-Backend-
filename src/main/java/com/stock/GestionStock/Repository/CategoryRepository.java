package com.stock.GestionStock.Repository;

import com.stock.GestionStock.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

  Optional<Category> findCategoryByCode(String code);

}
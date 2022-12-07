package edu.itplus.crud.repository;

import edu.itplus.crud.domain.Category;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Long> {

    List<Category> findByNameContaining(String name);
}

package pe.edu.idat.appwebventasidat.service;

import pe.edu.idat.appwebventasidat.model.bd.Category;
import pe.edu.idat.appwebventasidat.repository.CategoryRepository;

import java.util.List;

public class CategoryService {

    private CategoryRepository categoryRepository;

    public List<Category> categories(){
        return categoryRepository.findAll();
    }
}

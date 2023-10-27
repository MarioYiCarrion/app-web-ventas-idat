package pe.edu.idat.appwebventasidat.controller;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.idat.appwebventasidat.model.bd.Category;
import pe.edu.idat.appwebventasidat.service.CategoryService;

import java.util.List;

@NoArgsConstructor
@Controller
@RequestMapping("/backoffice/category")
public class CategoryController {
    private CategoryService categoryService;

    @GetMapping("/listar")
    @ResponseBody
    public List<Category> listarCategorias(){
        return categoryService.categories();
    }
}

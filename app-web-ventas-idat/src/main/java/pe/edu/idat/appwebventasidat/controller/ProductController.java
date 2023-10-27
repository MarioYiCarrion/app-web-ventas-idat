package pe.edu.idat.appwebventasidat.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.idat.appwebventasidat.model.bd.Product;
import pe.edu.idat.appwebventasidat.model.request.ProductRequest;
import pe.edu.idat.appwebventasidat.model.response.ResultadoResponse;
import pe.edu.idat.appwebventasidat.service.ProductService;

import java.util.List;

public class ProductController {

    private ProductService productService;

    @GetMapping("")
    public String frmMantProducto(Model model){
        model.addAttribute("listaproductos",
                productService.listarProductos());
        return "backoffice/product/frmproduct";
    }

    @GetMapping("/listar")
    @ResponseBody
    public List<Product> listarProductos(){
        return productService.listarProductos();
    }

    @PostMapping("/guardar")
    @ResponseBody
    public ResultadoResponse guadarProducto(@RequestBody ProductRequest productRequest){
        return productService.guardarProducto(productRequest);
    }


}

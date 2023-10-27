package pe.edu.idat.appwebventasidat.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.appwebventasidat.model.bd.Category;
import pe.edu.idat.appwebventasidat.model.bd.Product;
import pe.edu.idat.appwebventasidat.model.bd.Supplier;
import pe.edu.idat.appwebventasidat.model.request.ProductRequest;
import pe.edu.idat.appwebventasidat.model.response.ResultadoResponse;
import pe.edu.idat.appwebventasidat.repository.ProductRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class ProductService {


    private ProductRepository productRepository;

    public List<Product> listarProductos(){
        return  productRepository.findAll();
    }

    public ResultadoResponse guardarProducto(ProductRequest productRequest){
        String mensaje = "Producto resgitrado correctamente";
        Boolean respuesta = true;

        try{
            Product product = new Product();
            if(productRequest.getProductid() > 0){
                product.setProductID(productRequest.getProductid());
            }
            product.setProductName(productRequest.getProductname());
            product.setUnitPrice(productRequest.getUnitprice());
            Boolean disctinued = false;
            if(productRequest.getDiscontinued() != null){
                disctinued = true;
            }
            product.setDiscontinued(disctinued);

            Category category = new Category();
            category.setCategoryId(productRequest.getCategoryid());

            Supplier supplier = new Supplier();
            supplier.setSupplierID(productRequest.getSupplierid());

            product.setCategory(category);
            product.setSupplier(supplier);
            productRepository.save(product);
        } catch (Exception ex){
            mensaje ="Producto no registrado";
            respuesta = false;
        }
        return ResultadoResponse.builder().mensaje(mensaje).respuesta(respuesta).build();
    }

}

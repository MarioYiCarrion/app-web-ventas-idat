package pe.edu.idat.appwebventasidat.service;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.appwebventasidat.model.bd.Supplier;
import pe.edu.idat.appwebventasidat.repository.SupplierRepository;

import java.util.List;

@Service
@NoArgsConstructor
public class SupplierService {
    private SupplierRepository supplierRepository;

    public List<Supplier> listarProveerdores(){
        return supplierRepository.findAll();
    }

}

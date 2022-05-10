package com.gestion.productos.servicies;

import com.gestion.productos.models.ProductoModels;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ProductoServicies {
    public Iterable<ProductoModels>  findAll(String palabraClave);
    public Optional<ProductoModels> findById(Long id);
    public ProductoModels save(ProductoModels producto);
    public void deleteById(Long id);

}

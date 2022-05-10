package com.gestion.productos.servicies;

import com.gestion.productos.models.ProductoModels;
import com.gestion.productos.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiciesImp implements ProductoServicies {
    @Autowired
    private ProductoRepository repository;


    @Override
    public Iterable<ProductoModels> findAll(String palabraClave) {
        if (palabraClave != null) {
            return repository.findAll(palabraClave);
        }
        return repository.findAll();
    }

    @Override
    public Optional<ProductoModels> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public ProductoModels save(ProductoModels producto) {
        return repository.save(producto);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);

    }
}

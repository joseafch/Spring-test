package com.example.pringbacktest.CRUD.service;

import com.example.pringbacktest.CRUD.dto.ProductDto;
import com.example.pringbacktest.CRUD.entity.ProductEntity;
import com.example.pringbacktest.CRUD.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<ProductEntity> getAll(){
        return productRepository.findAll();
    }
    public ProductEntity getOne(int id){
        return productRepository.findById(id).get();
    }
    public ProductEntity save(ProductDto dto){
        //aqui guardaremos un nuevo producto
        int id = autoincrement();
        //hay que pasare un product
        ProductEntity product = new ProductEntity(id,dto.getSerialNum(),dto.getData(),dto.getModel(),dto.getManufacturer());

        return productRepository.save(product);
    }
    //private methods
    // Comparamos todos los id, optenemos el maximo y le sumamos uno
    private int autoincrement(){
        List<ProductEntity>product = productRepository.findAll();
        return product.isEmpty() ? 1 :
                product.stream().max(Comparator.comparing(ProductEntity::getId)).get().getId() +1;
    }
    public ProductEntity update(int id, ProductDto dto){
//optenemos todos los datos por id de producto, actualizamos y guardamos
        ProductEntity product = productRepository.findById(id).get();
        product.setSerialNum(dto.getSerialNum());
        product.setData(dto.getData());
        product.setModel(dto.getModel());
        product.setManufacturer(dto.getManufacturer());

        return productRepository.save(product);
    }
    public ProductEntity delete(int id){
      ProductEntity product = productRepository.findById(id).get();
      productRepository.delete(product);
      return product;
    }
}

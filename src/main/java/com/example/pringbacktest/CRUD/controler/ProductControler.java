package com.example.pringbacktest.CRUD.controler;

import com.example.pringbacktest.CRUD.dto.ProductDto;
import com.example.pringbacktest.CRUD.entity.ProductEntity;
import com.example.pringbacktest.CRUD.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductControler {

    @Autowired
    ProductService productService;
    @GetMapping
    public ResponseEntity<List<ProductEntity>> getAll(){
        return ResponseEntity.ok(productService.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductEntity> getOne(@PathVariable("id") int id){
        return ResponseEntity.ok(productService.getOne(id));
    }
    @PostMapping("/{id}")
    public ResponseEntity<ProductEntity> save(@RequestBody ProductDto dto ){
        return ResponseEntity.ok(productService.save(dto));
    }
    @PutMapping("/{id}")
    public ResponseEntity<ProductEntity> update(@PathVariable("id") int id,@RequestBody ProductDto dto){
        return ResponseEntity.ok(productService.update(id, dto));
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductEntity> delete(@PathVariable("id") int id){
        return ResponseEntity.ok(productService.delete(id));
    }

}

package edu.itplus.crud.controllerapi;

import edu.itplus.crud.domain.Product;
import edu.itplus.crud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product-api")
public class ProductControllerRest{
    @Autowired
    ProductRepository repository;
    @GetMapping("")
    public String homePage(){
        return "index";
    }

    @GetMapping("/get-all")
    public List<Product> getAll(){
        return repository.findAll();
    }
//    @GetMapping("/getById/{id}")
//    public Product getById(@PathVariable int id){
//        return repository.findById(id);
//    }
//    @PostMapping("/insert")
//    public ResponseEntity<ResponseObject> insert(@RequestBody Product product){
//        List<Product> productList = repository.findByName(product.getName().trim());
//        if (productList.size()>0){
//            return ResponseEntity.status(HttpStatus.ALREADY_REPORTED).body(
//                    new ResponseObject("Thất bại", "Tên danh mục đã tồn tại", product)
//            );
//        }
//        return ResponseEntity.status(HttpStatus.OK).body(
//                new ResponseObject("Thành công", "Thêm mới danh mục thành công!", repository.save(product))
//        );
//    }
//    @DeleteMapping("/delete/{id}")
//    public boolean deleteById(@PathVariable int id){
//        repository.deleteById(id);
//        return true;
//    }
//    @PutMapping("/update")
//    public boolean updateById(@RequestBody Product product){
//        repository.save(product);
//        return true;
//    }
}
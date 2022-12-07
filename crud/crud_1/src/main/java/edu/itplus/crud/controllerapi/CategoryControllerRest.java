package edu.itplus.crud.controllerapi;

import edu.itplus.crud.domain.Category;
import edu.itplus.crud.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category-api")
public class CategoryControllerRest {
    @Autowired
    CategoryRepository repository;

    @GetMapping("/get-all")
    public List<Category> getAll() {
        return repository.findAll();
    }
//    @PostMapping("/insert")
//    public ResponseEntity<ResponseObject> insert(@RequestBody Category category){
//        List<Category> categoryList = repository.findByName(category.getName().trim());
//        if (categoryList.size()>0){
//            return ResponseEntity.status(HttpStatus.ALREADY_REPORTED).body(
//                    new ResponseObject("Thất bại", "Tên danh mục đã tồn tại", category)
//            );
//        }
//        return ResponseEntity.status(HttpStatus.OK).body(
//                new ResponseObject("Thành công", "Thêm mới danh mục thành công!", repository.save(category))
//        );
//    }

//    @PostMapping("/insert")
//    public ResponseEntity<ResponseObject> insert(@RequestBody Category category,
//                                                 @RequestParam("image") MultipartFile multipartFile) throws IOException {
//        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
//        category.setPhotos(fileName);
//
//        Category savedCategory = repository.save(category);
//
//        String uploadDir = "category-photos/" + savedCategory.getId();
//
//        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
//
//        return ResponseEntity.status(HttpStatus.OK).body(
//                new ResponseObject("Thành công", "Thêm mới danh mục thành công!", repository.save(category))
//        );
//    }

//    @DeleteMapping("/delete/{id}")
//    public boolean deleteById(@PathVariable int id) {
//        repository.deleteById(id);
//        return true;
//    }
//
//    @PutMapping("/update")
//    public boolean updateById(@RequestBody Category category) {
//        repository.save(category);
//        return true;
//    }
}
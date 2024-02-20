package com.SaleCampaignManagementSystem.Controller;

import com.SaleCampaignManagementSystem.Model.Product;
import com.SaleCampaignManagementSystem.Model.dto.ProductDTO;
import com.SaleCampaignManagementSystem.Service.ProductService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("mystore")
@Tag(name = "Greeting", description = "Endpoints for greeting messages")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/add")
    public List<Product> add(@RequestBody List<Product> p){
        return productService.save(p);
    }

    @GetMapping("/get")
    public ProductDTO get(@RequestParam Integer page, Integer pageSize){
        return productService.get(page,pageSize);
    }

}

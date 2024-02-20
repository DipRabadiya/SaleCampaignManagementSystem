package com.SaleCampaignManagementSystem.Service;

import com.SaleCampaignManagementSystem.Model.Product;
import com.SaleCampaignManagementSystem.Model.dto.ProductDTO;
import com.SaleCampaignManagementSystem.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;

    public List<Product> save(List<Product> p) {
        return productRepo.saveAll(p);
    }

    public ProductDTO get(Integer page, Integer pageSize) {
        Page<Product> productPage = productRepo.findAll(PageRequest.of(page - 1, pageSize));

        List<Product> productList = productPage.getContent();
        int totalPage = ((Page<?>) productPage).getTotalPages();

        ProductDTO ans = new ProductDTO();
        ans.setProduct(productList);
        ans.setPage(page);
        ans.setTotalPage(totalPage);
        ans.setPageSize(pageSize);

        return ans;
    }
}


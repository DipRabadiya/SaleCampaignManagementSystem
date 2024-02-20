package com.SaleCampaignManagementSystem.Model.dto;

import com.SaleCampaignManagementSystem.Model.Product;
import lombok.Data;

import java.util.List;

@Data
public class ProductDTO {
    private List<Product> product;
    private Integer page;
    private Integer pageSize;
    private Integer totalPage;
}

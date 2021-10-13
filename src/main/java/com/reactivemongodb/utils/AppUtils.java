package com.reactivemongodb.utils;

import com.reactivemongodb.dto.ProductDto;
import com.reactivemongodb.entity.Product;
import org.springframework.beans.BeanUtils;

public class AppUtils {

    public static ProductDto productToDto(Product product){
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product,productDto);
        return productDto;
    }


    public static Product productDtoToProduct(ProductDto productDto){
        Product product = new Product();
        BeanUtils.copyProperties(productDto,product);
        return product;
    }


}

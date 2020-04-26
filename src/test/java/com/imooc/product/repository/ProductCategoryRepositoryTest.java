package com.imooc.product.repository;

import com.imooc.product.dataobject.ProductCategory;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest extends TestCase {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void testFindByCategoryTypeIn() {
        List<ProductCategory> productCategorieList = productCategoryRepository.findByCategoryTypeIn(Arrays.asList(11,22));
        Assert.assertTrue(productCategorieList.size()>0);
    }
}
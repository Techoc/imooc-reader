package cn.techoc.reader.service.impl;

import static org.junit.Assert.*;

import cn.techoc.reader.service.CategoryService;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CategoryServiceImplTest {
    @Resource
    private CategoryService categoryService;

    @Test
    public void selectAll() {
        System.out.println(categoryService.selectAll());
    }
}
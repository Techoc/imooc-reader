package cn.techoc.reader.service;

import cn.techoc.reader.entity.Category;
import java.util.List;

/**
 * 图书分类Service接口
 * @author vanilla
 */
public interface CategoryService {
    /**
     * 查询所有图书分类
     * @return 图书分类List
     */
    List<Category> selectAll();
}

package cn.techoc.reader.service.impl;

import cn.techoc.reader.entity.Category;
import cn.techoc.reader.mapper.CategoryMapper;
import cn.techoc.reader.service.CategoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author vanilla
 */
@Service("categoryService")
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> selectAll() {
        return categoryMapper.selectList(new QueryWrapper<>());
    }
}

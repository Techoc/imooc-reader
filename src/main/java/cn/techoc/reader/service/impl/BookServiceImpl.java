package cn.techoc.reader.service.impl;

import cn.techoc.reader.entity.Book;
import cn.techoc.reader.mapper.BookMapper;
import cn.techoc.reader.service.BookService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author vanilla
 */
@Service("BookService")
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;

    @Override
    public IPage<Book> paging(Integer page, Integer rows) {
        Page<Book> bookPage = new Page<>(page, rows);
        QueryWrapper<Book> queryWrapper = new QueryWrapper<>();
        return bookMapper.selectPage(bookPage, queryWrapper);
    }
}

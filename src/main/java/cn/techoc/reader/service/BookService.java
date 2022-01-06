package cn.techoc.reader.service;

import cn.techoc.reader.entity.Book;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 图书服务
 *
 * @author vanilla
 */
public interface BookService {
    /**
     * 分页查询图书
     *
     * @param page 页号
     * @param rows 每页记录数
     * @return 分页对象
     */
    public IPage<Book> paging(Integer page, Integer rows);

}

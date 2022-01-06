package cn.techoc.reader.service.impl;

import static org.junit.Assert.*;

import cn.techoc.reader.entity.Book;
import cn.techoc.reader.service.BookService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import java.util.List;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class BookServiceImplTest {
    @Resource
    private BookService bookService;

    @Test
    public void paging() {
        IPage<Book> paging = bookService.paging(1, 10);
        List<Book> bookList = paging.getRecords();
        for (Book book : bookList) {
            System.out.println(book.getBookId()+" "+book.getBookName());
        }
    }
}
package cn.techoc.reader.controller;

import cn.techoc.reader.entity.Category;
import cn.techoc.reader.service.CategoryService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 图书控制器
 *
 * @author vanilla
 */
@Controller
public class BookController {
    @Resource
    private CategoryService categoryService;

    /**
     * 显示首页
     * @return
     */
    @GetMapping("/")
    public ModelAndView showIndex() {
        ModelAndView mav = new ModelAndView("/index");
        List<Category> categoryList = categoryService.selectAll();
        mav.addObject("categoryList", categoryList);
        return mav;
    }
}

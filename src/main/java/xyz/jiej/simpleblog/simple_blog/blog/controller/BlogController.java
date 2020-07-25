package xyz.jiej.simpleblog.simple_blog.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.jiej.simpleblog.simple_blog.blog.bean.vo.BlogContentVo;
import xyz.jiej.simpleblog.simple_blog.blog.bean.vo.BlogListVo;
import xyz.jiej.simpleblog.simple_blog.blog.bean.vo.BlogVo;
import xyz.jiej.simpleblog.simple_blog.blog.service.BlogService;
import xyz.jiej.simpleblog.simple_blog.blog.service.impl.BlogServiceImpl;

import java.util.List;

/**
 * @description:
 * @author: TK
 * @time: 2020/7/6 10:48 上午
 */
@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    BlogService blogService;

    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    @ResponseBody
    public BlogListVo showAll() {
        List<BlogVo> list = blogService.findList();
        return blogService.showAll();
    }

    @RequestMapping(value = "/info", method = {RequestMethod.GET})
    @ResponseBody
    public BlogContentVo showInfo(@NonNull Integer id) {
        return blogService.showContent(id);
    }

}

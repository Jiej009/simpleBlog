package xyz.jiej.simpleblog.simple_blog.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.jiej.simpleblog.simple_blog.blog.bean.vo.BlogContentVo;
import xyz.jiej.simpleblog.simple_blog.blog.bean.vo.BlogListVo;
import xyz.jiej.simpleblog.simple_blog.blog.bean.vo.BlogVo;
import xyz.jiej.simpleblog.simple_blog.blog.entity.BlogContent;
import xyz.jiej.simpleblog.simple_blog.blog.service.BlogService;
import xyz.jiej.simpleblog.simple_blog.blog.dao.BlogDao;
import xyz.jiej.simpleblog.simple_blog.blog.entity.Blog;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: TK
 * @time: 2020/7/6 10:38 上午
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogDao blogDao;

    @Override
    public List<BlogVo> findList() {
        List<Blog> list = blogDao.findAll();
        List<BlogVo> blogVos = list.stream()
                .map(i -> new BlogVo(i))
                .collect(Collectors.toList());
        return blogVos;
    }

    @Override
    public BlogListVo showAll() {
        BlogListVo blogListVo = new BlogListVo();
        blogListVo.setList(findList());
        return blogListVo;
    }

    @Override
    public BlogContentVo showContent(Integer id) {
        BlogContent blogContent = blogDao.showContent(id);
        Blog blog = blogDao.findBlog(id);
        BlogContentVo vo = new BlogContentVo(blogContent);
        vo.setName(blog.getName());
        return vo;
    }
}

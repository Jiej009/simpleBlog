package xyz.jiej.simpleblog.simple_blog.blog.service;

import org.springframework.stereotype.Service;
import xyz.jiej.simpleblog.simple_blog.blog.bean.vo.BlogContentVo;
import xyz.jiej.simpleblog.simple_blog.blog.bean.vo.BlogListVo;
import xyz.jiej.simpleblog.simple_blog.blog.bean.vo.BlogVo;

import java.util.List;

/**
 * 博客service 接口
 */
@Service
public interface BlogService {

    List<BlogVo> findList(); // 暂时不考虑分页

    BlogListVo showAll();

    BlogContentVo showContent(Integer id);

}

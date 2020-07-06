package xyz.jiej.simpleblog.simple_blog.blog.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import xyz.jiej.simpleblog.simple_blog.blog.entity.Blog;
import xyz.jiej.simpleblog.simple_blog.blog.entity.BlogContent;

import java.util.List;

@Mapper
@Repository
public interface BlogDao {

    List<Blog> findAll();

    BlogContent showContent(Integer id);

    Blog findBlog(Integer id);
}

package xyz.jiej.simpleblog.simple_blog.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import xyz.jiej.simpleblog.simple_blog.entity.Blog;

import java.util.List;

@Mapper
public interface BlogDao {

    List<Blog> findAll();

    @Select({
            "select * from blog.blog where id = 1"
    })
    Blog find();

}

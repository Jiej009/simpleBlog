package xyz.jiej.simpleblog.simple_blog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.jiej.simpleblog.simple_blog.dao.BlogDao;
import xyz.jiej.simpleblog.simple_blog.entity.Blog;

import java.util.List;

@SpringBootTest
class SimpleBlogApplicationTests {

    @Autowired
    BlogDao blogDao;

    @Test
    void contextLoads() {
        List<Blog> all = blogDao.findAll();
        System.out.println(all);
    }

    @Test
    void test1() {
        Blog blog = blogDao.find();
        System.out.println(blog);
    }

}

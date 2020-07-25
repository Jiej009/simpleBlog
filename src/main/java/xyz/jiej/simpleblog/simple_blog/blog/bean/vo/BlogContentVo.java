package xyz.jiej.simpleblog.simple_blog.blog.bean.vo;

import org.springframework.beans.BeanUtils;
import xyz.jiej.simpleblog.simple_blog.blog.entity.Blog;
import xyz.jiej.simpleblog.simple_blog.blog.entity.BlogContent;

import java.sql.Timestamp;

/**
 * @description:
 * @author: TK
 * @time: 2020/7/6 11:14 上午
 */
public class BlogContentVo {

    private int id;
    private int blogId;
    private String name;
    private String content;
    private Timestamp updateTime;

    public BlogContentVo(BlogContent blogContent) {
        BeanUtils.copyProperties(blogContent, this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}

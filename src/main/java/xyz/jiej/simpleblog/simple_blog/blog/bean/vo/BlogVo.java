package xyz.jiej.simpleblog.simple_blog.blog.bean.vo;

import org.springframework.beans.BeanUtils;
import xyz.jiej.simpleblog.simple_blog.blog.entity.Blog;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @description:
 * @author: TK
 * @time: 2020/7/6 10:48 上午
 */
public class BlogVo implements Serializable {

    private int id;
    private String name;
    private int status;
    private Timestamp updateTime;

    public BlogVo(Blog blog) {
        BeanUtils.copyProperties(blog, this);
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}

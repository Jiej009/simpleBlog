-- 创建 博客表 --
create table blog (
    id int(10) unsigned not null AUTO_INCREMENT,
    name varchar(255) not null,
    status tinyint(4) not null,
    create_time timestamp not null default current_timestamp,
    update_time timestamp not null default current_timestamp,
    PRIMARY key (id)
) ENGINE=InnoDB AUTO_INCREMENT=167 DEFAULT CHARSET=utf8mb4 COMMENT '博客表';

insert into blog (id, name, status) value (1, '第一篇文章', 0);

-- 博客内容表 --
create table blog_content (
    id int(10) unsigned not null AUTO_INCREMENT,
    blog_id int(10) not null,
    content MEDIUMTEXT null,
    create_time timestamp not null default current_timestamp,
    update_time timestamp not null default current_timestamp,
    primary key (id)
) ENGINE=InnoDB AUTO_INCREMENT=167 DEFAULT CHARSET=utf8mb4 COMMENT '博客表内容';

insert into blog_content (id, blog_id, content) VALUES (1, 1, '第一篇文章的内容');

create table comment (
    id int(10) unsigned not null AUTO_INCREMENT,
    blog_id int(10) not null,
    comment varchar(1024) not null,
    create_time timestamp not null default current_timestamp,
    update_time timestamp not null default current_timestamp,
    primary key (id)
) ENGINE=InnoDB AUTO_INCREMENT=167 DEFAULT CHARSET=utf8mb4 COMMENT '评论';

insert into comment (id, blog_id, comment) VALUES (1, 1, '一个评论');

package com.offcn.dao;

import com.offcn.pojo.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * person：实体类型
 * Long:主键的类型
 */
//自定义请求路径
@RepositoryRestResource(path = "myperson")
//跨域配置  ：协议 域名  端口 值要由一个不一样就是跨域
@CrossOrigin(origins = "http://localhost:9015",allowCredentials = "true")//origins:允许哪个地址访问  allowCredentials:允许携带参数访问
public interface PersonDao extends JpaRepository<Person,Long> {

    //自定义请求方法，这样查询时要在myperson和findByNameIs之间加search
    //exported:隐藏方法不被外界访问到
    @RestResource(path="findByNameIs", exported=false)
    public Person findByNameIs(@Param("name")String name);




}

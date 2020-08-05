package com.offcn.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity //声明是jpa框架下的实体
@Table(name = "person")  //映射表的名称

@Data
@AllArgsConstructor  //有参构造
@NoArgsConstructor   //无参构造
public class Person implements Serializable {

    @Id
    @GeneratedValue //表示主键的生成方式，默认是自动递增的
   private Long id;
    @Column(name = "name",nullable =true,length = 40)
   private String name;
    @Column(name = "age",nullable = true,length = 10)
   private Integer age;
}

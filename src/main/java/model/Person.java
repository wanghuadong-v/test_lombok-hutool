package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
//快速的在类中定义日志变量
@Data
//@Getter @Setter @ToString
//只生成get set toSpring方法
//生成所有有参构造器
@AllArgsConstructor
//无参构造器
@NoArgsConstructor
//给get方法开启链式调用
@Accessors(chain = true)
public class Person {
    private String id;
    private String name;
    private Integer age;
    private String school;
}

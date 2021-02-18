package cn.jinzhu.algorithm.linear;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LinearTest {
    @Test
    public void LinearSearchTest1(){
        Integer[] date = Arraygenerator.generatorOrder(100000);


        System.out.println(LinearSearch.search(date, 100000));
    }
    @Test
    public void LinearSearchTest2(){
        Student[] date = {new Student("金柱"),new Student("金瀚")};

        System.out.println(LinearSearch.search(date, new Student("金瀚")));
    }
}

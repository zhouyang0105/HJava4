/**
 * projectName: Junit5Demo1104
 * fileName: Junit5Demo_1_1_Base.java
 * packageName: com.junit5.demo
 * date: 2020-11-04 8:40 下午
 */
package com.junit5.demo;

import com.util.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**Junit5注释
 * assertEquals(expected,actual) : 查看两个对象是否相等。类似于字符串比较实用的equals(）方法
 * assertNotEquals(expected,actual): 查看两个对象是否不相等。
 *
 * assertNull（Object） : 查看对象是否为空
 * assertNotNull（Object） :
 *
 * assertSame(expected,actual) : 查看两个对象的引用是否相等。类似使用"==" 比较两个对象
 * assertNotSame(expected,actual)
 *
 * assertTrue(condition) : 查看运行结果是否为true
 * assertNotTrue(condition) :
 *
 * assertArrayEquals(expected,actual) : 查看两个数组是否相等
 *
 * assertThat(actual,matcher) : 查看实际值是否满足指定条件。       引入第三方  借力 以插件方式引入
 *
 * fail() : 让测试失败
 *
 */

/**
 * @version: V1.0
 * @author: kuohai
 * @className: Junit5Demo_1_1_Base
 * @packageName: com.junit5.demo
 * @description: 基础脚本
 * @data: 2020-11-04 8:40 下午
 **/
public class Junit5Demo_2_1_Assert {
    @Test
    public void addTest(){
        int result = Calculator.add(4,2);
        System.out.println(result);
        assertEquals(6,result);
    }
    @Test
    public void subTractTest(){
        int result = Calculator.subtract(4,2);
        System.out.println(result);
        assertEquals(2,result);

    }
    @Test
    public void multiplyTest(){
        int result = Calculator.multiply(4,2);
        System.out.println(result);
        assertEquals(8,result);

    }
    @Test
    public void divideTest(){
        int result = Calculator.divide(4,2);
        System.out.println(result);
        assertEquals(2,result);

    }
    @Test
    public void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        System.out.println(result);
        assertEquals(4,result);

    }

}
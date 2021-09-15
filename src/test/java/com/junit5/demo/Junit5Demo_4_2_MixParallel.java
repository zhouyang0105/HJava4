/**
 * projectName: Junit5Demo
 * fileName: Fixtures.java
 * packageName: com.junit5
 * date: 2020-11-07 2:24 下午
 */
package com.junit5.demo;

import com.util.Calculator;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @version: V1.0
 * @author: kuohai
 * @className: Fixtures
 * @packageName: com.junit5
 * @description: Fixtrure演练
 * @data: 2020-11-07 2:24 下午
 **/

/**
 * junit.jupiter.execution.parallel.enabled = false时，addTest() 和 subTractTest() 同时执行，每次执行一个，没有报错。
 * = true 开启并行 并行数=2时，addTest() 和 subTractTest()每次都有一个在执行，且报错。这就暴露除了混合并发场景
 * 原因：公用一个变量 result ，在方法内变量前加int ,就解决了问题。
 */
public class Junit5Demo_4_2_MixParallel {
    @RepeatedTest(10)
    public void addTest(){
        int result = Calculator.add(4,2);
        System.out.println(result);
        assertEquals(6,result);
    }
    @RepeatedTest(10)
    public void subTractTest(){
        int result = Calculator.subtract(4,2);
        System.out.println(result);
        assertEquals(2,result);
    }
}
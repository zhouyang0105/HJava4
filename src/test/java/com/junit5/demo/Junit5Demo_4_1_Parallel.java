/**
 * projectName: Junit5Demo
 * fileName: Fixtures.java
 * packageName: com.junit5
 * date: 2020-11-07 2:24 下午
 */
package com.junit5.demo;

import com.util.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @version: V1.0
 * @author: kuohai
 * @className: Fixtures
 * @packageName: com.junit5
 * @description: Fixtrure演练
 * @data: 2020-11-07 2:24 下午
 **/
public class Junit5Demo_4_1_Parallel {
    @RepeatedTest(10)
    @Execution(ExecutionMode.CONCURRENT)
    public void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        System.out.println(result);
    }

    /**多线程安全问题！！！
     *  Synchronized  或  java.util.concurrent.atimic.大部分使用第一种。
     * 加了同步锁 synchronized，防止多线程并发出错。 加或不加 处于平衡性考虑。   同步锁的实质是把多线程变成单线程。
     * 提现、抽奖、秒杀活动特别需要注意多线程安全。
     * 代码锁只能解决单实例的并发问题。在不同机器上，不能通信。
     * Redis + 分布式锁： 每次查询会不会很耗时？不耗时,Redis的读取和写入都是非常快的，另外 Redis天生就是单线程的，会保证原理性。当然不管加什么锁都会影响性能，在保证功能和性能，所以说性能调优很难，博弈。
     * 测试环境如果是分布式-有多个机器，就可以暴露分布式多线程的问题。
     *
     * 用 @RepeatedTest(10) 进行多线程测试。
     * @throws InterruptedException
     */
    @RepeatedTest(10)
    public void countSynTest() throws InterruptedException {
        int result = Calculator.synCount(1);
        System.out.println(result);
    }
}
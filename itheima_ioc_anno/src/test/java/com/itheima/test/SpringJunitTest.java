package com.itheima.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// 首先使用Spirng内核去跑
@RunWith(SpringJUnit4ClassRunner.class)
// 注入上下文文件的位置
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringJunitTest {

}

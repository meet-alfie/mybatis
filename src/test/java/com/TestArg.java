package com;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * 需要咨询JAVA高级VIP课程的可以加嫦娥老师的QQ：2658342213
 * 需要视频资料或者咨询课程的可以加安其拉老师：2246092212
 * author：鲁班学院-商鞅老师
 */
public class TestArg {


  public void test(String name,String age){

  }

  public static void main(String[] args) throws Exception{
    Method test = TestArg.class.getMethod("test", String.class, String.class);
    for (Parameter parameter : test.getParameters()) {
      System.out.println(parameter.getName());
    }
  }
}

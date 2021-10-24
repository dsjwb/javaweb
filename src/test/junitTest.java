package test;

import chen.junit;
import org.junit.Assert;
import org.junit.Test;

public class junitTest {
    @Test
    public void addTest(){
       junit j=new junit();
      int result= j.add(3,4);
        System.out.println(result);
        Assert.assertEquals(7, result);
    }
    @Test
    public void subTest(){
        junit j=new junit();
        int result= j.sub(3,4);
        System.out.println(result);
    }

}

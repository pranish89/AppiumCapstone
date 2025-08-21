package fakeStoreAPI;

import org.testng.annotations.Test;


public class ConcurrentTesting {

     @Test(priority =1)
     public static void method1()
     {
    	 OrderProcessing.newOrder(1);   
     
     }
     
     @Test
     public static void method2()
     {
    	 OrderProcessing.newOrder(2);
     }
     
     @Test
     public static void method3()
     {
    	 OrderProcessing.newOrder(3);
     }
     
     @Test
     public static void method4()
     {
    	 OrderProcessing.newOrder(4);
     }

     @Test
     public static void method5()
     {
    	 OrderProcessing.newOrder(5);
     }
}

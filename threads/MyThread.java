import java.util.*;
class MyThread implements Runnable
{
   public void run()
   {

          for(int i=0;i<10;i++)
	  {
		System.out.println(i);
	  }

   }

   public static void main(String[] args)
   {

      MyThread t1=new MyThread();
      Thread thread=new Thread(t1);
      thread.start();

   }


}


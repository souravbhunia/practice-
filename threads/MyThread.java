import java.util.*;

class MyThread implements Runnable
{
 
   public void run()
	{
        for(int i=1;i<=10;i++)
     {
        System.out.print(i+"  ");

          try{
            Thread.sleep(1000);            
          }catch(Exception e ){}
	}
   }

  public static void main(String[] args)
  {
     MyThread t=new MyThread();
     Thread thread=new Thread(t);
   //object of another thread

   MyAnotherThread t2=new MyAnotherThread();
   t2.start();
 


     thread.start();

   }
}
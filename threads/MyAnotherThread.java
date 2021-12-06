class MyAnotherThread extends Thread
{
   public void run()
   {
     for(int i=10;i>=0;i--)
   {
     System.out.println(i);
    try{
     Thread.sleep(2000);
   }catch(Exception e ){}

    }
   }





}
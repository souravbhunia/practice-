class ThreadA
{
   public static void main(String[] args)
   {
      System.out.println("Thread started....");
	  
	  int a=10+9;
	  System.out.println("sum is "+a);
      Thread t=Thread.currentThread();
	  System.out.println(t.getName());
	  
	  //set name....
	  
	  t.setName("MyMain");
	  System.out.println("after rename..."+t.getName());
	  
	  try{
		  Thread.sleep(5000);
	  }catch(Exception e){
		  
	  }
	  
	  
	  
	  System.out.println("Thread ended....");
    
   
   }



}
import java.util.*;
import java.lang.*


class square implements Runnable
 {
    int y;
    public square(int x)
    {
        y=x;
    }
    public void run()
    {
       public void run() {
		Thread b = new Thread(new cube(y));
		System.out.println(" Square(" + y + "): " + (y*y));
		b.start();
	}
        //Use Threads to start a thread to find the cube of the given number y
    }
}

class cube implements Runnable //Something missing in the code here related to interfaces
{
    int y;
    cube(int x) {
		y = x;
	}
   
    public void run()
    {
        System.out.println("Cube of the number: "+(y*y*y));
    }
}

class generate implements Runnable
{
    public void run()
    {
        int num=0;
        Random r = new Random();
            num= r.nextInt(100);
                System.out.println("Number generated: "+num);
                Thread t1= new Thread(new square(num));
                t1.start();
    }
}

public class p3b
{
    public static void main(String args[])
    {
        for(int i=0;i<5;i++)
        {
           Thread obj = new Thread(new generate());
			obj.start();
		 //Generate a number using Threads and start the given thread
        
        try{
            Thread.sleep(1000); //Find the error in this given line
         }
        catch(Exception e)
        {
            System.out.println(e);
        }
     }
    }
}

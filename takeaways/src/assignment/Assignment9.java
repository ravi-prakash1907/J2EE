/* 
Write a Java program that creates three threads. 
First thread displays “Good Morning” every one second, the second thread displays “Hello” 
every two seconds and the third thread displays “Welcome” every three seconds.
*/

package assignment;

import java.io.*;
class One extends Thread
{
public void run()
{
for(int i=0;i<100;i++)
{
try{
Thread.sleep(1000); }
catch(InterruptedException e){
System.out.println(e); }
System.out.println("Good Morning");
}
}
}
class Two extends Thread
{
public void run()
{
for(int i=0;i<100;i++)
{
try{
Thread.sleep(2000); }
catch(InterruptedException e)
{
System.out.println(e);
}
System.out.println("Hello ");
}
}
}
class Three implements Runnable
{
public void run()
{
for(int i=0;i<100;i++)
{
try{
Thread.sleep(3000); }
catch(InterruptedException e){
System.out.println(e); }
System.out.println("Wel come");
}
}
}
class ThreadEx
{
public static void q1()
{
One t1=new One();
Two t2=new Two();
Three tt=new Three();
Thread t3=new Thread(tt);
t1.setName("One");
t2.setName("Two");
t3.setName("Three");
System.out.println(t1);
System.out.println(t2);
System.out.println(t3);
Thread t=Thread.currentThread();
System.out.println(t);
t1.start();t2.start();t3.start();
}
}

class Assignment9 {
    public static void main(String args[]) { 

        //question 1
        ThreadEx t = new ThreadEx();
        t.q1();
        System.out.println("\n-------------------\n");
        
    }
}
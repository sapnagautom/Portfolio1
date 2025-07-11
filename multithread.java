class mythread1 extends Thread {

public void run()
{
System.out.println("thread is moveing");
}
}
class mythread2  extends mythread1 {
public void move()
{
System.out.println("threads are moving");
}
}
class  multithread3 {
public static void main(String args[]){ 

mythread1 obj1 = new mythread1();
mythread2 obj2 = new mythread2();
obj1.run();
obj2.move();
}
}
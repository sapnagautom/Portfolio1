class ThreadCycle extends Thread {
public void run(){
System.out.println("main thread started");
try {
Thread.sleep(1000);
}catch(InterruptedException e){
System.out.println(" interrupted Exception");
}
finally{
System.out.println("thread completed");
}
}
}
public class ThreadLifeCycle14 {
public static void main(String agr[]){
ThreadCycle t1 = new ThreadCycle();
System.out.println("state  creation :"  +t1.getState());

t1.start();
System.out.println("state start complition :" + t1.getState());

try{
t1.join();
}
catch(InterruptedException s){

System.out.println("main thread executed :");
}
System.out.println(t1.getState());
}
}


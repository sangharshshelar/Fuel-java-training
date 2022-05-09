 class Test implements Runnable{

Thread t; 
Test(String n){

      t=new Thread(this); 
      t.setName(n); 
      t.start();
}
      @Override 
      public void run() {

try { 
for (int i=0;i<5;i++){

System.out.println("Child thread "+t.getName()+":"+1);
Thread.sleep(500);

}

} catch (Exception e) { 
//TODO: handle exception

}
}
}

public class Demo2 {
public static void main(String[] args) {
      Test t1=new Test("A");
      Test t2=new Test("B");
      Test t3=new Test("C");

try{

for (int i=0;i<5;i++){

System.out.println("Main thread "+1);
Thread.sleep(1500);
}
}catch(InterruptedException e){

      }
   }
}
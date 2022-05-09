import java.util.*;
class Test {
int i,j;
void add(){
System.out.println(i+j);
}
Test (int x, int y){
i = x;
j = y;
}
}

class Demo1 {
public static void main(String[] args){
Test t1=new Test(10,20);
Test t2=new Test (30,40);
Test t3=null;
t1.add();
t2.add();
t3.add();
}
}
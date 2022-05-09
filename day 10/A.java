// calling constructor with args

class A{
int i;
A(int x){
   i=x;
   System.out.println("with args");
}
     A(){
   i=10;
   System.out.println("without  args");
}

}
class B extends A{
   int j;
   B(){
         super(80);
         j=25;
         
    }
    
    void add (){
    System.out.println(i+j);
    
    }
 }
 class Demo{
   public static void main(String[] args){
   B ob=new B();
   ob.add();
   
 }
}
/*3. Create classes that capture bank customers and bank accounts. A customer has a first and last
name. An account has a customer and a balance. Make objects for two accounts held by the
same customer.*/

import java.util.*;
class Account{
      int id;
      String name;
      int balance;
      
Account(int id,String name,int balance)
{
  this.id=id;
  this.name=name;
  this.balance=balance;
  
  System.out.println("Constructor With args called");
 }
 
Account(){

         id=1;
         name="Sudam";
         balance=0;
       System.out.println("Constructor Without args called");
       
     }
     
 void deposite(int amt)
 {
    balance +=amt;
 }      
void withDraw(int amt)
{
   balance -= amt;
}

void print()
{
   System.out.println("************************************"); 
   System.out.println("ID:"+id);
   System.out.println("Name:"+name);
   System.out.println("balance:"+balance);
   System.out.println("************************************");
   
 }
}

class DemoConstructor{
public static void main(String[] args)
{
  Account ob1=new Account();
  Account ob2=new Account(2,"Sudam",1000);  
  ob2.deposite(3000);
  ob1.deposite(1500);
  ob2.print();
  ob2.withDraw(2000);
  ob2.print();
}  
}
      
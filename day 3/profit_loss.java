import java.util.*;
class profit_loss
{
public static void main(String args[])
{            Scanner a = new Scanner(System.in);
         	System.out.println(" Enter the Costprice ");
         	double costprice = a.nextDouble();
		      System.out.println("Enter the Selling price:--");
         	double sellingprice = a.nextDouble();
 
		if(costprice-sellingprice > 0)
                {
		     System.out.println("loss:--" + (costprice - sellingprice));
		}
		else if(costprice - sellingprice < 0)
                {
		     System.out.println("profit:--" + (sellingprice - costprice));
		}
      else if(costprice == sellingprice)
      {
           System.out.println("No loss No profit:--" + (sellingprice - costprice));
           
       }    

             
		else
		{
		     System.out.println("NEUTRAL");
          
   }
}

}
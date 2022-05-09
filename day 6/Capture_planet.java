class Captureplanet
{
String planetname;
double dos; 
double gravityrelative;

Captureplanet(String a, double b, double c)

{

this.planetname = a;
this.dos=b;
this.gravityrelative=c;
}
 void display()

{

System.out.println("planet name: " +planetname); 
System.out.println("distance from sun: " +dos);
System.out.println("gravity relative to earth: " +gravityrelative);

}

}

public class Capture_planet
{

public static void main(String[] args)
{

Captureplanet p1= new Captureplanet ("Earth ", 56667, 9.3); 
Captureplanet p2= new Captureplanet("uranus ", 78667, 7.3);

p1.display(); 
p2.display();

}

}
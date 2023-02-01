package temperatur;
import java.util.Scanner;


public class Temperatur {

static double temp;   
    
static void start()
{
    System.out.println("Das Programm rechnet die gängigsten Temperatureinheitenineinander um (Celsius, Fahrenheit, Kelvin)");
    eingabe();
}
    
static void auswahl()
{
    System.out.println("Wählen Sie die gewünschte Umrechnung:");
    System.out.println("<1> Celsius in Kelvin und Fahrenheit");
    System.out.println("<2> Kelvin in Celsius und Fahrenheit");
    System.out.println("<3> Fahrenheit in Celsius und Kelvin");
    wahl();
}
    
static double eingabe()
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Temperatur eingeben: ");
    temp = sc.nextDouble();
    auswahl();
    return temp;
}
    
static void wahl()
{
    System.out.println();
    System.out.print("Wählen Sie die gewünschte Umrechnung: ");
    Scanner sc = new Scanner(System.in);
    int falsch = 1;
    while(falsch > 0)
    {
    int auswahl = sc.nextInt();
    switch(auswahl)
    {
        case 1:
        falsch = 0;
        celsius(temp);
        break;
        case 2:
        falsch = 0;
        kelvin(temp);
        break;
        case 3:
        falsch = 0;
        fahrenheit(temp);
        break;
        default:
        System.out.println("Falsche Eingabe!");
    }
  }
}

static void celsius(double temp)
        {
            double kelvin = temp + 273.15;
            double fahrenheit = temp * 1.8 + 32;
            System.out.println(temp + " Grad Celsius sind " + kelvin + " Grad Kelvin und " + fahrenheit + " Grad Fahrenheit");
        }

static void kelvin(double temp)
        {
            double celsius = temp - 273.15;
            double fahrenheit = temp * 1.8 - 459.67;
            System.out.println(temp + " Grad Kelvin sind " + celsius + " Grad Celsius und " + fahrenheit + " Grad Fahrenheit");
        }

static void fahrenheit(double temp)
        {
            double celsius = (temp - 32) / 1.8;
            double kelvin = (temp + 459.67) / 1.8;
            System.out.println(temp + " Grad Fahrenheit sind " + celsius + " Grad Celsius und " + kelvin + " Grad Kelvin");
        }

static void wieder()
{
    Scanner sc = new Scanner(System.in);

    System.out.println("Wollen Sie eine weitere Berechnung anstellen? (ja --> 1): ");
    int wieder = sc.nextInt();
    if(wieder == 1)
    {
        eingabe();
        wieder();
    }

}

static void ende()
{
    System.out.println("Progammende");
}

    public static void main(String[] args) {
           
    start();
    wieder(); 
    ende();      
        
    }

}

package macheauto;
import java.util.Scanner;

public class Auto {
    Scanner sc = new Scanner(System.in);
    
    private String farbe;
    private int ps, maxGeschw;
    private double preis;

    public void setFarbe(String color) {
        System.out.println("Geben Sie den Farben ein: ");
        this.farbe = sc.next(farbe);
    }
    
    public void setPs() {
        System.out.println("Geben Sie den PS ein: ");
        ps = sc.nextInt();
    }
    
    public void setMaxGeschw() {
        System.out.println("Geben Sie die Max-Geschwindigkeit ein: ");
        maxGeschw = sc.nextInt();
    }
    
    public void setPreis() {
        System.out.println("Geben Sie den Preis ein: ");
        preis = sc.nextDouble();
    }

    public String getFarbe() {
        return farbe;
    }
    
    public int getPs() {
        return ps;
    }
    
    public int getMaxGeschw() {
        return maxGeschw;
    }
    
    public double getPreis() {
        return preis;
    }
    
    public void abschreiben() {
        System.out.print("Geben Sie das Alter des Autos in Jahren ein: ");
        int alter = sc.nextInt();
        double wert = preis - preis / 10 * alter;
        if (wert > 0)
        {
            System.out.println("Das Auto hat nach 10 Jahren den Wert " + wert + ".");
        } else {
            System.out.println("Das Auto hat nach 10 Jahren den Wert 0.");
        } 
    }

    public Auto() {
        farbe = "rot";
        maxGeschw = 200;
        preis = 23000.00;
        ps = 180;
    }
    
    
    
    
    
}
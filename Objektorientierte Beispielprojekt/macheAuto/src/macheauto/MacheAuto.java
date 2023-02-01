package macheauto;



public class MacheAuto {


    public static void main(String[] args) {
        
        Auto au = new Auto();
        
        String farbe = au.getFarbe();
        int ps = au.getPs(), maxGeschw = au.getMaxGeschw();
        double preis = au.getPreis();
        
        System.out.println("Das Auto ist " + farbe + ", hat " + ps + " PS, kann maximal " + maxGeschw + " km fahren\nund kostet " + preis + " CHF");
        
        au.setFarbe(farbe);
        au.setPs();
        au.setMaxGeschw();
        au.setPreis();
    }

}

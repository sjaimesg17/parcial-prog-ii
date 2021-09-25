
package parcialcorte1;

import java.util.Scanner;

public class Parcialcorte1 {

 
    public static void main(String[] args) {
        Scanner sa=new Scanner(System.in);
        
        double kg, mg, mcg, g, onza, lb, ton;
        System.out.println("Conversion de kg a diferentes unidades de masa");
        System.out.println("Ingrese su peso en kg : "); kg=sa.nextDouble();
        
        mg=(kg*1000000);
        mcg=(kg*1000000000);
        onza=(kg*35.274);
        g=(kg*1000);
        lb=(kg*2.205);
        ton=(kg/1000);
        
        System.out.println("\nLa conversion de kg a µg es de : "+mcg+" µg");
        System.out.println("\nLa conversion de kg a mg es de : "+mg+" mg");
        System.out.println("\nLa conversion de kg a onza es de : "+onza+" onzas");
        System.out.println("\nLa conversion de kg a g es de : "+g+" g");
        System.out.println("\nLa coversion de kg a lb es de : "+lb+" lb");
        System.out.println("\nLa conversion de kg a ton es de : "+ton+" ton");
                    
    }
    
}


package exemplopolimorfismo;

import java.util.ArrayList;

/**
 *
 * @author ifernandezblanco
 */
public class ExemploPolimorfismo {

   
    public static void main(String[] args) {
        Persoa per = new Persoa();
        Persoa dep1 = new Deportista();
        Persoa pro = new Profesorado();
        
//        System.out.println("Persoa: " + per.calcularSoldo());
//        System.out.println("deportista: " + dep1.calcularSoldo());
//        System.out.println("Profesorado: " + pro.calcularSoldo());
     
        Deportista d = new Deportista();
        per = d;
        d = (Deportista)per;
    
        ArrayList<Persoa> l = new ArrayList<>();
        l.add(per);
        l.add(dep1);
        l.add(pro);
        
        Metodos.amosar(l);
    }
    
}

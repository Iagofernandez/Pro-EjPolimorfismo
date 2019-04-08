
package exemplopolimorfismo;

/**
 *
 * @author ifernandezblanco
 */
public class ExemploPolimorfismo {

   
    public static void main(String[] args) {
        Persoa per = new Persoa();
        Persoa dep1 = new Deportista();
        Persoa pro = new Profesorado();
        
        System.out.println("Persoa: " + per.calcularSoldo());
        System.out.println("deportista: " + dep1.calcularSoldo());
        System.out.println("Profesorado: " + pro.calcularSoldo());
    }
    
}

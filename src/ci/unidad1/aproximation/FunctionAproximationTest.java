/*
ITESS
TI-202
Enero-junio 2024
Febrero 2024
Patricio Arturo Mendez Gonzalez
TI23110156
patoloco22.34@gmail.com
*/

package ci.unidad1.aproximation;


public class FunctionAproximationTest {
    public static void main(String[] args){
        FunctionAproximation fa = new FunctionAproximation(1.0, 3.0, 10);
        
        fa.compute();
        System.out.println("area: "+ fa.getArea());
    }
    
}
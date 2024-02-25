/*
ITESS
TI-202
Enero-junio 2024
23 de Febrero de 2024
Series Rienman - Ejemplo 1.
Patricio Arturo Mendez Gonzalez
TI23110156
patoloco22.34@gmail.com
*/
package ci.unidad.SumaRienman;


public class SumasEjemplo1 extends SumasRienman {

    public SumasEjemplo1(double[] x, double[] W) {
        super(x, W);
    }
    @Override
    public double funcion(double x){
        return 10-x*x;
    }
}

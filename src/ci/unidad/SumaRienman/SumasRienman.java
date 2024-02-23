/*
ITESS
TI-202
Enero-junio 2024
23 de Febrero de 2024
Series Rienman.
Patricio Arturo Mendez Gonzalez
TI23110156
patoloco22.34@gmail.com
*/
package ci.unidad.SumaRienman;


public class SumasRienman {
    protected double[] x;
    protected double[] W;
    protected double[] dx;
    protected double[] fw;
    protected double suma;

    public SumasRienman(double[] x, double[] W) {
        
        this.x = x;
        this.W = W;
        
        dx = new double[W.length];
        fw = new double[W.length];
    }
    
    public void calcular(){
        //Calcular dx
        for(int i = 0; i < dx.length; i++){
            dx[i] = x[i+1] - x[i];
        }
        
        //Calcular fw y sumaa
        
        suma=0;
        for (int i = 0; i < dx.length; i++){
            fw[i] = funcion(W[i]);
            suma += fw[i]* dx[i];
        }
       
        
    
    }
            public double funcion(double x){
            return 1.0;
            
            }
}

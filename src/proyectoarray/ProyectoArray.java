package proyectoarray;

public class ProyectoArray {


    public static void main(String[] args) {
        //Declaración del array   
        String[] nombre = {"Luis","Miguel","Carlos"};
           
        //Recorrer el array
        for(int i=0; i<nombre.length; i++){
            System.out.println(nombre[i]);
        }
        
        double[] estatura = {1.72,1.83,1.91};
        for(int i=0; i<estatura.length; i++){
            System.out.println(estatura[i]);
        }
    }
    
}

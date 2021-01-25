
package proyectoarray;

public class Main4 {

    public static void main(String[] args) {
        int[] numero = {4,5,10,24,1,9,8};
        int[] copia = {};
        
        for(int i=0; i<numero.length; i++){
            System.out.println(numero[i]);
        }
        System.out.println("Array 1: " + numero);
        System.arraycopy(numero,0,copia,0,numero.length);
    }
    
}

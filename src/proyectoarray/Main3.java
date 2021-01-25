
package proyectoarray;

public class Main3 {

    public static void main(String[] args) {
        int[] numero = {4,5,10,24,1,9,8};
        int media = 0 ;
        for (int i=0; i<numero.length; i++){
            media = media + numero[i];

            
        }
        System.out.println("La media de los números es " + (media/numero.length));

    }
    
}

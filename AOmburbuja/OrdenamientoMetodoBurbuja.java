package AOmburbuja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrdenamientoMetodoBurbuja {

    public static void main(String[] args) {
     List<Integer> lista = new ArrayList<Integer>();
           

       lista.add(5);
       lista.add(7);
       lista.add(9);
       lista.add(3);
       lista.add(10);
       lista.add(2);
       lista.add(51);
       
        System.out.print("Lista original: ");
      for(int i=0;i<lista.size();i++){
          System.out.print(lista.get( i )+" ");
      }
                          System.out.println("");
  
                          
    /*  ordenación mediante algoritmo de burbuja */
       for(int i=0;i<lista.size()-1;i++){
           for(int j=0;j<lista.size()-1;j++){
               if(lista.get(j)>lista.get(j+1)){
                 int aux=lista.get(j+1);
                  /* Lo intercambiamos de posición */
                  lista.set(j+1,lista.get(j));
                  lista.set(j,aux);  
               }
            }
      }
        
        System.out.println("¿Desea ordenar los números? S/N");
        Scanner sc2 = new Scanner(System.in);
        /* Con esto capturamos lo que introducimos por teclado */
        String res = sc2.nextLine();
        /* Si es 'S' entra, si no sale */
        if (res.equalsIgnoreCase("S")) {
            /* Muestra el array ordenado */
        System.out.print("\nLista ordenada: ");
            /*Llama al método para ordenar */
             for( int i=0;i<lista.size();i++){
          System.out.print(lista.get(i)+" ");
          
        }
            System.out.println("");
       } 
    }
    
}

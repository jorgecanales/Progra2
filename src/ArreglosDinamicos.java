
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JorgeC
 */
public class ArreglosDinamicos {
    public static void main(String[] args){
        Scanner lea= new Scanner(System.in);
        ArrayList<String> arreglo= new ArrayList<>();
        //guardar datos en el arreglo
        arreglo.add("Hola");
        arreglo.add("Mundo");
        //recorrer
        for(String cad: arreglo)
            System.out.println("-"+ cad);
        for(int p=0; p<arreglo.size(); p++)
            System.out.println("-" + arreglo.get(p));
        
        //modificar el valor que tiene la posicion de hola mundo
        arreglo.set(0, "Que onda");
        for(String cad: arreglo)
            System.out.println("-"+ cad);
        
        if(arreglo.contains("Hola"))
            System.out.println("Si contiene al mundo");
        else 
            System.out.println("No contiene la palabra buscada");
        
        arreglo.add(1,"Que contas");
       for(String cad: arreglo)
            System.out.println("-"+ cad);
       
       ArrayList<Integer> numeros= new ArrayList<>();
       int a;
        System.out.println("Ingrese numero: ");
        a=lea.nextInt();
       numeros.add(a);
      for (int x: numeros)
            System.out.println("El Numero es:"+ x);
      
      
    }
}

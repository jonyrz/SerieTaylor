package SerieTaylorSen;

import java.util.Scanner;

public class SerieTaylorSenMod {

    public static void main(String args[]) { 
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Ingrese n: "); 
        int n = sc.nextInt(); 
        System.out.print("Ingrese c: "); 
        int x = sc.nextInt(); 
        double suma=0; 
        double termino;
        int senx=0;
        String cosx;
        int negsenx;
        String negcosx;
        int cont=-1;
        int cont2=-1;
        //int signo=1;
    
        for (int i=0; i<n; i++){ 
            termino = Math.pow(x, i)/factorial(i); 
            suma += termino; 
        }
        
         /*for (int i=0; i<n; i++) { 
             termino=Math.pow(x,i)/factorial(i)*signo; 
             signo*=-1; 
             suma+=termino; 
         }*/
    
        System.out.printf("f(%d) = %f\n", x, suma);
        System.out.println("Polinomio: ");
    
        if(cont2!=n){
            do{
                if(cont<n){
                    cont2 = cont2+1;
                    cont = cont +1;
                    senx = 0;
                    System.out.print(senx + "+");
                }
                if(cont<n){
                    cont2 = cont2+1;
                    cont = cont +1;
                    cosx = "x"+"^"+cont2+"/"+cont2+"!";
                    System.out.print(cosx + "+");
                }
                if(cont<n){
                    cont2 = cont2+1;
                    cont = cont +1;
                    negsenx = 0;
                    System.out.print(negsenx + "-");
                }
                if(cont<n){
                    cont2 = cont2+1;
                    cont = cont+1;
                    negcosx ="x"+"^"+cont2+"/"+cont2+"!";
                    System.out.print(negcosx + "+");
                }
            }while(cont<n);
        }   
    } 

    public static double factorial(int numero) { 
        double factorial=1; 
        for (int i=2; i<=numero; i++){ 
            factorial *= i; 
        } 
        return factorial;
    }
}
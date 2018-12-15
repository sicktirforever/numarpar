package numar.par;

import java.util.Scanner;

public class NumarPar {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Valoarea lui n este: ");
        int n = sc.nextInt();
        System.out.println("N = " + n);
        if (n % 2 == 0){
            System.out.println("Numarul " + n + " este par");
        }
        else {
            System.out.println("Numarul " + n + " nu este par");

        }
        numarPrim();
        numerePrime();

    }

    public static void numarPrim(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Valoarea lui n este: ");
        int n1 = sc.nextInt();
        if (n1 % 2 == 0){
            System.out.println("Numarul " + n1 + " este par");
        }
        else {
            System.out.println("Numarul " + n1 + " nu este par");

        }
        return;
    }

    public static void  numerePrime(){
        int[] numere = {12,142,65,43,765,21,1,2,56};
        for (int nrprim : numere)
            if (nrprim % 2 == 0){
                System.out.println(nrprim + " este un numar par");
            }
            else{
                System.out.println(nrprim + " nu este un numar par");
            }
        return;

    }

}


package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sicaklik;
        
        Scanner inp=new Scanner(System.in);

        System.out.print("Hava kaç derece: ");
        sicaklik= inp.nextInt();
        
        if (sicaklik<5){
            System.out.println("Hava kayak için çok güzel :)");
        } else if (sicaklik<=10) {
            System.out.println("Güzel bir filme nedersin.");
        } else if (sicaklik<=15) {
            System.out.println("Sinema mı pinik mi sen seç.");
        } else if (sicaklik<=25) {
            System.out.println("Hava tam piknikte mangal yapmalık :)");
        }else {
            System.out.println("Bu havada yanlızca yüzülür abi yaa..");
        }
    }
}
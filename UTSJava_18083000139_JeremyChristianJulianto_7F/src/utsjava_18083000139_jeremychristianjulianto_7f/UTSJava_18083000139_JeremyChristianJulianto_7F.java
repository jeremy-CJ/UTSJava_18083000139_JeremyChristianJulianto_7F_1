/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsjava_18083000139_jeremychristianjulianto_7f;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class UTSJava_18083000139_JeremyChristianJulianto_7F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner masuk = new Scanner(System.in);
        int jk;
        float berat, tinggi, bmi, meter;
        double broca;
     
        System.out.println("PROGRAM JAVA MENGHITUNG BERAT BADAN IDEAL BMI");
        System.out.println("............................................");
        System.out.print ("Masukan Jenis Kelamin (1.Laki-lai)| (2.Perempuan): ");
        jk = masuk.nextInt();
        System.out.print ("Masukan Berat: ");
        berat = masuk.nextFloat();
        System.out.print ("Masukan Tinggi: ");
        tinggi = masuk.nextFloat();
        meter=tinggi/100;
   
        bmi=(berat/(meter*meter));
  
        System.out.println("............................................");
        System.out.print("BMI : "+bmi+" ");
        
        if (bmi<18.5){
            System.out.println("(Kurus)");
        }else if (bmi<=22.9){
            System.out.println("(Normal)");
        }else if (bmi<24.9){
            System.out.println("(Overweight)"); 
        }else {
            System.out.println("(Obesitas)"); 
        }
        
        switch(jk){
            case 1 : broca=((tinggi-100)-(0.10*(tinggi-100))); break;
            case 2 : broca=((tinggi-100)-(0.15*(tinggi-100))); break;
            default : broca=0;
        }
    
        int hasil = (int)broca;
        System.out.println("Berat badan ideal anda (menurut rumus) : "+hasil+" Kg");
    }
    
}

package com.bilgeadam.lesson006;

import java.util.Scanner;

/*
 *
 * Dışarıdan bir ıban değeri girelim TR 1001005001 ,TR 1001005002 veya OTH 2002002000
 * gibi daha sonra bu değerleri kontrol edelim eğer Tr ile başlıyorsa
 * yurt içi işlemler yazsın ve Eğer 5001 ile Bitiyorsa Ziraat 5002 ile bitiyorsa
 * Garanti 5003 ile bitiyorsa İş bankası yazdırsın eğer OTH ise Yurt dışı
 * işlemler yazdıralım 2000 ile bitiyorsa kıta içi işelmeler ve OTH 2002002000 yerine
 * Ki 200200…   eğer 2000 ile bitmiyorsa  Kd 200201…
 *
 */
public class Question30 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir iban giriniz");
        String iban = scanner.nextLine().trim();
       // Tr 500051 oth 568997;
        System.out.println(iban.indexOf(" "));
        String kontrol=iban.substring(0,iban.indexOf(" "));
        System.out.println(kontrol);
        String bankaNo=iban.substring(iban.length()-4);
        switch (kontrol){
            case "Tr":
                System.out.println("yurt içi işlemler");
                switch (bankaNo){
                    case "5001":
                        System.out.println("Ziraat");
                        break;
                    case "5002":
                        System.out.println("Garanti");
                        break;
                    case "5003":
                        System.out.println("İş bankası");
                        break;
                    default:
                        System.out.println("Diğer");
                        break;
                }
               break;
            case "OTH":
                System.out.println("Yurt dışı işlemler");
                switch (bankaNo){
                    case "2000":
                        System.out.println("Kıta içi işlemler");
                        System.out.println(iban.replace("OTH","Ki"));
                        break;
                    default:
                        System.out.println("Kıta dışı işlemler");
                        System.out.println(iban.replace("OTH","Kd"));
                        break;
                }
                break;
            default:
                break;

        }


    }



}

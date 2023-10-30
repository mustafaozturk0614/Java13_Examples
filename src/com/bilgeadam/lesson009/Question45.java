package com.bilgeadam.lesson009;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
    dışarıdan bir dizi boyutu gireceğiz (double)
    daha sonra bu diziye rasglete sayılar 500 e kadar uretip atama yapacagız ve elamanların ort bulacağız

 */
public class Question45 {


    public static void main(String[] args) {

        // rastgele sayı uretme ornekleri
        Random random=new Random();
        int sayi= random.nextInt(3);
        int sayi2= random.nextInt(3,13);
        System.out.println(sayi);
        System.out.println(sayi2);
        double sayi3=random.nextDouble(5);
        System.out.println(sayi3);
        long sayi4=random.nextLong(120);
        float sayi5= random.nextFloat(260);
       // byte myByte=random.nextBytes();
        boolean kontrol= random.nextBoolean();
        System.out.println(sayi4);
        System.out.println(sayi5);
        System.out.println(kontrol);


        double [] array=diziOlustur();
        arrayDoldur(array);
        System.out.println(Arrays.toString(array));
        System.out.println(ortBul(array));

    }


    public static double []  diziOlustur(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir dizi boyutu giriniz");
        int boyut= scanner.nextInt();
       // double [] dizi=new double[scanner.nextInt()];
        double [] dizi=new double[boyut];
        return  dizi;
    }

    public  static double  rastgeleSayiUret(){
        Random random=new Random();
     return   random.nextDouble(500);
    }

    public  static void arrayDoldur(double [] array ){

        for (int i = 0; i <array.length ; i++) {
            array[i]=rastgeleSayiUret();
        }
    }
    public  static  double ortBul(double [] array){
        double toplam=0;
        for (int i = 0; i <array.length ; i++) {
               toplam+=array[i];
        }
        return  toplam/array.length;
    }


}

package com.bilgeadam.lesson007;

public class ArrayTest {

    public static void main(String[] args) {
        // Array tanımlama yöntemleri
        int [] sayilar= {1,2,4,5};
        int [] sayilar2=new int[4];
        sayilar2[0]=4;
        sayilar2[1]=7;
        sayilar2[2]=17;
        sayilar2[3]=57;
        System.out.println(sayilar2[2]);
        System.out.println(sayilar[3]);
        // arrayin boyutu dısında kaldıgı için hata verir arrayler tanımlandıgı anda boyut kazanır
        // arraylerin boyutları sabittir
       // sayilar2[4]=96;
        System.out.println(sayilar2);
        // burda artık var olan arayi buyutmuyoruz bellekde yeni bir array olusturyoruz
        sayilar2=new int[6];
        System.out.println(sayilar2);
        //int [] sayilar2=new int[4];
        int sayilar3 []=new int[5];

        // Arraylere atama yapmadan once boyut kazandırmak zorundayız
        int [] sayilar5;
      // sayilar5=new int[4];
     //   sayilar5[0]=5;
         int []sayilar6={5,7,98,120,56};
         String [] array=new String[4];
        //double long ,byte char
        boolean [] array2=new boolean[6];
        ArrayTest [] array3=new ArrayTest[4];
        long [] array4=new long[5];
        System.out.println(array[0]);
        System.out.println(array2[0]);
        System.out.println(array4[0]);
        //int long double byte float default degerleri 0
        //boolean default degeri false ,String default degeri null
        char [] array5=new char[3];
        System.out.println((int) array5[0]);
        byte [] array6=new byte[3];
        System.out.println( array6[0]);
        Integer [] array7=new Integer[5];
        System.out.println(array7[0]);

    }
}

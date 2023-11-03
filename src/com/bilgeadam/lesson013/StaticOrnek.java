package com.bilgeadam.lesson013;

public class StaticOrnek {
    // Static olmayanlar değişkenlerde nesne değişkeni
    int numara1;

    // Statik değişkenler Sınıf değişkenidir
    static  int numara2;

    // bu metot uygulama ayaga kalktığında olusmayacak!!!!
    // bu metodu kullanmak için bir nesneye ihtiyacım var( new leme işlemine)
    // bu yuzden bu metot içinde static olan veya olmayan değişkenler kullanabilirim
    public void numaraVer(){
        System.out.println("Numaraver metodu");
        numara1+=1;
        numara2+=1;
        System.out.println("numara 1====> "+numara1);
        System.out.println("numara 2====> "+numara2);
    }
      // Static değişkenler ve metotlar uygulama ayaga kalktıgında nesne olusturulmadan olusurlar

    // uygulama ayaga kalktıgında nesne olusturulmadan bu metot olusacak
    //ben bu metotda static olmayan bir değişken kullanamam çünkü static olmayan değişkenler nesnelre bağlıdır
    //yani static olmayan değişkenlere erişmek için bir new leme işlemi yapmakgerekir(nesene olusturma işlemi)
    public static void numaraVer2(){
        System.out.println("Numaraver2 metodu");
        numara2++;
        System.out.println("numara 2====> "+numara2);
//        StaticOrnek ornek=new StaticOrnek();
//        ornek.numara1++;
    }
}

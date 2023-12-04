package com.bilgeadam.lesson029.menuCozum;

import java.util.*;
import java.util.stream.Collectors;

public class MenuManager {

    Random random=new Random();
    List<EIcecek> icecekler=new ArrayList<>(Arrays.asList(EIcecek.values()));

    List<Menu> menuler=new ArrayList<>();



    public ECorba randomCorbaAta(){
        int index=random.nextInt(ECorba.values().length);
        return ECorba.values()[index];
    }
    public EIcecek randomIcecekAta(){
        int index=random.nextInt(EIcecek.values().length);
        return EIcecek.values()[index];
    }
    public ETatli randomTatliAta(){
        int index=random.nextInt(ETatli.values().length);
        return ETatli.values()[index];
    }

    public  Enum  menuBelirle(Enum [] dizi){
        int index=random.nextInt(dizi.length);
        return dizi[index];
    }
    public Menu gunlukMenuOlusutur2(){
//        ECorba [] dizi=ECorba.values();
//        menuBelirle(dizi);

        ECorba corba= (ECorba) menuBelirle(ECorba.values());
        ETatli tatli=(ETatli) menuBelirle(ETatli.values());
        EYemek yemek=(EYemek) menuBelirle(EYemek.values());
        EIcecek icecek=icecekAta2();
        return  new Menu(yemek,corba,icecek,tatli);
    }
    public Menu gunlukMenuOlusutur(){

        ECorba corba=ECorba.values()[random.nextInt(ECorba.values().length)];
        ETatli tatli=ETatli.values()[random.nextInt(ETatli.values().length)];
        EYemek yemek=EYemek.values()[random.nextInt(EYemek.values().length)];
        EIcecek icecek=EIcecek.values()[random.nextInt(EIcecek.values().length)];
        return  new Menu(yemek,corba,icecek,tatli);
    }

    public void haftalıkMenuOlsutur(){
        for (int i = 0; i <EGun.values().length ; i++) {
        Menu menu = gunlukMenuOlusutur2();
        menu.setGun(EGun.values()[i]);
            System.out.println(menu.getGun()+"===>"+menu);
            menuler.add(menu);
        }
    }
public EIcecek icecekAta(EIcecek [] dizi){
        int index=random.nextInt(dizi.length);
        while (dizi[index].atandiMi){
            index=random.nextInt(dizi.length);
        }
        dizi[index].atandiMi=true;
        return  dizi[index];

}

public EIcecek icecekAta2(){
        if (icecekler.isEmpty()){
            System.out.println("Liste tekrar dolduruldu");
            icecekler=new ArrayList<>(Arrays.asList(EIcecek.values()));
        }
    int index=random.nextInt(icecekler.size());
    EIcecek icecek=icecekler.get(index);
    icecekler.remove(icecek);
        System.out.println("listeboyutu==>"+icecekler.size());
            return icecek;
    }
    public static void main(String[] args) {
        MenuManager menuManager=new MenuManager();
        System.out.println(menuManager.randomCorbaAta());
        System.out.println(menuManager.randomIcecekAta());
        System.out.println(menuManager.randomTatliAta());
        System.out.println(menuManager.gunlukMenuOlusutur());
        System.out.println("///////////////");
        // olusturdugumuz menuleri listeye atacagız
        menuManager.haftalıkMenuOlsutur();
        /*
         1- Gun isimlerine gore menuleri bir mape aktralım (Stream yapısı ile)
         */
        Map<EGun,Menu> mapMenu=menuManager.menuler.stream().collect(Collectors.toMap(m->m.getGun(),v->v));
        System.out.println("////////////////////////");
        System.out.println(mapMenu.get(EGun.CUMA));
        System.out.println(mapMenu);
        // Liste uzerinden cuma gunkü menuyu yazdıralım
        menuManager.menuler.stream().filter(x->x.getGun().equals(EGun.CUMA)).findFirst().ifPresent(System.out::println);

    }
}

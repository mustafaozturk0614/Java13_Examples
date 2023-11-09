package com.bilgeadam.lesson019.interfaceDemo;
/*
    1 İnterfacelerde genellikle govdeli metodlar kullanılmaz
     istisna olarak default ve static govdeli metotlar yazılabilir
     2-interfaceler bir kontrat interfacler sadece davranıslarını
     belirler içeriğini belirlemez
     3-interfacelerde tanımladığım metotlar default olarak public metotlardır
     4- interfacelerde degişken tanımlanmaz
     static değişkenler hariç
     5- İnterfaclerdenn nesne olusturulamaz new leme işlemi yapılamaz
     buyuzdende nesne değişkenleri olamayacagı için sadece static
     değişkenler tanımlayabiliirz
     6- JAva çoklu kalıtıma izin vermez (extends) fakat çoklu implemetasyona izin verir
 */
public interface IEmployee {
    void requestVacation();
     void leaveWork();
     void  requestSalaryIncrease();



}

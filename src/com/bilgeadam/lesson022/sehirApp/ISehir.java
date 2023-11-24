package com.bilgeadam.lesson022.sehirApp;

import java.util.List;

public interface ISehir {

    void randomNufusAta(Sehir sehir);

    // plaka kodu ata metodu yazacagız
      // bir sehre bir plaka kodu atayacak
    // 10 a kadar olanların basına 0 eklenecek
    // 01,02.....09,10,11
   void plakaKoduAta(Sehir sehir,int i);

   // rastgele bolgeAta metodu yazacagız
    // bir sehire bir bolge atayacak (bu atama işlemini
    //rastgele yapacak)
   void bolgeAta(Sehir sehir);
}

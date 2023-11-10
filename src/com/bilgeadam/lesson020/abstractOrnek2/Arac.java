package com.bilgeadam.lesson020.abstractOrnek2;
/*

    hızlan yavasla  metodumuz olsun
    ucaklarda hıs 50 50 artsın  ve azalsın
    gemilerde 10 10 artsınve azalsın
    otomobillerdede 20 20 ve azalsın
    kamyonlarda 5 5  artsın  ve azalsın
    abstrac sınıflar olusturalım  gerekli gordumugmuz sınıfları abstrac sınıfa cevirileim ve
    gerekli gordugumuz metotlarıda abstract metoda cevirelim


 */
public abstract class Arac  implements IHaraket {
    private  int hiz;


    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "hiz=" + hiz +
                '}';
    }

    @Override
    public abstract void hizlan() ;
    @Override
    public abstract void yavasla();

}

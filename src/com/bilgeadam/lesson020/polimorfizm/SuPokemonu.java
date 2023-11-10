package com.bilgeadam.lesson020.polimorfizm;

public class SuPokemonu extends Pokemon {
        public  int yuzmeHizi;
        public  int suBasıncGucu;

        public SuPokemonu(String ad, int seviye, int can, int guc) {
                super("Su", ad, seviye, can, guc);
        }

        public SuPokemonu(String ad, int seviye, int can, int guc,int yuzmeHizi,int suBasıncGucu) {
                super("Su", ad, seviye, can, guc);
                this.yuzmeHizi=yuzmeHizi;
                this.suBasıncGucu=suBasıncGucu;
        }

        public SuPokemonu(String ad,int yuzmeHizi,int suBasıncGucu) {
                super(ad);
                this.yuzmeHizi=yuzmeHizi;
                this.suBasıncGucu=suBasıncGucu;
                this.tur="Su";
        }

}

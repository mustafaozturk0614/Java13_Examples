package com.bilgeadam.lesson020.polimorfizm;


public class Test {

    public static void main(String[] args) {

            Pokemon pokemon1= new ElektirkPokemonu("rayichu",3,320,1250);
            Pokemon pokemon2= new SuPokemonu("squirtle",2,220,120,1200,698);
            Pokemon pokemon3=new HavaPokemonu();
            SuPokemonu pokemon4= new SuPokemonu("squirtle",2,220,120,1200,698);

         SuPokemonu   pokemon5=(SuPokemonu) pokemon2;
         System.out.println( pokemon5.yuzmeHizi);
         System.out.println(((SuPokemonu) pokemon2).yuzmeHizi);
         System.out.println(pokemon4.yuzmeHizi);


            ///


//        saldır(pokemon1,null);
//        saldır(null,pokemon2);

    //    saldır2(pokemon1);
        saldır3(pokemon1);
        saldır3(pokemon2);
        saldır3(pokemon3);

    }


    public static void saldır(ElektirkPokemonu elektirkPokemonu,SuPokemonu suPokemonu){
        if (elektirkPokemonu!=null&&suPokemonu==null){
            elektirkPokemonu.saldir();
        } else if (elektirkPokemonu==null&&suPokemonu!=null) {
            suPokemonu.saldir();
        }
    }

    public static void saldır2(Object object){
        if (object instanceof  ElektirkPokemonu){
        ElektirkPokemonu elektirkPokemonu=(ElektirkPokemonu)object;
        elektirkPokemonu.saldir();
        }else if (object instanceof SuPokemonu){
            SuPokemonu suPokemonu=(SuPokemonu) object;
            suPokemonu.saldir();
        } else if (object instanceof  AtesPokemonu) {
            AtesPokemonu atesPokemonu=(AtesPokemonu) object;
            atesPokemonu.saldir();
        } else if (object instanceof HavaPokemonu) {
            HavaPokemonu havaPokemonu=(HavaPokemonu) object;
            havaPokemonu.saldir();
        }
    }

    public static void saldır3(Pokemon pokemon){
        pokemon.saldir();
    }
}

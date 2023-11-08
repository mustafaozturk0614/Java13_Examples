package com.bilgeadam.lesson018;

public class Ram {
        public int boyut;
        public int hiz;

        public Ram(int boyut) {
                this.boyut = boyut;
        }

        @Override
        public String toString() {
                return "Ram{" +
                        "boyut=" + boyut +
                        ", hiz=" + hiz +
                        '}';
        }
}

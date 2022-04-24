package com.bridgelabz.oopspart2;

public class PassingByValue {
        int a = 10;
        void call(int a) {
                a = a+10;
        }

        public static void main(String[] args) {

            PassingByValue pbv = new PassingByValue();
            System.out.println("Before call-by-value: " + pbv.a);
            pbv.call(20);
            System.out.println("After call-by-value: " + pbv.a);


        }

}

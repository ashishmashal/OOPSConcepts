package com.bridgelabz.oopspart2;

public final class Final {

    final int bikeno = 1;
    final String bikename= "FZS";
    final void BikeDetails(){
        System.out.println("Bike No IS " + bikeno + "\nBike Name is "+bikename);
    }
    public static void main(String[] args) {
        Final b1 = new Final();
        b1.BikeDetails();
    }
}

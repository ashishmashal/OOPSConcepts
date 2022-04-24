package com.bridgelabz.oopspart2;

public class PassingByRef {
    int a = 10;
    void callMethod(PassingByRef b)
    {
        b.a=b.a+10;
    }

    public static void main(String  [] args) {
        PassingByRef pbr = new PassingByRef();
        System.out.println("Before calling by Ref " + pbr.a);
        pbr.callMethod(pbr);
        System.out.println("After calling by Ref " + pbr.a);

    }
}

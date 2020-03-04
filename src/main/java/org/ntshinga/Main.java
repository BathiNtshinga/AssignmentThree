package org.ntshinga;

public class Main {

    public static void main(String[] args) {
        // write your code here
        food eggs[] = new food[2];
        eggs[0]= new pie();
        eggs[1]=new meat();

        for (int x=0;x<2;++x) {
            eggs[x].eat();
        }

        encapsulation myObject = new encapsulation();
        myObject.setEmailAddress("bathi.ntshinga@westerncape.gov.za");
        System.out.println(myObject.getEmailAddress());
    }
}
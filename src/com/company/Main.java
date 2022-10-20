package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args){


        ArrayList<Port> portArray = new ArrayList<>();

        Port Mombasa = new Port(4500,"Mombasa");
        portArray.add(0, Mombasa);

        Port DarEsSalaam = new Port(-5000, "DarEsSalaam");
        portArray.add(1, DarEsSalaam);

        Port JawaharlalNehru = new Port(4000, "JawaharlalNehru");
        portArray.add(2, JawaharlalNehru);

        Port TanjungPelepas = new Port(-19000,"TanjunPelepas");
        portArray.add(3, TanjungPelepas);

        Port Zanzibar = new Port(2000,"Zanzibar");
        portArray.add(4, Zanzibar);

        Port Salalah = new Port(9000,"Salalah");
        portArray.add(5,Salalah);

        Port JebelAliDubai = new Port(9500,"JebelAliDubai");
        portArray.add(6, JebelAliDubai);


/*        ArrayList<Integer> portArray = new ArrayList<>();

        portArray.add(0, 4500);
        portArray.add(1, -5000);
        portArray.add(2, -1000);
        portArray.add(3, -19000);
        portArray.add(4, 2000);
        portArray.add(5, 9000);
        portArray.add(6, 9500);

  */
        //evt. lave en metode, hvor nedenstående er i

     //   int n = portArray.size();
        System.out.println("Listen efter sort: ");
        System.out.println(portArray);
       Collections.sort(portArray);


        System.out.println("Listen efter sort: ");
        System.out.println(portArray);
        int i=0;
        int j=portArray.size()-1;



     /*   while (i != j && i <= portArray.size()/2 ) {

            if (portArray.get(i).containerAmount > 0 && portArray.get(j).containerAmount < 0) {

                if (portArray.get(i).containerAmount < portArray.get(j).containerAmount * (-1)) { // Hvis der er plads til at sende
                    portArray.get(j).containerAmount = portArray.get(j).containerAmount + portArray.get(i).containerAmount;
                    portArray.get(i).containerAmount = portArray.get(i).containerAmount - portArray.get(i).containerAmount;
                }

                    if (portArray.get(i).containerAmount >= portArray.get(j).containerAmount * (-1)){ // hvis der ikke plads til at sende

                        portArray.get(i).containerAmount = portArray.get(i).containerAmount-(portArray.get(j).containerAmount*(-1));
                        portArray.get(j).containerAmount = portArray.get(j).containerAmount+(portArray.get(j).containerAmount*(-1));
                    }

                    if (portArray.get(i).containerAmount == 0) {
                        i++;
                    }
                    if (portArray.get(j).containerAmount == 0) {
                        j--;
                    }
                }
            System.out.println(portArray);
            }*/
    }
}


class Port implements Comparable<Port> {

    public int containerAmount;
    public String name;

    public Port(int containerAmount, String name){
        this.containerAmount = containerAmount;
        this.name = name;
    }

    @Override
    public int compareTo (Port p) {
        if (this.containerAmount > p.containerAmount){
            return 1;
        } else {
            return 0;
        }


    }
    @Override
    public String toString () {
        return ""+containerAmount;
    }

    /*public int containerAmount() {
        int n = receivedContainers - shippedContainers;
        return n;


    public int containerSurplus() {
        int m = containerAmount() - shippedContainers;
        return m;
    }

}
    /*public int getContainerAmount() {
        return containerAmount;
*/
}
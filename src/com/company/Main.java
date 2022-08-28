package com.company;

public class Main {
    public static void main(String[] args) {
        solarSystem inception = new solarSystem();
        inception.Sun = 1;
        inception.Moon = 4;
        inception.Planets=2;

        System.out.println("the basic structure is ready");

        //    developing the feature SUN
        SUN omaro=new SUN();
        omaro.temperature="12334433kj";
        omaro.name="ferro";
        omaro.radius=1234455;
        omaro.color="pink";

        //  Developing Planet2
        Planet2 superwomen = new Planet2();
        superwomen.size="766585857km";
        superwomen.name="pliea";
        superwomen.color="green";


    }

}

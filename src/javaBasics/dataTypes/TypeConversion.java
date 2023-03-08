package javaBasics.dataTypes;

public class TypeConversion {

    public static  void main(String[] args){

        //implicit conversion
        byte firstVal=127;
        int secondVal=256;
        secondVal=firstVal;

        System.out.println(secondVal);

        //explicit Byte conversion
        byte thirdVal=127;
        int fourthVal=257;
        thirdVal=(byte)fourthVal;

        System.out.println(thirdVal);


        //explicit int conversion

        float f=5.6f;
        int i=(int)f;

        System.out.println(i);
    }
}

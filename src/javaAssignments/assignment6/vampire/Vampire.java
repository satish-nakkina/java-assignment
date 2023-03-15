package javaAssignments.assignment6.vampire;

import java.util.Arrays;

public class Vampire {

    public boolean isVampireNumber(int num){

        String numberString=String.valueOf(num);
        int length=numberString.length();

        if(length%2!=0){
            return false;
        }

        int []freq= new int[10];
        for(int it=0;it<length;it++){
            int val=numberString.charAt(it)-'0';
            freq[val]++;
        }

        for(int firstFactor=10;firstFactor<=Math.sqrt(num);firstFactor++){
            if(num%firstFactor==0){
                int secondFactor=num/firstFactor;
                if(String.valueOf(firstFactor).endsWith("0") &&  String.valueOf(secondFactor).endsWith("0")){
                    continue;
                }
                String combinedFactor=String.valueOf(firstFactor)+String.valueOf(secondFactor);

                if(combinedFactor.length()!=length){
                    continue;
                }
                int []combinedFactorFreq=new int[10];
                for(int it=0;it<length;it++){
                    int digit=combinedFactor.charAt(it)-'0';
                    combinedFactorFreq[digit]++;
                }
                if(Arrays.equals(freq,combinedFactorFreq)){
                    return true;
                }
            }
        }
        return false;
    }
}

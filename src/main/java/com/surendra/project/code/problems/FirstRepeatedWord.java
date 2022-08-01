package com.surendra.project.code.problems;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedWord {
    public static void main(String[] args) {
        String input = "Ravi had been saying that he had been th";
        FirstRepeatedWord obj = new FirstRepeatedWord();
        System.out.println("repeated value :  "+obj.firstRepWord(input));

    }

    public String firstRepWord(String data){
     Map<String,Integer> map = new HashMap<>();
     String str [] = data.split(" ");
   String repeated = null;
        for (int i = 0; i < str.length ; i++) {
            System.out.println(str[i]);
            if(map.containsKey(str[i]) && null ==repeated ){
                map.put(str[i],map.get(str[i])+1);
                repeated =str[i];

            }
            else{
                map.put(str[i],1);
            }
        }


        return repeated;
    }
}

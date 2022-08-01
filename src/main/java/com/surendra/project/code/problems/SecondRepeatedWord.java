package com.surendra.project.code.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SecondRepeatedWord {
    public static void main(String[] args) {
            String input = "Ravi had been saying that he had been th";
            SecondRepeatedWord obj = new SecondRepeatedWord();
            System.out.println("repeated value :  "+obj.secondRepWord(input));

        }

        public String secondRepWord(String data) {
            Map<String, Integer> map = new HashMap<>();
            String str[] = data.split(" ");
            String repeated = null;
            for (int i = 0; i < str.length; i++) {
                System.out.println(str[i]);
                if (map.containsKey(str[i])) {
                    map.put(str[i], map.get(str[i]) + 1);

                } else {
                    map.put(str[i], 1);
                }
            }
            Iterator<Map.Entry<String, Integer>> tt = map.entrySet().iterator();
            Integer minValue = Integer.MIN_VALUE;
            while (tt.hasNext()) {
                Map.Entry<String, Integer> entry = tt.next();
                if (minValue > entry.getValue()) {

                }
            }
            return "";
        }

}

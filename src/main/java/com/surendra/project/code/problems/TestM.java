package com.surendra.project.code.problems;

import javax.xml.ws.Response;
import java.util.*;

class X {
    int a;
    double d;
}
    class Y extends TestM{
        int c;
    }

public class TestM {


    public static void main(String[] args) {
      TestM obj = new TestM();
      Integer i = 4;
      obj.oddEven(i);
      List<Integer> list = Arrays.asList(2,2,3,3,4,7,5,7,8,8,8);
         System.out.println(obj.getFrequency(list));
    }

 public void oddEven(Integer no){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"ODD");
        map.put(0,"EVEN");
     System.out.println(map.get(no%2));

 }
    public Map<Integer,Integer> getFrequency(List<Integer> list){
        Map<Integer,Integer> result = new HashMap<>();
        for (Integer value: list) {

            if(value%2!=0){
                if(result.containsKey(value)){
                    result.put(value,result.get(value)+1);
                }
                else{
                    result.put(value,1);
                }
            }
        }

      return result;
    }
}

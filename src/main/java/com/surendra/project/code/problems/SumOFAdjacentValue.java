package com.surendra.project.code.problems;

public class SumOFAdjacentValue {
    public static void main(String[] args) {
        int [] array = {5, 5, 10, 100, 10, 5};
        SumOFAdjacentValue obj = new SumOFAdjacentValue();
        System.out.println("max sum "+obj.sumOfNonAdjacentValue(array));

    }

    private int sumOfNonAdjacentValue(int ar[]){
        int incl=ar[0];
        int excl=0;
        int exclNw;
        for (int i = 1; i <ar.length ; i++) {
            exclNw =Math.max(incl,excl);
            incl=excl+ar[i];
            excl=exclNw;

        }
        System.out.println("include "+incl+" exclude "+excl);
        return Math.max(incl,excl);
    }
}

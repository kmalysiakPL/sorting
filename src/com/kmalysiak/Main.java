package com.kmalysiak;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer [] nums  = {18,3,4,3,1,192,238,32};
        Integer [] results = insort(nums);

        System.out.println("results" + Arrays.toString(results) );





    }

    public static Integer[] insort (Integer[] numToSort){


        for (int i = 0; i < numToSort.length; i++) {

            for (int j = i; j >0 ; j--) {
                if(numToSort[j-1]>numToSort[j]){
                    Integer temp =  numToSort[j];
                    numToSort[j] = numToSort[j-1];
                    numToSort[j-1]=temp;
                }
            }

        }

        return numToSort;
    }
}

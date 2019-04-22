package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> temperatureList = new ArrayList<Integer>();
        temperatureList.add(405);
        temperatureList.add(339);
        temperatureList.add(378);
        temperatureList.add(153);
        temperatureList.add(256);

        System.out.println(temperatureList);
        Collections.sort(temperatureList);
        System.out.println(temperatureList);
        Collections.reverse(temperatureList);
        System.out.println(temperatureList);

        int searchIndex = Collections.binarySearch(temperatureList, 339);
        if(searchIndex >=0){
            System.out.println("Temperature found." + searchIndex);
        }else{
            System.out.println("Temperature not found." + searchIndex);
        }
    }
}
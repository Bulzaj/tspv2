package main;

import nna.City;
import nna.TSP;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class Mian {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        ArrayList<City> cities = new ArrayList<>();
        String [] names = {
                "a",
                "b",
                "c",
                "d",
                "e",
                "f",
                "g",
                "h"
        };



        int n, start;
        City tmpCity;
        Scanner s = new Scanner(System.in);

        System.out.println("Podaj ilość miast: ");
        n = s.nextInt();

        String name;
        int x,y;

        for(int i=0; i<n; i++) {
            System.out.println(String.format("Miasto: %s", names[i]));
            System.out.println("Podaj x: ");
            x = s.nextInt();
            System.out.println("Podaj y: ");
            y = s.nextInt();
            tmpCity = new City(names[i], x, y);
            cities.add(tmpCity);
            System.out.println("===============");
        }

        System.out.println("Start: ");
        start = s.nextInt()-1;
        System.out.println("===============");


//	 	cities.add(new City("a", 1, 6));
//		cities.add(new City("b", 5, 5));
//		cities.add(new City("c", 9, 5));
//		cities.add(new City("d", 5, 1));
//		cities.add(new City("e", 8, 1));

        TSP tsp = new TSP(cities, cities.get(start));
        tsp.NNA();
    }
}

package nna;

import java.util.ArrayList;

public class TSP {

    private ArrayList<City> cities;
    private City startingCity;
    private City actualCity;
    private City lastCity;
    private double distance;

    public TSP(ArrayList <City> cities, City startingCity) {
        this.cities = cities;
        this.startingCity = startingCity;
        this.actualCity = startingCity;
        this.distance = 0;
    }

    public void NNA() {
        for(int i=0; i<cities.size()+1; i++) {
            System.out.println(i);


            if(i!=this.cities.size()) {
                this.praintData();
                this.addToVisited();
                this.countNextCity();
            } else {
                this.distance += this.actualCity.countDIstance(startingCity);
                this.actualCity = this.startingCity;
                this.praintData();
            }
        }
    }

    private void countNextCity() {
        double minDistance = 1000000;
        City tmpCity = null;
        for(City city : this.cities) {
            if(!city.wasVisited()) {
                if(this.actualCity.countDIstance(city) != 0) {
                    if(this.actualCity.countDIstance(city) < minDistance) {
                        minDistance = this.actualCity.countDIstance(city);
                        tmpCity = city;
                    }
                }
            }
        }
        if(tmpCity != null) {
            this.distance += this.actualCity.countDIstance(tmpCity);
            this.actualCity = tmpCity;
        }
    }

    private void addToVisited() {
        this.actualCity.changeToVisited();
    }

    private void praintData() {
        System.out.println("Actual City: " + this.actualCity.getName());
        System.out.println("Distance: " + this.distance);
        System.out.print("Visited cities: ");
        for(City city : this.cities) {
            if(city.wasVisited()) {
                System.out.print(city.getName() + " ");
            }
        }
        System.out.println("");
        System.out.println("=============================");
    }
}

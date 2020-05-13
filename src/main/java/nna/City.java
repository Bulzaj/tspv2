package nna;

public class City {

    private String name;
    private int x;
    private int y;
    private boolean wasVisited;

    public City(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.wasVisited = false;
    }

    public String getName() {
        return this.name;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public boolean wasVisited() {
        return this.wasVisited;
    }

    public void changeToVisited() {
        this.wasVisited = true;
    }

    public void changeToUnvisited() {
        this.wasVisited = false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        City other = (City) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

    public double countDIstance(City city) {

        double distance;

        int x2 = city.getX();
        int x1 = this.getX();
        int y2 = city.getY();
        int y1 = this.getY();

        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double tmp = (double)(distance*(Math.pow(10, 1)));
        tmp = (Math.round(tmp));
        tmp = tmp/(int)(Math.pow(10, 1));
        return distance;
    }
}

// Encapsulation to protect the essence of the inner work of the Class. Only expose the getters and setters of this instance member
//People outside the Class can get the Data by the getter and Set outside by the setter
//Getters and Setters allows to access the otherwise private data
//Usually make instance variables private
//To make a variable public use contant variables which are final and this wont allow it to be changed outside the Class
//The idea is to make everything private, if you can make it private, make it private --- PRIVATE
//If you want the subclasses to use the data, make it Protected -- PROTECTED
//End user to user the data and change it make it public --- PUBLIC
//Encapsulation prevents the Classes from calling each other all the time.
//only have public Methods that are clearly documented and don't change ofter, the rest kept with the Class

package us.encapsulation.io;

class Car{

    public static final int speed = 150;
    private String type;

    public String getType() {
        return type;
    }

    public String getRevenueData{
        String data = "Revenue: " + calculateRevenue();
        return data; //This won't allow people to change, provided only a get Method
    }
    private int calculateRevenue(){
        return 12000;
    }

    public void setType(String type) {
        this.type = type;
    }
}

public class App {

    public static void main(String[] args) {

    }
}

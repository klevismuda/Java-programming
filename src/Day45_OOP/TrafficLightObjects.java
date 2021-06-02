package Day45_OOP;

public class TrafficLightObjects {
    public static void main(String[] args) {
        // create traffic object
        TrafficLight trafficLight = new TrafficLight();
        // trafficLight.color = "red";  its not a good practice
        // we will assign/update the value of color using a method
        trafficLight.changeColor("red");
        ///System.out.println("current color = " + trafficLight.color); DIRECT access to variable. Not recommended
        //call method to access the variable:
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("blue");
        trafficLight2.showColor();

    }
}

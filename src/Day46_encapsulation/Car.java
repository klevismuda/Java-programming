package Day46_encapsulation;

public class Car {
    // encapsulate/ hidden instance variable
    private String model;
    private int year;
    private int mileage;

    //setter method for model
    public void setModel(String carModel){
        model = carModel;
    }
    //getter method for model
    public String getModel(){
        return model;
    }
    public void setYear(int year){
     // year = year;   its the same variable name and it doesnt work
        this.year = year;
        /**
         *  this.year = year;  its to use same name, put this.
         */
    }
    public int getYear(){
        return year;
    }
    public void setMileage(int mileage){
        this.mileage = mileage;
    }
    public int getMileage(){
        return mileage;
    }
    //generate toString
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}

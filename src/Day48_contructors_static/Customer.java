package Day48_contructors_static;

public class Customer {
    private String name;
    private int id;

    //No-Args constructor
    public Customer(){
        System.out.println("No-Args constructor");
        name = "New customer";
        id = -1;
    }

    // add a constructor where we can assign name and id

    public Customer(String name, int id){
        System.out.println("2-args constructor");
        this.name = name; //setName(name);
        this.id = id;     // setId(id);   when we have some conditions in setter
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

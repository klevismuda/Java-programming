package Day52_inheritacne.discordUsers;

public class Admin extends User{

    public Admin(){
        super();//call super class/User class no-args constructor POR edhe nuk e vendosim vjen
        System.out.println("Admin class constructor");
    }

    public Admin(String name, int id){
        super("Admin", name, id);
        System.out.println("Admin class 2 args constructor");
    }

    @Override
    public String toString() {
        return "Admin{" +
                "role='" + getRole() + '\'' +
                ", name='" + getName() + '\'' +
                ", id=" + getId() +
                '}';
    }


}

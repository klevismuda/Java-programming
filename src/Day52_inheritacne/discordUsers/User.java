package Day52_inheritacne.discordUsers;

public class User {
    private String role;
    private String name;
    private int id;

    public User(){
        System.out.println("User class constructor");
    }
// CONSTRUCTOR ARE WRITTEN WITH THE SAME CLASS NAME AND ALSO SUBCLASS WITH THE SAME NAME WITH SUBCLASS NAME. AND WITH SAME SIGNATURE
    public User(String role, String name, int id) {
        this.role = role;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

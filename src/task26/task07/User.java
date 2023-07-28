package task26.task07;

public class User {
    private static int yeniId=1;

   private int id;
    private String username;
    private String password;
    private boolean active;
    private boolean signedIn;

    public User(String username, String password){
        this.id=yeniId++;
        this.username=username;
        this.password=password;
        this.active= true;
        this.signedIn= false;
    }

    public static int getYeniId() {
        return yeniId;
    }

    public boolean passwordKontrol(){
        return password.length()>=6;

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", signedIn=" + signedIn +
                '}';
    }
}

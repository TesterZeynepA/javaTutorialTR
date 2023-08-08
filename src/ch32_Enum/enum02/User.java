package ch32_Enum.enum02;

import java.util.Set;

public class User {//POJO CLASS

    String name;

    Role role;
    Status status;
     Set<Role> roles;


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role=" + role +
                ", status=" + status +
                ", roles=" + roles +
                '}';
    }
}

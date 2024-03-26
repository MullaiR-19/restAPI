package com.example.springAPI.Service;
import com.example.springAPI.myAPI.model.User;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.*;

@Service
public class UserService {
    private List<User> userlist;

    public UserService(){
        userlist = new ArrayList<>();

        User user1 = new User(1,"Mullai","mullai@mail.com","password");
        User user2 = new User(2,"Hari","hari@mail.com","password");
        User user3 = new User(3,"Sanmuga","sanmuga@mail.com","password");

        userlist.addAll(Arrays.asList(user1,user2,user3));
    }
    public Optional<User> getUser(String name){

        Optional optional = Optional.empty();
        for(User user: userlist){
            if(Objects.equals(name, user.getName())) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
    public User addUser(User user){
        System.out.println(user);
        userlist.add(user);
        return user;
    }
}
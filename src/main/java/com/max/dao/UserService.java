package com.max.dao;

import com.max.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ilya on 06.03.2015.
 */
@Component
public class UserService {
    List <User> list = new ArrayList<User>();

    public UserService(){
        list.add(createDummy(1, "Peter", "Ivanov", "mail@mail.us"));
        list.add(createDummy(2, "Vano", "Petrov", "mail1@mail.us"));
        list.add(createDummy(3, "Sash", "Ivanov", "mail2@mail.us"));
    }

    public List<User> getAllUsers(){
        return list;
    }

    public User getUserById(int id){
         for(User user: list){
             if(user.getUserid() == id){
                 return user;
             }
         }
        return null;
    }


    private User createDummy(int id, String first, String last, String mail){
        User user = new User();
        user.setUserid(id);
        user.setFirstName(first);
        user.setLastName(last);
        user.setEmail(mail);
        return user;
    }
}

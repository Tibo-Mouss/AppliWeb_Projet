package org.jboss.as;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Singleton;

import org.jboss.as.User;

@Singleton
public class Facade {
    
    List<Manga> mangas = new ArrayList();
    List<User> users = new ArrayList();

    public List<User> getUsers() {
        return users;
    }

    public List<Manga> getMangas() {
        return mangas;
    }

    public addUser(User usr){
        users.add(usr);
    }

    public addManga(Manga manga){
        mangas.add(manga);
    }

    
}

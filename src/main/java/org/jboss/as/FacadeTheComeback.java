package org.jboss.as;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Singleton;

import org.jboss.as.Review;
import org.jboss.as.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
public class FacadeTheComeback {

    @PersistenceContext
    EntityManager em;
    
    private List<Manga> mangas = new ArrayList();
    private List<User> users = new ArrayList();

    public List<User> getUsers() {
        return users;
    }

    public List<Manga> getMangas() {
        return mangas;
    }

    public void addReview(int idUser, int idManga, int grade, String text){
        Review rev = new Review();
        rev.setAuthor(em.find(User.class, idUser));
        rev.setComment(text);
        rev.setGrade(grade);
        Manga temp = em.find(Manga.class, idManga);
        temp.getReviews().add(rev);
        em.persist(temp);
    }



    public void addToFavorite(int idUser, int idManga){
        User usr = em.find(User.class, idUser);
        Manga mg = em.find(Manga.class, idManga);
        usr.getFavorites().add(mg);
    }

    public void searchbyGenre(){
        //TODO
    }
    //getReviews
    

    


}

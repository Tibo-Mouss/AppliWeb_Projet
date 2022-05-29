package org.jboss.as;


@Entity
public class Review {
    
    @Id
    @GeneratedValue
    private int id_review;
    private String comment;
    private int mark;

    @ManyToOne
    private User author_com;

    public Review(){}

    public int getId(){
        return this.id_review;
    }

    public String getComment(){
        return this.comment;
    }

    public int getMark(){
        return this.mark;
    }

    public User getAuthor(){
        return this.author_com;
    }

    public void setComment(String com){
        this.comment = com;
    }

    public void setMark(int mark){
        this.mark = mark;
    }

    public void setAuthor(User mec){
        this.author_com = mec;
    }
}

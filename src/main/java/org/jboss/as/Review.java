package org.jboss.as;

@Entity
public class Review {
    
    @Id
    @GeneratedValue
    private int id;
    private String comment;
    private int grade;

    @ManyToOne
    private User author_com;

    public Review(){}

    public int getId(){
        return this.id;
    }

    public String getComment(){
        return this.comment;
    }

    public int getMark(){
        return this.grade;
    }

    public User getAuthor(){
        return this.author_com;
    }

    public void setComment(String com){
        this.comment = com;
    }

    public void setMark(int mark){
        this.grade = mark;
    }

    public void setAuthor(User mec){
        this.author_com = mec;
    }
}

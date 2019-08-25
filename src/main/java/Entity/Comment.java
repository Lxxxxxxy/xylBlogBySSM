package Entity;

import Entity.Comment;

public class Comment {
    private int num;
    private int id;
    private String comment;
    private String time;
    private String name;

    public int getNum() {
        return this.num;
    }


    public void setNum(int num) {
        this.num = num;
    }


    public int getId() {
        return this.id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getComment() {
        return this.comment;
    }


    public void setComment(String comment) {
        this.comment = comment;
    }


    public String getTime() {
        return this.time;
    }


    public void setTime(String time) {
        this.time = time;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Comment(int num, int id, String comment, String time, String name) {
        this.num = num;
        this.id = id;
        this.comment = comment;
        this.time = time;
        this.name = name;
    }

    public Comment() {
    }
}
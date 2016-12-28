package kr.co.ana.sojun1221;

public class Student {

    boolean isLeft;
    String name;
    long id;

    public Student(boolean isLeft, String name, long id) {
        this.isLeft = isLeft;
        this.name = name;
        this.id = id;
    }

    public boolean isLeft() {
        return isLeft;
    }

    public void setIsLeft(boolean isLeft) {
        this.isLeft = isLeft;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

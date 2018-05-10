package hello.entity;

/**
 * Created by yang on 2018/5/8.
 */
public class Student{
    int id;
    String sname;
    String spwd;
    String sclass;



    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSpwd() {
        return spwd;
    }

    public void setSpwd(String spwd) {
        this.spwd = spwd;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", spwd='" + spwd + '\'' +
                ", sclass='" + sclass + '\'' +
                '}';
    }
}

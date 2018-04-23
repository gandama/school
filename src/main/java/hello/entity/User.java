package hello.entity;

/**
 * Created by yang on 2018/1/29.
 */
public class User {

    private int id;
    private String mname;
    private String mpwd;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMpwd() {
        return mpwd;
    }

    public void setMpwd(String mpwd) {
        this.mpwd = mpwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", mname='" + mname + '\'' +
                ", mpwd='" + mpwd + '\'' +
                '}';
    }
}

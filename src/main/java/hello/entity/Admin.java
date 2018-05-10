package hello.entity;

/**
 * Created by yang on 2018/5/8.
 */
public class Admin {
    int id;
    String mname;
    String mpwd;

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
        return "Admin{" +
                "id=" + id +
                ", mname='" + mname + '\'' +
                ", mpwd='" + mpwd + '\'' +
                '}';
    }
}

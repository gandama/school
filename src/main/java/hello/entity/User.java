package hello.entity;

/**
 * Created by yang on 2018/1/29.
 */
public class User {

   int id;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                '}';
    }
}

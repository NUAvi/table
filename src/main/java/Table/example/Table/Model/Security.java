package Table.example.Table.Model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Security")
public class Security {
    @Id
    @GeneratedValue
    private int user_Id;
    private String user_name;
    private String password;
    private String role;

    public Security() {
    }

    public Security(int user_Id, String user_name, String password, String role) {
        this.user_Id = user_Id;
        this.user_name = user_name;
        this.password = password;
        this.role = role;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Security{" +
                "user_Id=" + user_Id +
                ", user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

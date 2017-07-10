
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Alexys
 */
@Named(value = "users")
@SessionScoped
@ManagedBean

public class users {

    private String username;
    private String email;

    public users() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Creates a new instance of users
     *
     * @param username
     * @param email
     */
    public void createUsers() {
        Connection con = database.getConnection();
        String query = "INSERT INTO users VALUES (NULL, ?)";
        try {
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, username);
            int numberOfRows = statement.executeUpdate();
            if (numberOfRows > 0) {
                System.out.println("Success");
            } else {
                System.out.println("No success");
            }
        } catch (SQLException e) {
            System.out.println(username);
            System.out.println(email);
            System.out.println(e.getMessage());
        }
    }
}

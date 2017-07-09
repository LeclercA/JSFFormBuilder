
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;

/**
 *
 * @author Alexys
 */
@Named(value = "users")
@Dependent
@ApplicationScoped
@ManagedBean

public class users {

    private String username;
    private String email;

    
    public users(){}
    public users(String username, String email) {
        this.username = username;
        this.email = email;
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

}

package testmongoapi;

import org.json.simple.JSONObject;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author abhishekmukhopadhyay
 */
@Document(collection = "cards_login")
public class CardsLogin
{

    private String username;
    private String password;
    private int role;
    private boolean active;
    private JSONObject riskprofile;

    public CardsLogin(String username, String password, int role, boolean active, JSONObject riskprofile)
    {
        super();

        this.username = username;
        this.password = password;
        this.role = role;
        this.active = active;
        this.riskprofile = riskprofile;
    }

}

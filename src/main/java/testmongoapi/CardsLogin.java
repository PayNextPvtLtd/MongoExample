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
    private Integer role;
    private Boolean active;
    private JSONObject riskprofile;

    public CardsLogin(String username, String password, Integer role, Boolean active, JSONObject riskprofile)
    {
        super();

        this.username = username;
        this.password = password;
        this.role = role;
        this.active = active;
        this.riskprofile = riskprofile;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Integer getRole()
    {
        return role;
    }

    public void setRole(Integer role)
    {
        this.role = role;
    }

    public Boolean getActive()
    {
        return active;
    }

    public void setActive(Boolean active)
    {
        this.active = active;
    }

    public JSONObject getRiskprofile()
    {
        return riskprofile;
    }

    public void setRiskprofile(JSONObject riskprofile)
    {
        this.riskprofile = riskprofile;
    }

}

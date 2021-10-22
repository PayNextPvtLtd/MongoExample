package testmongoapi;

import org.json.simple.JSONObject;

/**
 *
 * @author abhishekmukhopadhyay
 */
public class APICardsLogin
{

    private String username;
    private String password;
    private int role;
    private JSONObject riskprofile;

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

    public int getRole()
    {
        return role;
    }

    public void setRole(int role)
    {
        this.role = role;
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

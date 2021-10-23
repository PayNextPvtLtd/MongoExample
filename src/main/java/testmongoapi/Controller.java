package testmongoapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author abhishekmukhopadhyay
 */
@RestController
public class Controller
{

    @Autowired
    ICardsLogin cardsLoginRepo;

    /**
     *
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home()
    {
        String rsp;

        rsp = "Yes, I am here !!!\n";

        return rsp;
    }

    /**
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/addrecord", method = RequestMethod.POST, headers = "Accept=application/json")
    public String addrecord(@RequestBody APICardsLogin request)
    {
        String rsp;

        cardsLoginRepo.save(new CardsLogin(request.getUsername(), request.getPassword(), request.getRole(), true, request.getRiskprofile()));

        rsp = String.format("Total records = %d\n", cardsLoginRepo.count());

        return rsp;
    }

    /**
     * 
     * @param username
     * @return 
     */
    @RequestMapping(value = "/findbyuser", method = RequestMethod.GET)
    public ResponseEntity<CardsLogin> findbyuser(@RequestParam String username)
    {
        String rsp;
        Gson clgson = new Gson();

        CardsLogin cl = cardsLoginRepo.findItemByName(username);
        
        rsp = clgson.toJson(cl);

        return new ResponseEntity<>(cl, HttpStatus.OK);
    }

    /**
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/transaction", headers = "Accept=application/json", method = RequestMethod.POST)
    public String transaction(@RequestBody String request)
    {
        String rsp;

        rsp = "Ok";

        return rsp;
    }

}

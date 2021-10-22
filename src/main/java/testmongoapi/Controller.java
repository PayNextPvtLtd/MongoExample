package testmongoapi;

import java.util.concurrent.CompletableFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author abhishekmukhopadhyay
 */
@RestController
public class Controller
{

    @Autowired
    ICardsLogin cardsLoginRepo;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home()
    {
        String rsp;

        rsp = "Yes, I am here !!!\n";

        return rsp;
    }

    @RequestMapping(value = "/addrecord", method = RequestMethod.POST, headers = "Accept=application/json")
    public String addrecord(@RequestBody APICardsLogin request)
    {
        String rsp;
        
        cardsLoginRepo.save(new CardsLogin(request.getUsername(), request.getPassword(), request.getRole(), true, request.getRiskprofile()));

        rsp = "Done.\n";

        return rsp;
    }

    @RequestMapping(value = "/transaction", headers = "Accept=application/json", method = RequestMethod.POST)
    public String transaction(@RequestBody String request)
    {
        String rsp;

        rsp = "Ok";

        return rsp;
    }

}

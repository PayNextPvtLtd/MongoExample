package testmongoapi;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author abhishekmukhopadhyay
 */
public interface ICardsLogin extends MongoRepository<CardsLogin, String>
{
    @Query("{username: '?0'}")
    CardsLogin findItemByName(String name);
    
    @Override
    public long count();
}

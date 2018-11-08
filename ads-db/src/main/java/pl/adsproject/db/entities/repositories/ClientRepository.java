package pl.adsproject.db.entities.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.adsproject.db.entities.Client;

public interface ClientRepository extends CrudRepository<Client, Integer> {
    Client findByClientId(Integer clientId);
}

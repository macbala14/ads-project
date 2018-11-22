package pl.adsproject.db.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.adsproject.db.entities.Client;

public interface ClientRepository extends CrudRepository<Client, Integer> {
    Client findByClientId(int clientId);
}

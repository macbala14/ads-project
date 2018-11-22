package pl.adsproject.rest.controllers;


import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.adsproject.db.Connections.CassandraConnector;
import pl.adsproject.db.entities.Client;
import pl.adsproject.db.repositories.ClientRepository;


@RestController
@RequestMapping("/")
public class FirstController {

//


    @Autowired
    ClientRepository clientRepository;

    @RequestMapping(method = RequestMethod.GET, value ="/first")
    @ResponseBody
    public String return7(){
        return "7";
    }


    //test cassandra connection
    @RequestMapping(method = RequestMethod.GET, value ="/cassandra")
    @ResponseBody
    public String getCassaandraConnection() {
        CassandraConnector cassandraConnector = new CassandraConnector();
        cassandraConnector.connect("127.0.0.1", 9042);
        Row row = cassandraConnector.getSession().execute("SELECT * FROM ads_project.ratings;").one();
        return row.toString();
    }



    @RequestMapping(method = RequestMethod.GET, value="/user")
    @ResponseBody
    public Client getClient(){
        return clientRepository.findByClientId(1);
    }
}

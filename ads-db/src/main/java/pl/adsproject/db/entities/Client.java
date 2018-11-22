package pl.adsproject.db.entities;


import javax.persistence.*;
import java.util.Collection;
import java.util.UUID;


@Entity
public class Client {
    private UUID clientId;
    private String name;
    private String password;
    private Collection<Category> categoriesByClientId;

    @Id
    @Column(name = "client_id")
    public UUID getClientId(){
        return clientId;
    }

    public void setClientId(UUID clientId){
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

//    @OneToMany(mappedBy = "clientByClientId", cascade = CascadeType.ALL)
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "client_category",
        joinColumns = @JoinColumn(name = "client_id"),
        inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    public Collection<Category> getCategoriesByClientId() {
        return categoriesByClientId;
    }

    public void setCategoriesByClientId(Collection<Category> categoriesByClientId) {
        this.categoriesByClientId = categoriesByClientId;
    }


}

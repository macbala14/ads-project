package pl.adsproject.db.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.UUID;

@Entity
@IdClass(ClientCategoryPK.class)
public class ClientCategory {

    private UUID clientId;
    private UUID categoryId;
    private Client clientByClientId;

    @Id
    @Column(name = "client_id")
    public UUID getClientId(){
        return clientId;
    }

    public void setClientId(UUID clientId){
        this.clientId = clientId;
    }

    @Id
    @Column(name="category_id")
    public UUID getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(UUID categoryId) {
        this.categoryId = categoryId;
    }

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "client_id", nullable = false, insertable = false, updatable = false)
    public Client getClientByClientId() {
        return clientByClientId;
    }

    public void setClientByClientId(Client clientByClientId) {
        this.clientByClientId = clientByClientId;
    }


}

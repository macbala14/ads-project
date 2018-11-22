package pl.adsproject.db.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

public class ClientCategoryPK implements Serializable {
    private UUID clientId;
    private UUID categoryId;

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
}

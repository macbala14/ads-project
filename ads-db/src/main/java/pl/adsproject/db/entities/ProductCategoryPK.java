package pl.adsproject.db.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

public class ProductCategoryPK implements Serializable {
    private UUID productId;
    private UUID categoryId;

    @Id
    @Column(name = "product_id")
    public UUID getProductId(){
        return productId;
    }

    public void setProductId(UUID clientId){
        this.productId = productId;
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

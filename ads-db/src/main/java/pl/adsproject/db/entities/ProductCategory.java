package pl.adsproject.db.entities;

import javax.persistence.*;
import java.util.UUID;

@Entity
@IdClass(ProductCategoryPK.class)
public class ProductCategory {

    private UUID productId;
    private UUID categoryId;
    private Product productByProductId;
    private Category categoryByCategoryId;

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

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id", nullable = false, insertable = false, updatable = false)
    public Product getProductByProductId() {
        return productByProductId;
    }

    public void setProductByProductId(Product productByProductId) {
        this.productByProductId = productByProductId;
    }

}

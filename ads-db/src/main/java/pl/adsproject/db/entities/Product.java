package pl.adsproject.db.entities;


import javax.persistence.*;
import java.util.Collection;
import java.util.UUID;

@Entity
public class Product {

    private UUID productId;
    private String name;
    private Collection<Category> categoriesByProductId;

    @Id
    @Column(name = "product_id")
    public UUID getProductId(){
        return productId;
    }

    public void setProductId(UUID productId){
        this.productId = productId;
    }

    @Basic
    @Column(name = "name")
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

//    @ManyToMany(mappedBy = "productByProductId", cascade = CascadeType.ALL)
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "product_category",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    public Collection<Category> getCategoriesByProductId() {
        return categoriesByProductId;
    }

    public void setCategoriesByProductId(Collection<Category> categoriesByProductId) {
        this.categoriesByProductId = categoriesByProductId;
    }


}

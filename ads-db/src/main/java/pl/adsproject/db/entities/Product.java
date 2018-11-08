package pl.adsproject.db.entities;


import javax.persistence.*;

@Entity
public class Product {

    private Integer productId;
    private String name;
    private String category;



    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq")
    @SequenceGenerator(name = "product_seq", sequenceName = "product_id_seq", allocationSize = 1)
    @Column(name = "product_id")
    public Integer getProductId(){
        return productId;
    }

    public void setProductId(Integer productId){
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


    @Basic
    @Column(name = "category")
    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }
}

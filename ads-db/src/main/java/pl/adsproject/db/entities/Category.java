package pl.adsproject.db.entities;


import javax.persistence.*;
import java.util.Collection;
import java.util.UUID;

@Entity
public class Category {
    private UUID categoryId;
    private String name;
    private Collection<Tag> tagsByCategoryId;

    @Id
    @Column(name="category_id")
    public UUID getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(UUID categoryId) {
        this.categoryId = categoryId;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "categoriesByClientId")
    private Collection<Client> clients;

    @ManyToMany(mappedBy = "categoriesByProductId")
    private Collection<Product> products;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "category_tag",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    public Collection<Tag> getTagsByCategoryId() {
        return tagsByCategoryId;
    }

    public void setTagsByCategoryId(Collection<Tag> tagsByCategoryId) {
        this.tagsByCategoryId = tagsByCategoryId;
    }

//    @OneToMany(mappedBy = "categoryByCategoryId", cascade = CascadeType.ALL)
//    public Collection<Tag> getTagsByCategoryId() {
//        return tagsByCategoryId;
//    }
//
//    public void setTagsByCategoryId(Collection<Tag> tagsByCategoryId) {
//        this.tagsByCategoryId = tagsByCategoryId;
//    }


}

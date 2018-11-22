package pl.adsproject.db.entities;

import javax.persistence.*;
import java.util.UUID;

@Entity
@IdClass(CategoryTagPK.class)
public class CategoryTag {

    private UUID categoryId;
    private UUID tagId;
    private Category categoryByCategoryId;

    @Id
    @Column(name = "tag_id")
    public UUID getTagId(){
        return tagId;
    }

    public void setTagId(UUID tagId){
        this.tagId = tagId;
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
    @JoinColumn(name = "category_id", referencedColumnName = "category_id", nullable = false, insertable = false, updatable = false)
    public Category getCategoryByCategoryId() {
        return categoryByCategoryId;
    }

    public void setCategoryByCategoryId(Category categoryByCategoryId) {
        this.categoryByCategoryId = categoryByCategoryId;
    }
}

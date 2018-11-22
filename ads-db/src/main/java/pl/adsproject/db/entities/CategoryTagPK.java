package pl.adsproject.db.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

public class CategoryTagPK implements Serializable {
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
}

package pl.adsproject.db.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.UUID;

@Entity
public class Tag {
    private UUID tagId;
    private String tagName;


    @Id
    @Column(name = "tag_id")
    public UUID getTagId() {
        return tagId;
    }

    public void setTagId(UUID tagId) {
        this.tagId = tagId;
    }

    @Column(name = "tag_name")
    public String getTagName() { return tagName;}

    public void setTagName(String tagName) { this.tagName = tagName;}

    @ManyToMany(mappedBy = "tagsByCategoryId")
    private Collection<Category> categories;
}

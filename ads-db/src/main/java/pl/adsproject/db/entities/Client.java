package pl.adsproject.db.entities;


import javax.persistence.*;


@Entity
public class Client {
    private Integer clientId;
    private String name;
    private String password;
    private String interests;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_seq")
    @SequenceGenerator(name = "client_seq", sequenceName = "client_id_seq", allocationSize = 1)
    @Column(name = "client_id")
    public Integer getClientId(){
        return clientId;
    }

    public void setClientId(Integer clientId){
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    @Basic
    @Column(name ="interests")
    public String getInterests(){
        return  interests;
    }

    public void setInterests(String interests){
        this.interests = interests;
    }

}

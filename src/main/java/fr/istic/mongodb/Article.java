package fr.istic.mongodb;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import java.util.*;
import org.bson.types.ObjectId;

@Entity
public class Article {

    @Id
    private ObjectId id;
    private String name;
    private int starts;
    private List<Person> buyers = new ArrayList<Person>();

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStarts() {
        return starts;
    }

    public void setStarts(int starts) {
        this.starts = starts;
    }

    public List<Person> getBuyers() {
        return buyers;
    }

    public void setBuyers(Person buyer) {
        this.buyers.add(buyer);
    }

}

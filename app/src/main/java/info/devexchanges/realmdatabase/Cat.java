package info.devexchanges.realmdatabase;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Cat extends RealmObject {

    private String name;

    @PrimaryKey
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

package info.devexchanges.realmdatabase;

import io.realm.RealmObject;

public class Kitten extends RealmObject {

    private String name;
    private Cat cat;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

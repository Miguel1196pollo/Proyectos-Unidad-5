package mx.edu.utng.testrealm.models;

/**
 * Created by Toshiba on 13/04/2017.
 */
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import mx.edu.utng.testrealm.application.MyApplication;


public class Dog extends RealmObject {

    @PrimaryKey
    private int Id;
    private String Name;

    public Dog() {} // Only for Realm

    public Dog(String name) {
        Id = MyApplication.DogID.incrementAndGet();
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

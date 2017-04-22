package mx.edu.utng.seccion_04_realm.app;


import android.app.Application;



/**
 * Created by Toshiba on 13/04/2017.
 */
        import java.util.concurrent.atomic.AtomicInteger;

        import io.realm.Realm;
        import io.realm.RealmConfiguration;
        import io.realm.RealmObject;
        import io.realm.RealmResults;
import mx.edu.utng.seccion_04_realm.models.Board;
import mx.edu.utng.seccion_04_realm.models.Note;


public class MyApplication extends Application {

    public static AtomicInteger BoardID = new AtomicInteger();
    public static AtomicInteger NoteID = new AtomicInteger();

    @Override
    public void onCreate() {
        setUpRealmConfig();

        Realm realm = Realm.getDefaultInstance();
        BoardID = getIdByTable(realm, Board.class);
        NoteID = getIdByTable(realm, Note.class);
        realm.close();
    }

    private void setUpRealmConfig() {
        RealmConfiguration config = new RealmConfiguration
                .Builder(getApplicationContext())
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(config);
    }

    private <T extends RealmObject> AtomicInteger getIdByTable(Realm realm, Class<T> anyClass) {
        RealmResults<T> results = realm.where(anyClass).findAll();
        return (results.size() > 0) ? new AtomicInteger(results.max("id").intValue()) : new AtomicInteger();
    }

}
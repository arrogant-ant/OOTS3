package nnk.com.oots3.local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by Sud on 6/2/18.
 */
@Database(entities = {Product.class},version = 1)
public abstract class ProductDatabase extends RoomDatabase {
    public abstract ProductDao productDao();


    //for singleton
    private static ProductDatabase databaseInstance;
    private ProductDatabase() {

    }
    public static ProductDatabase getInstance(Context context)
    {
        if(databaseInstance==null)
            databaseInstance= Room.databaseBuilder(context,
                    ProductDatabase.class, "database-OOTS").build();
        return databaseInstance;
    }
}

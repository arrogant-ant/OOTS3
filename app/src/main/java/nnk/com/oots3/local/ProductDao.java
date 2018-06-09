package nnk.com.oots3.local;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

/**
 * Created by Sud on 6/2/18.
 */
@Dao
public interface ProductDao {
    @Insert
    void addProduct(Product product);

    @Delete
    void deleteProduct(Product product);

    @Update
    void updateProduct(Product product);

    @Query("SELECT * FROM  Product WHERE id=:id LIMIT 1")
    Product getProduct(int id);
}

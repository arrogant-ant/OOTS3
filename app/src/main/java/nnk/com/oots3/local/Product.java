package nnk.com.oots3.local;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.Nullable;

/**
 * Created by Sud on 6/2/18.
 */
@Entity(tableName = "Product")
public class Product {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    int id;

    @ColumnInfo(name = "productName")
    String productName;

    @ColumnInfo(name = "price")
    int price;

    @ColumnInfo(name = "description")
    String description;

    public Product(String productName, int price, String description) {
        this.productName = productName;
        this.price = price;
        this.description = description;
    }
}
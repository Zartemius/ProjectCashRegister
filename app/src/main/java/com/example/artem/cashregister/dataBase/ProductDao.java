package com.example.artem.cashregister.dataBase;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.artem.cashregister.dataBase.Product;

import java.util.List;


@Dao
public interface ProductDao {

    @Query("SELECT * FROM product")
    List<Product> getAll();

    @Query("SELECT * FROM product")
    List<Product> get();

    @Query("SELECT * FROM product where product_name LIKE :productName")
    Product findByName(String productName);

    @Query("SELECT COUNT(*) from product")
    public int countUsers();

    @Insert
    public void insertAll(Product...products);

    @Delete
    public void delete (Product product);

}

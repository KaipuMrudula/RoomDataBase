package com.example.manoj.roomdatabase;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@android.arch.persistence.room.Dao
public interface Dao {

    @Insert
    public void insertUser(Customer customer);

    @Query("select * from User")
    public List<Customer> getcustomerData();

    @Update
    public void updatedata(Customer customer);

    @Delete
    public void deleteData(Customer customer);
}

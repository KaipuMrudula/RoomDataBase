package com.example.manoj.roomdatabase;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = Customer.class,version = 1,exportSchema = false)
public abstract class MyDataBase extends RoomDatabase {

    public abstract Dao dao();
}


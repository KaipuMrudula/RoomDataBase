package com.example.manoj.roomdatabase;

import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    FragmentManager manager;

    static MyDataBase myDataBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager=getSupportFragmentManager();
        myDataBase= Room.databaseBuilder(this,MyDataBase.class,"Student").allowMainThreadQueries().build();
        manager.beginTransaction().replace(R.id.fragment,new Insert()).commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.insert:
                manager.beginTransaction().replace(R.id.fragment,new Insert()).commit();
                break;
            case R.id.read:
                manager.beginTransaction().replace(R.id.fragment,new Read()).commit();
                break;
            case R.id.update:
                manager.beginTransaction().replace(R.id.fragment,new Update()).commit();
                break;
            case R.id.delete:
                manager.beginTransaction().replace(R.id.fragment,new Delete()).commit();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

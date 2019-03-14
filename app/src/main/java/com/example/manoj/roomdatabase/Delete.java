package com.example.manoj.roomdatabase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Delete extends Fragment {
    EditText ed;
    Button bt;


    public Delete() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_delete, container, false);
        ed=v.findViewById(R.id.ed1);
        bt=v.findViewById(R.id.del);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // String string=ed.getText().toString();

                Customer user=new Customer();
                user.setUid(ed.getText().toString());

                MainActivity.myDataBase.dao().deleteData(user);

                Toast.makeText(getContext(), "Deleted Successfully", Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }

}

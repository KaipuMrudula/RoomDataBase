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
public class Insert extends Fragment {


    public Insert() {
        // Required empty public constructor
    }
    EditText sid,sname,smail,sphn;
    Button b1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_insert, container, false);
        sid=v.findViewById(R.id.id);
        sname=v.findViewById(R.id.name);
        smail=v.findViewById(R.id.email);
        sphn=v.findViewById(R.id.phone);
        b1=v.findViewById(R.id.btn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user_id=sid.getText().toString();
                String name=sname.getText().toString();
                String mail=smail.getText().toString();
                String phn=sphn.getText().toString();

                Customer user=new Customer();
                user.setUid(user_id);
                user.setUname(name);
                user.setUmail(mail);
                user.setUphone(phn);

                MainActivity.myDataBase.dao().insertUser(user);

                Toast.makeText(getContext(), "User Details Saved Successfully", Toast.LENGTH_SHORT).show();

            }
        });
        return v;
    }

}


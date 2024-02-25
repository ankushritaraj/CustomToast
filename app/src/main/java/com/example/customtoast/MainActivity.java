package com.example.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Button btnToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnToast= findViewById(R.id.btnToast);

//default toast
        ///Toast.makeText(getApplicationContext(),"This is My First Toast",Toast.LENGTH_LONG).show();
        //custom toast
       btnToast.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast toast= new Toast(getApplicationContext());

               View view =getLayoutInflater().inflate(R.layout.custom_toast_layout,(ViewGroup) findViewById(R.id.viewContainer));

               toast.setView(view);

               TextView txtMsg= view.findViewById(R.id.txtMsg);

               txtMsg.setText("Message sent successfully");
               toast.setDuration(Toast.LENGTH_LONG);

               toast.show();
           }
       });
    }
}
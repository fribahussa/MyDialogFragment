package com.example.mydialogfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyDialog.MyDialogEventListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showDialogBtn=findViewById(R.id.btn_main_showDialog);
        showDialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDialog myDialog=new MyDialog();
                myDialog.setCancelable(false);
                myDialog.show(getSupportFragmentManager(),null);
            }
        });
    }

    @Override
    public void onOKButtonClick(String data) {
        TextView textView=findViewById(R.id.tv_main);
        textView.setText(data);
    }

    @Override
    public void onCancelButtonClick() {
        Toast.makeText(this,"Canceled",Toast.LENGTH_SHORT).show();
    }
}
package com.example.multitable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;
Button button;
String result;
EditText EditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

textView=findViewById(R.id.textview);
button=findViewById(R.id.button);
EditText=findViewById(R.id.editText);

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        String number=EditText.getText().toString();
        int n=Integer.parseInt(number);
        result=" ";
        for(int i=1;i<=10;i++)
        {
           result+=n+"* "+i+" "+"="+n*i+"\n";
           textView.setText(result);
        }
    }
});



    }
}
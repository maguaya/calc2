package com.example.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onButtonClick(View v) {
        EditText e1 = (EditText) findViewById(R.id.editText);
        EditText e2 = (EditText) findViewById(R.id.editText2);
        TextView t1 = (TextView) findViewById(R.id.textView);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int sum = num1 + num2;
        t1.setText(Integer.toString(sum));

    public void onButton2Click(View v){
        EditText e1 = (EditText)findViewById(R.id.editText);
        EditText e2 = (EditText)findViewById(R.id.editText2);
        TextView t1 = (TextView)findViewById(R.id.textView);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int multiply = num1 * num2;
        t1.setText(Integer.toString(multiply));
    }

        public void onButt3onClick(View v){
            EditText e1 = (EditText)findViewById(R.id.editText);
            EditText e2 = (EditText)findViewById(R.id.editText2);
            TextView t1 = (TextView)findViewById(R.id.textView);
            int num1 = Integer.parseInt(e1.getText().toString());
            int num2 = Integer.parseInt(e2.getText().toString());
            int subtract = num1 - num2;
            t1.setText(Integer.toString(subtract));
        }

        public void onBut5tonClick(View v){
            EditText e1 = (EditText)findViewById(R.id.editText);
            EditText e2 = (EditText)findViewById(R.id.editText2);
            TextView t1 = (TextView)findViewById(R.id.textView);
            int num1 = Integer.parseInt(e1.getText().toString());
            int num2 = Integer.parseInt(e2.getText().toString());
            int division = num1 / num2;
            t1.setText(Integer.toString(division));
        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

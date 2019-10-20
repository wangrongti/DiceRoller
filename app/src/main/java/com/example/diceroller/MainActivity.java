package com.example.diceroller;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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

    Random r = new Random();
    public int number = r.nextInt(7);
    public int number1;
    public int number2;
    public int time=0;

    public void on_butoon_click(View view){
        TextView tv = this.findViewById(R.id.numberTextView);
        if (number == 0)
        {
            number1 = r.nextInt(7);
            tv.setText(Integer.toString(number1));
        }
        else
        {
            number2 = r.nextInt(7);
            tv.setText(Integer.toString(number2));
        }

        inputnumbers();
    }

    public void inputnumbers(){
        EditText et = (EditText)findViewById(R.id.editText);
        int input = Integer.parseInt(et.getText().toString());

        TextView tv = this.findViewById(R.id.InputTextView);

        if(input == number1)
        {
            String result = "Congratulations!";
            tv.setText(result);
            times();
        }
        else if(input == number2)
        {
            String result = "Congratulations!";
            tv.setText(result);
            times();
        }
        else
        {
            String result = "Unfortunately";
            tv.setText(result);
        }
    }

    public void times(){
        TextView tv = this.findViewById(R.id.TimesView2);
        time=time+1;
        String result = String.valueOf(time);
        tv.setText(result);
    }
}

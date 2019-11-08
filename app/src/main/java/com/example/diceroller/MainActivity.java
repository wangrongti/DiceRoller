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
    public int number = r.nextInt(6);
    public int number1;
    public int number2;
    public int time=0;

    public void on_butoon_click(View view){
        TextView tv = this.findViewById(R.id.numberTextView);
        if (number == 0)
        {
            number1 = 6;
            tv.setText(Integer.toString(number1));
        }
        else
        {
            tv.setText(Integer.toString(number));
        }

        inputnumbers();
    }

    public void on_butoon_click2(View view){
        TextView tv = this.findViewById(R.id.numberTextView);
        String text1 ="If you could go anywhere in the world, where would you go?";
        String text2 ="If you were stranded on a desert island, what three things would you want to take with you?";
        String text3 ="If you could eat only one food for the rest of your life, what would that be?";
        String text4 ="If you won a million dollars, what is the first thing you would buy?";
        String text5 ="If you could spaned the day with one fictional character, who would it be?";
        String text6 ="If you found a magic lantern and a genie gave you three wishes, what would you wish?";
        if (number == 0)
        {
            number1 = r.nextInt(7);
            if (number1 ==1)
            {
            tv.setText(text1);
            }
            if (number1 ==2)
            {
                tv.setText(text2);
            }
            if (number1 ==3)
            {
                tv.setText(text3);
            }
            if (number1 ==4)
            {
                tv.setText(text4);
            }
            if (number1 ==5)
            {
                tv.setText(text5);
            }
            if (number1 ==6)
            {
                tv.setText(text6);
            }
        }
        else
        {
            number2 = r.nextInt(7);
            if (number2 ==1)
            {
                tv.setText(text1);
            }
            if (number2 ==2)
            {
                tv.setText(text2);
            }
            if (number2 ==3)
            {
                tv.setText(text3);
            }
            if (number2 ==4)
            {
                tv.setText(text4);
            }
            if (number2 ==5)
            {
                tv.setText(text5);
            }
            if (number2 ==6)
            {
                tv.setText(text6);
            }
        }
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

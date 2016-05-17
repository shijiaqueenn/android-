package com.example.sukie.mycalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public EditText op1TextField, op2TextField;
    public Button mulButton;
    public Button divideButton;
    public Button plusButton;
    public Button minusButton;
    public TextView resultView;
    public int op1, op2, results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        op1TextField = (EditText)findViewById(R.id.editText);
        op2TextField = (EditText)findViewById(R.id.editText2);
        divideButton = (Button)findViewById(R.id.button4);
        mulButton = (Button)findViewById(R.id.button3);
        minusButton = (Button)findViewById(R.id.button2);
        plusButton = (Button)findViewById(R.id.button);
        resultView = (TextView)findViewById(R.id.textView);

        divideButton.setOnClickListener(new View. OnClickListener() {
            @Override
            public void onClick(View view){
                op1= Integer.parseInt(op1TextField.getText().toString());
                op2= Integer.parseInt(op2TextField.getText().toString());
                results = op1 / op2;
                resultView.setText(String.valueOf(results));
            }
        });

        mulButton.setOnClickListener(new View. OnClickListener() {
            @Override
            public void onClick(View view){
                op1= Integer.parseInt(op1TextField.getText().toString());
                op2= Integer.parseInt(op2TextField.getText().toString());
                results = op1 * op2;
                resultView.setText(String.valueOf(results));
            }
        });

        minusButton.setOnClickListener(new View. OnClickListener() {
            @Override
            public void onClick(View view){
                op1= Integer.parseInt(op1TextField.getText().toString());
                op2= Integer.parseInt(op2TextField.getText().toString());
                results = op1 - op2;
                resultView.setText(String.valueOf(results));
            }
        });

        plusButton.setOnClickListener(new View. OnClickListener() {
            @Override
            public void onClick(View view){
                op1= Integer.parseInt(op1TextField.getText().toString());
                op2= Integer.parseInt(op2TextField.getText().toString());
                results = op1 + op2;
                resultView.setText(String.valueOf(results));
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
}

package com.funfacts.pushparaj.funfacts;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.funfacts.pushparaj.funfacts.FactBook;

import java.util.Random;


public class FunFacts extends Activity {
    //private FactBook mFact = new FactBook();
    private ColorWheel mColor = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        final TextView funFactView = (TextView)findViewById(R.id.funFactText);
        final Button funFactButton = (Button) findViewById(R.id.getFunFactButton);
        final RelativeLayout mainPage = (RelativeLayout) findViewById(R.id.parentPage);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newFact = FactBook.getFact();
                int newColor = mColor.getColor();
                funFactView.setText(newFact);
                mainPage.setBackgroundColor(newColor);
                funFactButton.setTextColor(newColor);
            }
        };
        funFactButton.setOnClickListener(listener);
        Toast.makeText(this,"Yay! Our activity was created.",Toast.LENGTH_LONG).show();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.fun_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

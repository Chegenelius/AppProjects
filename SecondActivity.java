package ke.co.beautypoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

import java.util.Date;

import ke.co.beautypoint.MainActivity;

public class SecondActivity extends AppCompatActivity {
    Button backbtn,clickbtn;
    int counter = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        backbtn =findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, MainActivity.class));
            }
        });
        clickbtn = findViewById(R.id.btnclick);
        clickbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopUp();
            }
        });
    }
    private void showPopUp(){
        addCounter();
        Snackbar snackbar=(Snackbar) Snackbar.make(findViewById(R.id.coordinator1),"Welcome to beautypoint.\n "
                +"You clicked this button" + counter + " and was lastly clicked on "
                + currentDate(),500);
        snackbar.show();
    }
    private void addCounter(){
        counter ++;
    }
    private Date currentDate() {
        Date date=java.util.Calendar.getInstance().getTime();
        return  date;
    }
}
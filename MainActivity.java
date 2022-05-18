package ke.co.beautypoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ke.co.beautypoint.R;
import ke.co.beautypoint.SecondActivity;

public class MainActivity extends AppCompatActivity {
    Button btnnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnnext = findViewById(R.id.btn_next);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thisint = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(thisint);

            }
        });
    }
}
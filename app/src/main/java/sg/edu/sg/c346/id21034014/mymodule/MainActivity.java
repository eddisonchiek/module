package sg.edu.sg.c346.id21034014.mymodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView C203;
    TextView C206;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        C203 = findViewById(R.id.c203);
        C206 = findViewById(R.id.c218);


        C203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, C203.class);
                intent.putExtra("code", "C203");
                intent.putExtra("name","Android Programming");
                intent.putExtra("year","2020");
                intent.putExtra("semester","1");
                intent.putExtra("credit","4");
                intent.putExtra("venue","C346");
                startActivity(intent);
            }
        });
        C206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, C218.class);
                intent.putExtra("code", "C218");
                intent.putExtra("name","UI/UX Design For Apps");
                intent.putExtra("year","2020");
                intent.putExtra("semester","1");
                intent.putExtra("credit","4");
                intent.putExtra("venue","E66B");
                startActivity(intent);
            }
        });

    }
}
package sg.edu.sg.c346.id21034014.mymodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class C203 extends AppCompatActivity {
    TextView c203;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c203);
        c203 = findViewById(R.id.textViewC203);
        back = findViewById(R.id.buttonback);
        Intent intentReceived = getIntent();
        String CODE = intentReceived.getStringExtra("code");
        String name = intentReceived.getStringExtra("name");
        String year = intentReceived.getStringExtra("year");
        String semester = intentReceived.getStringExtra("semester");
        String credit = intentReceived.getStringExtra("credit");
        String venue=intentReceived.getStringExtra("venue");
        c203.setText("Module code is: " + CODE +"\nModule name is: "+name
                +"\nAcademic Year: "+year+"\nSemester: "+semester+"\nModule Credit: "+credit+"\nVenue: "+venue);




        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(C203.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }


}
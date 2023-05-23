package sg.edu.rp.c346.id22002222.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC346;

    TextView tvC349;

    TextView tvC206;

    TextView tvC203;

    TextView tvC218;

    TextView tvC235;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvC346 = findViewById(R.id.tvC346);
        tvC349 = findViewById(R.id.tvC346);
        tvC206 = findViewById(R.id.tvC206);
        tvC203 = findViewById(R.id.tvC203);
        tvC218 = findViewById(R.id.tvC218);
        tvC235 = findViewById(R.id.tvC235);


        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailsActivity.class);
                intent.putExtra("ModCode", "C346");
                intent.putExtra("ModName", "Mobile Software Development");
                intent.putExtra("ModYr", "2020");
                intent.putExtra("ModSem", "1");
                intent.putExtra("ModCred", "4");
                intent.putExtra("ModVenue", "E63A");


                startActivity(intent);



            }
        });


        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailsActivity.class);
                intent.putExtra("ModCode", "C206");
                intent.putExtra("ModName", "Software Developement Process");
                intent.putExtra("ModYr", "2023");
                intent.putExtra("ModSem", "1");
                intent.putExtra("ModCred", "4");
                intent.putExtra("ModVenue", "W64P");


                startActivity(intent);
            }
        });

        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailsActivity.class);
                intent.putExtra("ModCode", "C203");
                intent.putExtra("ModName", "Web Development in PHP");
                intent.putExtra("ModYr", "2023");
                intent.putExtra("ModSem", "1");
                intent.putExtra("ModCred", "4");
                intent.putExtra("ModVenue", "W64P");


                startActivity(intent);
            }
        });

        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailsActivity.class);
                intent.putExtra("ModCode", "C218");
                intent.putExtra("ModName", "UI/UX Design for Apps");
                intent.putExtra("ModYr", "2023");
                intent.putExtra("ModSem", "1");
                intent.putExtra("ModCred", "4");
                intent.putExtra("ModVenue", "W64P");


                startActivity(intent);
            }
        });

        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailsActivity.class);
                intent.putExtra("ModCode", "C218");
                intent.putExtra("ModName", "IT Security and Management ");
                intent.putExtra("ModYr", "2023");
                intent.putExtra("ModSem", "1");
                intent.putExtra("ModCred", "4");
                intent.putExtra("ModVenue", "W64P");


                startActivity(intent);
            }
        });

    }
}
package sg.edu.rp.c346.id22002222.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailsActivity extends AppCompatActivity {

    TextView code;

    TextView name;

    TextView year;

    TextView sem;

    TextView credit;

    TextView venue;

    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_details);



        //Step 2
        code = findViewById(R.id.tvModuledetails);
        name = findViewById(R.id.tvModuleName);
        year = findViewById(R.id.tvAcdYr);
        sem = findViewById(R.id.tvSem);
        credit = findViewById(R.id.tvModCred);
        venue = findViewById(R.id.tvVenue);
        btnBack = findViewById(R.id.btnback);




        Intent intentReceived = getIntent();
        String ModuleCode = intentReceived.getStringExtra("ModCode");
        code.setText("Module code: " + ModuleCode);



        String ModuleName = intentReceived.getStringExtra("ModName");
        name.setText("Module Name: " + ModuleName);

        String ModuleYear = intentReceived.getStringExtra("ModYr");
        year.setText("Academic Year: " + ModuleYear);

        String ModuleSem = intentReceived.getStringExtra("ModSem");
        sem.setText("Semester: " + ModuleSem);

        String ModuleCredit = intentReceived.getStringExtra("ModCred");
        credit.setText("Module Credit: " + ModuleCredit);

        String ModuleVenue = intentReceived.getStringExtra("ModVenue");
        venue.setText("Venue: " + ModuleVenue);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailsActivity.this, MainActivity.class);
                finish();
                //startActivity(intent);
            }
        });

    }
}

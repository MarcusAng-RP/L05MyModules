package sg.edu.rp.c346.id22002222.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleInfo extends AppCompatActivity {

    TextView code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_info);



        setContentView(R.layout.activity_module_info);

        //Step 2
        code = findViewById(R.id.textView);


        Intent intentReceived = getIntent();
        String ModuleCode = intentReceived.getStringExtra("value");
        code.setText("Module code: " + ModuleCode);

    }
    }

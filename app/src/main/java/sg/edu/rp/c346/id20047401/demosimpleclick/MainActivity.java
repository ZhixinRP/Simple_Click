package sg.edu.rp.c346.id20047401.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button btnDisplay;
    TextView tvDisplay;
    EditText etInput;
    ToggleButton tBtn;
    RadioGroup rgGender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tBtn = findViewById(R.id.toggleButtonEnabled);
        btnDisplay = findViewById(R.id.buttonDisplay);
        tvDisplay = findViewById(R.id.textViewDisplay);
        etInput = findViewById(R.id.editTextInput);
        rgGender = findViewById(R.id.RadioGroupGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String stringResponse = etInput.getText().toString();// retrieve string text and set in var
                if (rgGender.getCheckedRadioButtonId() == R.id.RadioButtonGenderMale){
                    stringResponse = "He says " + stringResponse;
                }else{
                    stringResponse = "She says " + stringResponse;
                }
                tvDisplay.setText(stringResponse);
            }
        });

        tBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                if (tBtn.isChecked()){
                    etInput.setEnabled(true);
                }else{
                    etInput.setEnabled(false);
                }
            }
        });


    }
}
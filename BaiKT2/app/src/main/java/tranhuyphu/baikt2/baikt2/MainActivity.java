package tranhuyphu.baikt2.baikt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton,r1,r2,r3;
    TextView textView;
    Button button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1 = findViewById(R.id.rad13);
        r2 = findViewById(R.id.rad15);
        r3 = findViewById(R.id.rad18);
        radioGroup = findViewById(R.id.radG);
        textView = findViewById(R.id.ViewTip);
        editText = findViewById(R.id.edtMoney);
        button = findViewById(R.id.btntip);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tip = editText.getText().toString();
                float money = Float.parseFloat(tip);
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                String s = (String) radioButton.getText();
                String s1 = (String) r1.getText();
                String s2 = (String) r2.getText();
                String s3 = (String) r3.getText();
                if (s.equals(s1)) money = money * 13 /100;
                if (s.equals(s2)) money = money * 15 /100;
                if (s.equals(s3)) money = money * 18 /100;
                textView.setText("Your tip will be: $ "+ money);
            }
        });
    }
    public void checkbtn(View view) {
        int radID = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radID);
        Toast.makeText(this, "You select tip: " + radioButton.getText(),
                Toast.LENGTH_SHORT).show();
        }
}
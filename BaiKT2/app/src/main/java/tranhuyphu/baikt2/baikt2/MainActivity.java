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
    RadioButton radioButton;
    TextView textView;
    Button button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                if (s.equals("13%")){
                    money = money * 13 /100;
                }else if (s.equals("15%")){
                    money = money * 15 /100;
                }else{
                    money = money * 18 /100;
                }
                textView.setText("Your tip will be: $"+ money);
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
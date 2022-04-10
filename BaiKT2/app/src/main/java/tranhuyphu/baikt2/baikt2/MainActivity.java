package tranhuyphu.baikt2.baikt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radG);
        textView = findViewById(R.id.ViewTip);
        Button button = findViewById(R.id.btntip);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radID = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radID);
                textView.setText("Your tip will be: "+ radioButton.getText());
            }
        });
    }
    public void checkbtn(View view) {
        }
}
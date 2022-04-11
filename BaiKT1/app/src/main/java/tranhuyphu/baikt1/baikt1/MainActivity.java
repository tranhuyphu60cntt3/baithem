package tranhuyphu.baikt1.baikt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nut = (Button) findViewById(R.id.btnlogin);
        nut.setOnClickListener(thongbao);
    }

    View.OnClickListener thongbao = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            EditText tk = (EditText)findViewById(R.id.edtuser);
            EditText mk = (EditText)findViewById(R.id.edtpass);
            String user = "maicuongtho";
            String pass = "Cntt60ntu!";
            String t = tk.getText().toString();
            String m = mk.getText().toString();
            if ((t.equals(user) == true) && (m.equals(pass))){
                Toast.makeText(MainActivity.this, "User and Password is correct", Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(MainActivity.this, "User and Password is wrong", Toast.LENGTH_SHORT).show();
            }
        }
    };
}
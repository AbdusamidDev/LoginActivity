package developer.abdusamid.loginactivityjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);
        MaterialButton btnLogin = findViewById(R.id.loginbtn);

        btnLogin.setOnClickListener(view -> {
            if (username.getText().toString().equals("Abdusamid") && password.getText().toString().equals("123")) {
                //correct
                Toast.makeText(MainActivity.this, " LOGIN SUCCESSFUL ", Toast.LENGTH_SHORT).show();
            }
            if (username.getText().toString().equals("") || password.getText().toString().equals("")) {
                //incorrect
                Toast.makeText(MainActivity.this, " WRITE USERNAME and PASSWORD ", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, " LOGIN FAILED! ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
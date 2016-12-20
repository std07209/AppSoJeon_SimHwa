package kr.co.ana.myapplication1219hw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    EditText et3;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.year);
        et2 = (EditText)findViewById(R.id.month);
        et3 = (EditText)findViewById(R.id.day);
        btn = (Button)findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer year = Integer.valueOf(et1.getText().toString());
                Integer month = Integer.valueOf(et2.getText().toString());
                Integer day = Integer.valueOf(et3.getText().toString());

                if(month <= 0 || month >= 13 || day <= 0 || day >= 32){
                    Toast.makeText(MainActivity.this, "오류 발생", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(MainActivity.this, TextViewActivity.class);

                    intent.putExtra("year", year);
                    intent.putExtra("month", month);
                    intent.putExtra("day", day);

                    startActivity(intent);
                }
            }
        });
    }
}

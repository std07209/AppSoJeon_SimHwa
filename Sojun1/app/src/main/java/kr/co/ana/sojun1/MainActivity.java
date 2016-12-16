package kr.co.ana.sojun1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text);
        editText = (EditText) findViewById(R.id.edit);
        button = (Button) findViewById(R.id.btn_1);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //editText에서 글자를 받아와서
                String text = editText.getText().toString();
                //TextView에 넣어준다.
                textView.setText(text);
            }
        });


    }
}

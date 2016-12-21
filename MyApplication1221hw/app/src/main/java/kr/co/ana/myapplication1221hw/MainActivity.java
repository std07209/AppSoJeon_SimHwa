package kr.co.ana.myapplication1221hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btn_c;
    Button btn_r;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_c = (Button) findViewById(R.id.btn_c);
        btn_r = (Button) findViewById(R.id.btn);
        editText = (EditText) findViewById(R.id.et_text);
        textView = (TextView) findViewById(R.id.tv);

        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf(editText.length()) + "글자");
            }
        });

        btn_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                textView.setText("0");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
               textView.setText(String.valueOf(editText.length()));
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}

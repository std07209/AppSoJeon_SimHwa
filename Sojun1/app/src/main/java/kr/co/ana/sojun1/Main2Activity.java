package kr.co.ana.sojun1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        button = (Button) findViewById(R.id.btn_m);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, SubActivity.class);
                String a = "a";
                intent.putExtra("text",a);
                //새로운 화면을 시작.
                startActivity(intent);
                //기존 화면을 꺼준다.
                finish();
            }
        });
    }
}

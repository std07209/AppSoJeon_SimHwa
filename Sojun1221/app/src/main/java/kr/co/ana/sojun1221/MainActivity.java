package kr.co.ana.sojun1221;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    GridView gridView;
    List<Student> studentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentList.add(new Student(true,"홍길동",13));
        studentList.add(new Student(true,"짱구",14));
        studentList.add(new Student(false,"철수",15));
        studentList.add(new Student(false,"유리",16));
        studentList.add(new Student(true,"짱아",17));
        studentList.add(new Student(false,"태준",18));
        studentList.add(new Student(false,"정우",19));
        studentList.add(new Student(true,"해랑이",20));
        studentList.add(new Student(false,"코난",21));



        gridView = (GridView) findViewById(R.id.GridView);
        CustomAdapter adapter = new CustomAdapter(studentList);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(),ITEMS[position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}

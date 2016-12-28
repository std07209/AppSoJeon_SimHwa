package kr.co.ana.sojeonproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    ListView listPM;
    CustomAdapter customAdapter;
    Button btnAdd;
    EditText edit_m, edit_d, edit_i, edit_o;

    Realm realm;
    List<PocketMoney> pocketMoneyList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRealm();

        initEditText();
        initButton();
        initListView();
    }
    private void initRealm(){
        Realm.init(getApplicationContext());
        realm = Realm.getDefaultInstance();
    }

    private void initListView(){
        listPM = (ListView) findViewById(R.id.listview);
        customAdapter = new CustomAdapter(getPocketMoney());
        listPM.setAdapter(customAdapter);
    }

    private void initButton(){
        btnAdd = (Button) findViewById(R.id.btn);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String month = edit_m.getText().toString();
                String day = edit_d.getText().toString();
                String in = edit_i.getText().toString();
                String out = edit_o.getText().toString();
                realm.beginTransaction();
                PocketMoney pocketMoney = realm.createObject(PocketMoney.class);
                pocketMoney.setMonth(month);
                pocketMoney.setDay(day);
                pocketMoney.setIn(in);
                pocketMoney.setOut(out);
                realm.commitTransaction();
                getPocketMoney();
                customAdapter.notifyDataSetChanged();
            }
        });
    }

    private void initEditText(){
        edit_m = (EditText) findViewById(R.id.et_month);
        edit_d = (EditText) findViewById(R.id.et_day);
        edit_i = (EditText) findViewById(R.id.et_in);
        edit_o = (EditText) findViewById(R.id.et_out);
    }

    private List<PocketMoney> getPocketMoney(){
        RealmResults<PocketMoney> pocketMoneys = realm.where(PocketMoney.class).findAll();
        pocketMoneyList.clear();
        for (PocketMoney pocketMoney : pocketMoneys){
            pocketMoneyList.add(pocketMoney);
        }
        return pocketMoneyList;
    }
}

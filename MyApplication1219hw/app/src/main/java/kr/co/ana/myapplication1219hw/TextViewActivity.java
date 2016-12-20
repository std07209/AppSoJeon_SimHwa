package kr.co.ana.myapplication1219hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    TextView textView;
    String strYear[] = {"외국에서", "밤마다", "어릴 적 부터", "부모 잘못 만나서", "타고나길", "참하게 생겨서는",
    "매일 아침마다", "할일 없이", "하루도 안빠지고", "재수 없게"};
    String strMonth[] = {"남의 심부름만 하던", "굶을 일은 없었던", "돈만 펑펑 쓰던", "쫄쫄 굶었던", "개 끌고 산책만 하던",
    "쳐먹기만 했던", "사기를 잘 치던", "밖을 싸돌아다니던", "남을 괴롭히기 좋아하던", "애인을 갈아치우던", "책 일기를 좋아하던",
    "밤일만 밝히던"};
    String strDay[] = {"미인대회 탈락자","조폭 두목","노름꾼","게이","내시","동네 바보","의사","친일파","백정","바람둥이","귀족","노숙자",
    "빵셔틀","왕비","흥부네 막내","재벌집 자식","돌쇠","왕초","대통령 자식","이장님","앞잡이","예술가", "왕자","대통령","기생","사업가","추노",
    "아랍 석유 재벌","노예","공주","빵집 점원"};
    int year, month, day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        textView = (TextView) findViewById(R.id.textview);

        year = getIntent().getIntExtra("year", 0);
        month = getIntent().getIntExtra("month", 0);
        day = getIntent().getIntExtra("day", 0);

        year = year%10;

        textView.setText(strYear[year] + " " + strMonth[month - 1] + " " + strDay[day - 1]);
    }
}

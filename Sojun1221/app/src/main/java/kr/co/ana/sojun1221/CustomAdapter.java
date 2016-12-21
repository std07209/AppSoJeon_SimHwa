package kr.co.ana.sojun1221;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter{

    List<Student> studentList;

    public CustomAdapter(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public int getCount() {
        //리스트뷰에 뿌려질 데이터 갯수
        return studentList.size();
    }

    @Override
    public Object getItem(int position) {
        return studentList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //xml 불러오고
        //데이터를 직접 넣어주고
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, null);

        ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
        TextView textViewId = (TextView)view.findViewById(R.id.textViewId);
        TextView textViewName = (TextView)view.findViewById(R.id.textViewName);

        //여러 학생 중 특정 position에 있는 한 학생을 불러온다.
        Student stu = studentList.get(position);

        String id = String.valueOf(stu.getId());
        String name = stu.getName();

        textViewId.setText(id);
        textViewName.setText(name);
        return view;
    }
}

package kr.co.ana.sojeonproject;

import android.content.Context;
import android.support.v4.widget.ViewDragHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.util.SparseArray;

import java.util.List;

public class CustomAdapter extends BaseAdapter{
    List<PocketMoney> pocketMoneys;

    public CustomAdapter(List<PocketMoney> pocketMoneys) {this.pocketMoneys = pocketMoneys;}

    @Override
    public int getCount() { return pocketMoneys.size();}

    @Override
    public Object getItem(int position) {
        return pocketMoneys.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        PocketMoney pocketMoney = pocketMoneys.get(i);

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_list, viewGroup, false);
        }

        TextView text_m = (TextView) view.findViewById(R.id.text_month);
        TextView text_d = (TextView) view.findViewById(R.id.text_day);
        TextView text_i = (TextView) view.findViewById(R.id.text_in);
        TextView text_o = (TextView) view.findViewById(R.id.text_out);

        text_m.setText(pocketMoney.getMonth() + "월");
        text_d.setText(pocketMoney.getDay() + "일");
        text_i.setText(pocketMoney.getIn() + "원");
        text_o.setText(pocketMoney.getOut() + "원");

        return view;
    }
}

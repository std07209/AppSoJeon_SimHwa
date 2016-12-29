package kr.co.ana.sojeonproject;

import io.realm.RealmObject;
import io.realm.annotations.Index;

public class PocketMoney extends RealmObject{
    String month;
    String day;
    String in;
    String out;

    public PocketMoney(){}

    public PocketMoney(String month, String out, String in, String day, int tot) {
        this.month = month;
        this.out = out;
        this.in = in;
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getIn() {return in;}

    public void setIn(String in) {
        this.in = in;
    }

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }

}

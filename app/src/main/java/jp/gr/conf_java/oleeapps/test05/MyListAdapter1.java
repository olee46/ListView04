package jp.gr.conf_java.oleeapps.test05;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by orisa on 2018/01/26.
 */

public class MyListAdapter1 extends BaseAdapter {
    private Context context = null;
    private ArrayList<ListItem1> data = null;
    private int resource = 0;

    // constructor
    public MyListAdapter1(Context context, ArrayList<ListItem1> data, int resource) {
        this.context = context;
        this.data = data;
        this.resource = resource;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return data.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Activity activity = (Activity) context;
        ListItem1 item = (ListItem1)getItem(position);
        if (convertView == null) {
            convertView = activity.getLayoutInflater().inflate(resource, null);
        }
        ((TextView)convertView.findViewById(R.id.date)).setText(item.getDate());
        return convertView;
    }
}

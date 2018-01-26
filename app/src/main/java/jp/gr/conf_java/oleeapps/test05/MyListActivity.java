package jp.gr.conf_java.oleeapps.test05;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by orisa on 2018/01/26.
 */

public class MyListActivity extends ListActivity {
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // prepare data
        final ArrayList<String> data = new ArrayList<>();
        data.add("item1");
        data.add("item2");
        data.add("item3");
        data.add("item4");
        data.add("item5");

        // create adapter
        adapter = new ArrayAdapter<>(MyListActivity.this, android.R.layout.simple_list_item_1, data);

        // set adapter to ListView
        this.setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String text = ((TextView)v).getText().toString();

        // create Intent
        Intent i = new Intent(MyListActivity.this, SubActivity.class);
        i.putExtra("text", text);
        startActivity(i);
    }
}

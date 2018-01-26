package jp.gr.conf_java.oleeapps.test05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // prepare data
        String dates[] = {"2018/01/26", "2018/01/23", "2018/01/19", "2018/01/15", "2018/01/11"};

        // array -> ArrayList
        ArrayList<ListItem1> data = new ArrayList<>();
        for (int i = 0; i < dates.length; i++) {
            ListItem1 item = new ListItem1();
            item.setId((new Random()).nextLong());
            item.setDate(dates[i]);
            data.add(item);
        }

        // use adapter
        MyListAdapter1 adapter1 = new MyListAdapter1(MainActivity.this, data, R.layout.list_item_1);
        ListView mainList = (ListView)findViewById(R.id.mainList);
        mainList.setAdapter(adapter1);
    }
}

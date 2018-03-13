package listviewtest.wenhaha.cn.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] data={"Apple","Banana","Orange","Watermelon","Pear",
                            "Pear","Grape","Pineapple","Cherry"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }
}

package in.spro.listviewedittext;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String s[] = new String[]{
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19"
    };
    final ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < s.length; i++) {
            list.add(s[i]);
        }

        ListView listView = (ListView) findViewById(R.id.listView);
        MyListAdapter adapter = new MyListAdapter(this, s);
        listView.setAdapter(adapter);
    }
}


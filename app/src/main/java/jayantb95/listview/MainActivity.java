package jayantb95.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lstLanguages;

    String[] languagesArray = {"Arduino", "Bash", "C#", "Deca", "Erlang", "F#", "Go", "Haskell", "Io",
            "Java", "Kotlin", "LISP", "M#", "Nim", "Objective-C", "PHP", "Quorum", "Ruby", "Swift",
            "TypeScript", "UML", "Visual Basic", "Wolfram", "XL", "Yorick", "ZPL"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        listener();
    }

    private void initialize() {
        lstLanguages = findViewById(R.id.lst_languages);
        lstLanguages.setAdapter(new ArrayAdapter<String>(this, R.layout.list_item, languagesArray));
    }

    private void listener() {
        lstLanguages.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                showToast(String.valueOf(adapterView.getItemAtPosition(i)));
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}

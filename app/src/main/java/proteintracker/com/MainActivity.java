package proteintracker.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.mainActivityTextView);
        //Button myBtn = (Button) findViewById(R.id.button1);

        //textView.setText(R.string.test_untuk_update_view);
        /*myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText myEditText = (EditText) findViewById(R.id.editText1);
                Log.d("Proteintracker", myEditText.getText().toString());
            }
        });*/

        if(savedInstanceState != null){
            Log.d("ProteinTracker",savedInstanceState.getString("abc"));
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("abc","test");
        super.onSaveInstanceState(outState);
    }

    public void GoToFragment(View View){
        Intent intent = new Intent(MainActivity.this, BlankFragment2.class);
        startActivity(intent);
    }

    public void GoToList(View view) {
        Intent intent = new Intent(MainActivity.this, listActivity.class);
        startActivity(intent);
    }

    public void GoToListMhs(View view) {
        Intent intent = new Intent(MainActivity.this, ListMahasiswaActivity.class);
        startActivity(intent);

    }
}

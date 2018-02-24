package thhsu.chloe.appworkassignmentweek2;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupOnClick((ImageButton) findViewById(R.id.button1),"1");
        setupOnClick((ImageButton) findViewById(R.id.button2),"2");
        setupOnClick((ImageButton) findViewById(R.id.buttonPlus), "+");
        setupOnClick((ImageButton) findViewById(R.id.buttonEquals), "=");

    }

    private void setupOnClick(ImageButton b, final String calSymbol) {
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView mathInput = (TextView) findViewById(R.id.mathInput);
                mathInput.setText(mathInput.getText()+ calSymbol);
            }
        });
    }
}

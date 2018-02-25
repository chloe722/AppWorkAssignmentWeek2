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
        setupOnClick((ImageButton) findViewById(R.id.button3), "3");
        setupOnClick((ImageButton) findViewById(R.id.button4), "4");
        setupOnClick((ImageButton) findViewById(R.id.button5), "5");
        setupOnClick((ImageButton) findViewById(R.id.button6), "6");
        setupOnClick((ImageButton) findViewById(R.id.button7), "7");
        setupOnClick((ImageButton) findViewById(R.id.button8), "8");
        setupOnClick((ImageButton) findViewById(R.id.button9), "9");
        setupOnClick((ImageButton) findViewById(R.id.buttonPlus), "+");
        setupOnClick((ImageButton) findViewById(R.id.buttonMinus), "-");
        setupOnClick((ImageButton) findViewById(R.id.buttonTimes), "*");
        setupOnClick((ImageButton) findViewById(R.id.buttonDivide), "/");
        onClickEqual((ImageButton) findViewById(R.id.buttonEquals));
        onClickReset((ImageButton) findViewById(R.id.buttonC));

    }

    private void onClickEqual(ImageButton button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });
    }

    private void onClickReset(ImageButton button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });
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

    private void calculate(){
        TextView mathInput = (TextView) findViewById(R.id.mathInput);
        TextView mathResult = (TextView) findViewById(R.id.mathResult);
        String expressionText = (String) mathInput.getText();
        String[] expression = expressionText.split("(?=[+/*-])|(?<=[+/*-])");
        mathResult.setText(String.join(",", expression));
    }

    private void reset(){
        TextView mathResult = (TextView) findViewById(R.id.mathResult);
        TextView mathInput = (TextView) findViewById(R.id.mathInput);
        mathResult.setText("");
        mathInput.setText("");
    }
}



package fr.utt.if26.malo_tp03;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String message = "J'm ma maman ";
    private int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tx = (TextView) findViewById(R.id.textView);
        tx.setText(message);

        Button bt = (Button) findViewById(R.id.bouton);
        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (i == 1){
                    tx.setText(tx.getText()+"\nMais oui, toi aussi Michel ");
                    i = 2;
                } else {
                    tx.setText(tx.getText() + "<3");
                }
            } });

    }

}

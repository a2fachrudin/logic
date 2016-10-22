package com.fachrudin.coding;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FactorialActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView;
    long factorial = 1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main2);

        editText = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);
        textView = (TextView)findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcFactorial();
                textView.setText("Factorial of " + editText.getText().toString() + " is : " + factorial);
            }
        });

    }
    private void calcFactorial() {
        factorial = 1;
        int num = 0;
        if (!editText.getText().toString().equals(""))
            num = Integer.parseInt(editText.getText().toString());
        for(int i = 1; i<=num; i++){
            factorial = i * factorial;
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.factorial) {
            Intent intent = new Intent(this, FactorialActivity.class);
            startActivity(intent);
            this.finish();
        }
        else if (id == R.id.fibonacci) {
            Intent intent = new Intent(this, FibonacciActivity.class);
            startActivity(intent);
            this.finish();
        }
        else if (id == R.id.fizzbuzz){
            Intent intent = new Intent(this, FizzbuzzActivity.class);
            startActivity(intent);
            this.finish();
        }
        else if (id == R.id.reversechar){
            Intent intent = new Intent(this, ReverseCharActivity.class);
            startActivity(intent);
            this.finish();
        }
        else {
            // Bring user to the market or let them choose an app?
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setData(Uri.parse("market://search?q=pub:SandPaper"));
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
package com.example.a211;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.TypeConverter;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.widget.ImageView;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText Userinput;

    ImageView length, weight, temp;
    TextView t1, t2, t3, t4, t5, t6, t7;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temp = findViewById(R.id.temp);
        weight = findViewById(R.id.weight);
        length = findViewById(R.id.length);
        t1 = findViewById(R.id.CM);
        t2 = findViewById(R.id.Foot);
        t3 = findViewById(R.id.Inch);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6);
        t7 = findViewById(R.id.t7);
        Userinput = findViewById(R.id.userInput);
        length.setImageResource(R.drawable.length);
        temp.setImageResource(R.drawable.temp);
        weight.setImageResource(R.drawable.weight);


        Spinner spin = (Spinner) findViewById(R.id.spinner);
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinner, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //calculateLength();

                String text = spinner.getSelectedItem().toString();
                if (text.equals("Meter")) {


                    double n1 = Integer.parseInt(String.valueOf(Userinput.getText()));


                    String c1 = String.format("%.2f", n1* 100);
                    String f1 = String.format("%.2f", n1 *3.28);
                    String i1 = String.format("%.2f", n1 * 2.204);

                    t7.setText("");

                    t1.setText(c1);
                    t4.setText("Centimeter");
                    t2.setText(f1);
                    t5.setText("Foot");
                    t3.setText(i1);
                    t6.setText("Inch");


                } else {
                    t7.setText("Please select the right unit");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");
                    Toast.makeText(MainActivity.this, "please select the right icon", LENGTH_SHORT).show();
                    

                }
            }

        });

        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //calculateLength();

                String text = spinner.getSelectedItem().toString();
                if (text.equals("Kilograms")) {

                    double n2 = Integer.parseInt(String.valueOf(Userinput.getText()));

                    t7.setText("");

                    String g1 = String.format("%.2f", n2 *1000);
                    String o1 = String.format("%.2f", n2 * 35.27);
                    String p1 = String.format("%.2f", n2 * 2.204);


                    t1.setText(g1);
                    t4.setText(("gram"));
                    t2.setText(o1);
                    t5.setText("Ounce(Oz)");
                    t3.setText(p1);
                    t6.setText("Pound(lb)");
                } else {
                    t7.setText("Please select the right unit");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");
                    Toast.makeText(MainActivity.this, "please select the right icon", LENGTH_SHORT).show();

                }
            }
        });
        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //calculateLength();
                String text = spinner.getSelectedItem().toString();
                if (text.equals("Celsius")) {

                    t7.setText("");
                    double n3 = Integer.parseInt(String.valueOf(Userinput.getText()));

                    String f1 ,k1;
                    f1 = String.format("%.2f", n3 * 266);
                    k1 = String.format("%.2f", n3 *8.38);

                    t1.setText(f1);
                    t4.setText(String.valueOf("Fahrenheit"));
                    t2.setText(k1);
                    t5.setText("Kelvin");
                    t3.setText("");
                    t6.setText("");
                } else {
                    t7.setText("Please select the right unit");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");
                    Toast.makeText(MainActivity.this, "please select the right icon", LENGTH_SHORT).show();
                }

            }
        });


    }


//    public void calculateLength (){
//        EditText userInput = findViewById(R.id.userInput);
//        int centitmeter;
//        centitmeter = Integer.parseInt(userInput.getText().toString());
//        int c1;
//        c1 = centitmeter * 100;
//        double f1 = c1 *0.0328;
//        double i1 = c1 * 0.3937;
//        cm.setText(String.valueOf(c1));
//        foot.setText(String.valueOf(f1));
//        inch.setText(String.valueOf(i1));
//
//
//
//    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), "", LENGTH_SHORT).show();

    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}


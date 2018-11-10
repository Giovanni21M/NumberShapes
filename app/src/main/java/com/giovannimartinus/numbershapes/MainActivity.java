package com.giovannimartinus.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {


    /* create a method to Toast */
    public void makeToast(String string) {
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }


    /* create a class */
    class Numbers {

        /* create a method with which takes a parameter of integer type */
        public void whichShape(int x) {

            /* convert integer x to a double type as variable y */
            double y = (double) x;
            /* assign the square root of 8y+1 to variable squareRoot */
            double squareRoot = sqrt((8 * y) + 1);


            if (sqrt(x) % 1 == 0) {
                if (squareRoot % 1 == 0) {
                    makeToast(x + " is a triangular square."); // if the remainders of both x's squure root and squareRoot are 0
                } else {
                    makeToast(x + " is a square."); // only if the remainder of x's square root mod 1 is 0
                }
            } else if (squareRoot % 1 == 0) {
                makeToast(x + " is triangular."); // if the remainder of squareRoot mod 1 is 0
            } else {
                makeToast(x + " is neither a square or triangle."); // if the above statements aren't met
            }

        }

    }

    public void buttonClick(View view) {

        EditText usersNumber = (EditText) findViewById(R.id.usersNumber);

        /* assign the class Numbers to an instant */
        Numbers shapeNumber = new Numbers();

        /* check to see if the text field is null */
        if (usersNumber.getText().toString() == null || usersNumber.getText().toString().trim().isEmpty()) {
            makeToast("You must enter a number.");
        } else {
           /* call on the the Numbers' method whichShape as instant shapeNumber */
            shapeNumber.whichShape(Integer.parseInt(usersNumber.getText().toString()));
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

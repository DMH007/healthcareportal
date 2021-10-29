package mobile.functioning;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity<view> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Important buttons for proper functionality.
        Button cardiac = findViewById(R.id.button13);
        Button orthopedic = findViewById(R.id.ortho14);
        Button cancer = findViewById(R.id.button16);
        final Button neurosci = findViewById(R.id.neuro1);
        final Button doctor = findViewById(R.id.button17);
        final Button medical = findViewById(R.id.button18);
        final Button patient = findViewById(R.id.button20);
        final Button careers = findViewById(R.id.button21);
        final Button billing = findViewById(R.id.button26);

        // Class button for cardiac button.
        cardiac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(MainActivity.this, Cardiac2.class);
                startActivity(int1);
            }
        });

        //Class button for orthopedic created.
        orthopedic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2 = new Intent(MainActivity.this, Orthopedic2.class);
                startActivity(int2);
            }
        });

        //Class button for cancer.
        cancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3 = new Intent(MainActivity.this, Cancer2.class);
                startActivity(int3);

                //Class button for Neurosciences.
                neurosci.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent int4 = new Intent(MainActivity.this, Neurosci.class);
                        startActivity(int4);

                        //Class button for Doctor
                        doctor.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent int5 = new Intent(MainActivity.this, Doctor.class);
                                startActivity(int5);

                                //Class button Medical Services
                                medical.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent int6 = new Intent(MainActivity.this, Medical.class);
                                        startActivity(int6);

                                        //Class button Patient Appointments.
                                        patient.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent int7 = new Intent(MainActivity.this, Patient.class);
                                                startActivity(int7);

                                                //Class button for careers.
                                                careers.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        Intent int8 = new Intent(MainActivity.this, Careers.class);
                                                        startActivity(int8);

                                                        //Class button for Billing.
                                                        billing.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                Intent int9 = new Intent(MainActivity.this, Billing.class);
                                                                startActivity(int9);


                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
            }

        });
    }
}
//Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

       // FloatingActionButton fab = findViewById(R.id.fab);
       // fab.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        //                .setAction("Action", null).show();
         //   }
        // });




       /* @Override
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/


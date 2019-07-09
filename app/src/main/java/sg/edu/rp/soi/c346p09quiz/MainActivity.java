package sg.edu.rp.soi.c346p09quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<Formula> al;
    CustomAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);
        al = new ArrayList<>();
        al.add(new Formula("rectangle","Length x Length","Area"));
        al.add(new Formula("triangle","(Length of base x Length)/2","Area"));
        al.add(new Formula("cube","Length x Length x Length","Volume"));

        aa = new CustomAdapter(MainActivity.this,R.layout.row,al);
        lv.setAdapter(aa);
    }
}

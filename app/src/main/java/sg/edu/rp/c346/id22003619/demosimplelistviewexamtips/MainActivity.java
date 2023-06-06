package sg.edu.rp.c346.id22003619.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lvExamTips;
String[] tipsArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tipsArray=new String[5];
        tipsArray[0]="Don't just read the code, code it as much as possible during each practical session";
        tipsArray[1]="Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        tipsArray[2]="Prepare your template source code for each topic";
        tipsArray[3]="Create a few empty Android projects to speed up your coding during the exam";
        tipsArray[4]="Ensure that your Android Studio is up and running before the exam";
        lvExamTips=findViewById(R.id.listViewExamTips);
        ArrayAdapter adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,tipsArray);
        lvExamTips.setAdapter(adapter);
    }
}
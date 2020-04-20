package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private StringBuilder stringBuilder = new StringBuilder();
    int a, b, c, d, e, f;
    RecyclerView recyclerView;
    ArrayList<TestClass> testClasses = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        fillList(testClasses);

        TestAdapter testAdapter = new TestAdapter(testClasses);

        recyclerView.setAdapter(testAdapter);

        //app:srcCompat="@drawable/micro_avatar"
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void fillList(ArrayList<TestClass> testClasses) {
        for (int i = 1; i <= 1000000; i++) {
            a = i / 100000;
            b = i / 10000 % 10;
            c = i / 1000 % 10;
            d = i / 100 % 10;
            e = i / 10 % 10;
            f = i % 10;

            switch (a) {
                case 1:
                    stringBuilder.append("сто ");
                    break;
                case 2:
                    stringBuilder.append("двести ");
                    break;
                case 3:
                    stringBuilder.append("триста ");
                    break;
                case 4:
                    stringBuilder.append("четыреста ");
                    break;
                case 5:
                    stringBuilder.append("пятьсот ");
                    break;
                case 6:
                    stringBuilder.append("шестьсот ");
                    break;
                case 7:
                    stringBuilder.append("семьсот ");
                    break;
                case 8:
                    stringBuilder.append("восемьсот ");
                    break;
                case 9:
                    stringBuilder.append("девятьсот ");
                    break;
                case 10:
                    stringBuilder.append("один миллион");
                    break;
                default:
                    break;
            }
            switch (b) {
                case 1:
                    stringBuilder.append("десять ");
                    break;
                case 2:
                    stringBuilder.append("двадцать ");
                    break;
                case 3:
                    stringBuilder.append("тридцать ");
                    break;
                case 4:
                    stringBuilder.append("сорок ");
                    break;
                case 5:
                    stringBuilder.append("пятьдесят ");
                    break;
                case 6:
                    stringBuilder.append("шестьдесят ");
                    break;
                case 7:
                    stringBuilder.append("семьдесят ");
                    break;
                case 8:
                    stringBuilder.append("восемьдесят ");
                    break;
                case 9:
                    stringBuilder.append("девяносто ");
                    break;
                default:
                    break;
            }
            switch (c) {
                case 1:
                    if (b != 1) stringBuilder.append("одна ");
                    else stringBuilder.append("одиннадцать ");
                    break;
                case 2:
                    if (b != 1) stringBuilder.append("две ");
                    else stringBuilder.append("двенадцать ");
                    break;
                case 3:
                    if (b != 1) stringBuilder.append("три ");
                    else stringBuilder.append("тринадцать ");
                    break;
                case 4:
                    if (b != 1) stringBuilder.append("четыре ");
                    else stringBuilder.append("четырнадцать ");
                    break;
                case 5:
                    if (b != 1) stringBuilder.append("пять ");
                    else stringBuilder.append("пятнадцать ");
                    break;
                case 6:
                    if (b != 1) stringBuilder.append("шесть ");
                    else stringBuilder.append("шестнадцать ");
                    break;
                case 7:
                    if (b != 1) stringBuilder.append("семь ");
                    else stringBuilder.append("семнадцать ");
                    break;
                case 8:
                    if (b != 1) stringBuilder.append("восемь ");
                    else stringBuilder.append("восемнадцать ");
                    break;
                case 9:
                    if (b != 1) stringBuilder.append("девять ");
                    else stringBuilder.append("девятнадцать ");
                    break;
                default:
                    break;
            }

            if (c == 1 && b == 1)
                stringBuilder.append("тысяча");
            else if (c < 5 && c != 0)
                stringBuilder.append("тысячи ");
            else if ((c > 4 || c == 0) && (a != 0 || b != 0))
                stringBuilder.append("тысяч ");

            switch (d) {
                case 1:
                    stringBuilder.append("сто ");
                    break;
                case 2:
                    stringBuilder.append("двести ");
                    break;
                case 3:
                    stringBuilder.append("триста ");
                    break;
                case 4:
                    stringBuilder.append("четыреста ");
                    break;
                case 5:
                    stringBuilder.append("пятьсот ");
                    break;
                case 6:
                    stringBuilder.append("шестьсот ");
                    break;
                case 7:
                    stringBuilder.append("семьсот ");
                    break;
                case 8:
                    stringBuilder.append("восемьсот ");
                    break;
                case 9:
                    stringBuilder.append("девятьсот ");
                    break;
                default:
                    break;
            }
            switch (e) {
                case 1:
                     if (f == 0) stringBuilder.append("десять ");
                    break;
                case 2:
                    stringBuilder.append("двадцать ");
                    break;
                case 3:
                    stringBuilder.append("тридцать ");
                    break;
                case 4:
                    stringBuilder.append("сорок ");
                    break;
                case 5:
                    stringBuilder.append("пятьдесят ");
                    break;
                case 6:
                    stringBuilder.append("шестьдесят ");
                    break;
                case 7:
                    stringBuilder.append("семьдесят ");
                    break;
                case 8:
                    stringBuilder.append("восемьдесят ");
                    break;
                case 9:
                    stringBuilder.append("девяносто ");
                    break;
                default:
                    break;
            }
            switch (f) {
                case 1:
                    if (e != 1) stringBuilder.append("один ");
                    else stringBuilder.append("одиннадцать ");
                    break;
                case 2:
                    if (e != 1) stringBuilder.append("два ");
                    else stringBuilder.append("двенадцать ");
                    break;
                case 3:
                    if (e != 1) stringBuilder.append("три ");
                    else stringBuilder.append("тринадцать ");
                    break;
                case 4:
                    if (e != 1) stringBuilder.append("четыре ");
                    else stringBuilder.append("четырнадцать ");
                    break;
                case 5:
                    if (e != 1) stringBuilder.append("пять ");
                    else stringBuilder.append("пятнадцать ");
                    break;
                case 6:
                    if (e != 1) stringBuilder.append("шесть ");
                    else stringBuilder.append("шестнадцать ");
                    break;
                case 7:
                    if (e != 1) stringBuilder.append("семь ");
                    else stringBuilder.append("семнадцать ");
                    break;
                case 8:
                    if (e != 1) stringBuilder.append("восемь ");
                    else stringBuilder.append("восемнадцать ");
                    break;
                case 9:
                    if (e != 1) stringBuilder.append("девять ");
                    else stringBuilder.append("девятнадцать ");
                    break;
                default:
                    break;
            }

            //testClasses.add(new TestClass(R.drawable.micro_avatar, stringBuilder.toString()));
            testClasses.add(new TestClass(R.drawable.micro_avatar, stringBuilder.toString()));
            stringBuilder.delete(0,999);
        }
    }
}

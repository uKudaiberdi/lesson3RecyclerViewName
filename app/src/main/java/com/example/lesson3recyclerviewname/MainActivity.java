package com.example.lesson3recyclerviewname;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> nameList = new ArrayList<>();
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

recyclerView = findViewById(R.id.recycler_view);
ArrayList<String> name = new ArrayList<>();
nameList.add("Kudrin");
nameList.add("Kyba");
nameList.add("Emir");
nameList.add("Bogdan");
nameList.add("Rysbek");
nameList.add("Beka");
nameList.add("Emil");
nameList.add("Zarina");
nameList.add("Karina");
nameList.add("Aisuluu");
nameList.add("Aziza");
nameList.add("Akun");
nameList.add("Adis");
nameList.add("Ramir");
nameList.add("Almaz");
nameList.add("Edik");
nameList.add("Amir");
nameList.add("Malik");
nameList.add("Artem");
nameList.add("Nikita");

NameAdapter adapter = new NameAdapter(nameList);
recyclerView.setAdapter(adapter);
    }
}
package com.ardaunsalan.proje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;

public class parkyerleri extends AppCompatActivity {
    ListView lists1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists);
        lists1=findViewById(R.id.lists1);

         ArrayList<String> Names=new ArrayList<>();
        Names.add(" 1. Otopark");
        Names.add(" 2. Otopark");
        Names.add(" 3. Otopark");
        Names.add(" 4. Otopark");
        Names.add(" 5. Otopark");
        Names.add(" 6. Otopark");

        final ArrayList<String> parkingName=new ArrayList<>();
        parkingName.add("1. Otopark");
        parkingName.add("2. Otopark");
        parkingName.add("3. Otopark");
        parkingName.add("4. Otopark");
        parkingName.add("5. Otopark");
        parkingName.add("6. Otopark");

        final ArrayList<String>  adres=new ArrayList<>();
        adres.add("kazım Paşa Mahallesi Kiraz Sokak Bina 27/1");
        adres.add("Akpınar Mahallesi Sanat Sokak Bina 58/1");
        adres.add("maltepe Mahallesi Hilal Sokak Bina 89/1");
        adres.add("kadıpınar Mahallesi Şen Sokak Bina 68/1");
        adres.add("yuzevler Mahallesi İpek Sokak Bina 14/1");
        adres.add("Fevzi Çakmak Mahallesi Güler Sokak Bina 47/1");
        ArrayAdapter arrayAdapter=new ArrayAdapter(ParkingLists.this,R.layout.list_names,Names);
        lists1.setAdapter(arrayAdapter );

        lists1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {

                Intent intent=new Intent(ParkingLists.this, ParkingInformation.class);
                intent.putExtra("name",parkingName.get(i));
                intent.putExtra("dres",adres.get(i));
                startActivity(intent);
            }
        });


    }
}

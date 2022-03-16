package com.example.days03;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hospital extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listhospital = new String[]{"Rumah Sakit Awal Bros","Rumah Sakit Eka Hospital",
                "Rumah Sakit Jiwa Tampan","Rumah Sakit Tabrani"};
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,listhospital));
    }

    protected void onListItemClick (ListView l,View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try{
            Intent a = null;
           if (pilihan.equals("Rumah Sakit Awal Bros")) {
           a = new Intent(this,RSAwalBros.class);


           } else if (pilihan.equals("Rumah Sakit Eka Hospital"))
           {

           } else if (pilihan.equals("Rumah Sakit Jiwa Tampan"))
           {

           } else if (pilihan.equals("Rumah Sakit Tabrani"))
           {

           }
           startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

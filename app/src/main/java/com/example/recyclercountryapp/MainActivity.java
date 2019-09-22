package com.example.recyclercountryapp;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import android.content.res.Resources;
        import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayAdapter arrayAdapter;

    String[] countryName;

    private int[] flags ={R.drawable.bangladesh,R.drawable.pakistan, R.drawable.afganistan, R.drawable.china,
            R.drawable.japan, R.drawable.qatar, R.drawable.rasia, R.drawable.ukraine, R.drawable.vietnam,
            R.drawable.canada, R.drawable.denmark, R.drawable.australia};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.recyclerview );
        Resources res = getResources();
        countryName = res.getStringArray( R.array.country_name);
        recyclerView = findViewById( R.id.itemView );
        arrayAdapter = new ArrayAdapter( countryName,flags);
        recyclerView.setAdapter( arrayAdapter );
        recyclerView.setLayoutManager(new  LinearLayoutManager(this) );
    }
}

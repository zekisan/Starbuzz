package com.example.ezequiel.starbuzz;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // ListActivity creates its own layout, no need to define it

        ListView listDrinks = getListView();
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<Drink>(this, android.R.layout.simple_list_item_1,
                Drink.drinks);
        listDrinks.setAdapter(listAdapter);
    }
}

package com.example.mybottomnivagationapp.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ListFragment extends androidx.fragment.app.ListFragment {

    private String list_of_colors[] =
            {"Green Color", "Yellow Color", "Blue Color", "White Color", "Pink Color"
                    , "Orange Color", "Purple Color", "Gray Color"};

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1,
                list_of_colors);
        setListAdapter(adapter);

    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {

        String listItem = (String) getListAdapter().getItem(position);
        Toast.makeText(getActivity(), listItem, Toast.LENGTH_LONG).show();

    }
}

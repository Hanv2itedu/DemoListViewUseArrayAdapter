package com.example.hanguyen.demolistviewusearrayadapter;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.hanguyen.demolistviewusearrayadapter.adapter.CustomizeArrayListAdapter;
import com.example.hanguyen.demolistviewusearrayadapter.controller.MainPageController;
import com.example.hanguyen.demolistviewusearrayadapter.model.HocSinh;

import java.util.List;

public class MainActivity extends Activity {
    ListView listView;
    List<HocSinh> listHocSinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)  findViewById (R.id.listView);
        MainPageController mainPageController = new MainPageController();
        listHocSinh = mainPageController.setListHocSinh();

        CustomizeArrayListAdapter customizeArrayListAdapter = new CustomizeArrayListAdapter(this, R.layout.customize_listview_use_array_adapter, listHocSinh);
        customizeArrayListAdapter.notifyDataSetChanged();

        listView.setAdapter(customizeArrayListAdapter);
    }
}

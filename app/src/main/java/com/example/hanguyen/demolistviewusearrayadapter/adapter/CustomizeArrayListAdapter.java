package com.example.hanguyen.demolistviewusearrayadapter.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.hanguyen.demolistviewusearrayadapter.R;
import com.example.hanguyen.demolistviewusearrayadapter.model.HocSinh;

import java.util.List;

/**
 * Created by Ha Nguyen on 2/21/2018.
 */

public class CustomizeArrayListAdapter extends ArrayAdapter<HocSinh> {
    Context context;
    int resource; // id layout customine
    List<HocSinh> listHocSinh;


    public static class ViewHolder{
        TextView textView1, textView2;
    }

    public CustomizeArrayListAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.listHocSinh = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowItem = convertView;
        if(rowItem == null){
            rowItem = inflater.inflate(resource,parent,false);
            ViewHolder holder = new ViewHolder();
            holder.textView1 = rowItem.findViewById(R.id.text1);
            holder.textView2 = rowItem.findViewById(R.id.text2);
            rowItem.setTag(holder);
        }
        ViewHolder holder = (ViewHolder) rowItem.getTag();
        holder.textView1.setText(listHocSinh.get(position).getName().toString());
        holder.textView2.setText(listHocSinh.get(position).getClassName().toString());

        //        This code doesn't use holder
//        View rowItem = inflater.inflate(resource,parent,false);
//
//        TextView textView1 = rowItem.findViewById(R.id.text1);
//        TextView textView2 = rowItem.findViewById(R.id.text2);
//
//        textView1.setText(listHocSinh.get(position).getName().toString());
//        textView2.setText(listHocSinh.get(position).getClassName().toString());

        return rowItem;
    }
}


package com.example.hanguyen.demolistviewusearrayadapter.controller;

import com.example.hanguyen.demolistviewusearrayadapter.model.HocSinh;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ha Nguyen on 2/21/2018.
 */

public class MainPageController {
    String[] listName= {"Nguyen Van A", "Nguyen Van B", "Nguyen Van C" , "Nguyen Van D"};
    String[] listClassName = {"15t3", "15t2", "15t1", "15t3"};

    List<HocSinh> listHocSinh = new ArrayList<>();

    public List<HocSinh> setListHocSinh(){
        for(int i = 0; i < listName.length ; i++){
            HocSinh hocSinh = new HocSinh();
            hocSinh.setName(listName[i]);
            hocSinh.setClassName(listClassName[i]);

            listHocSinh.add(hocSinh);
        }
        return listHocSinh;
    }
}

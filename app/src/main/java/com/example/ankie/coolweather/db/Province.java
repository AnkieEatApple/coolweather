package com.example.ankie.coolweather.db;


import org.litepal.crud.DataSupport;

/**********************************************************************
 * 地图中的省类
 *
 * @author ankie
 * @类名 Province
 * @包名 com.example.ankie.coolweather.db
 * @创建日期 2018/3/20
/**********************************************************************/

public class Province extends DataSupport {

    private int id;

    private String provinceName;

    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}

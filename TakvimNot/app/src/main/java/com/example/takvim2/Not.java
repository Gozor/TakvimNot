package com.example.takvim2;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "notlar")

public class Not {

    @PrimaryKey
    public int id;

    @ColumnInfo(name = "not")
    public String not;

    @ColumnInfo(name = "saat")
    public String notsaat;

    @ColumnInfo(name = "tarih")
    public String nottarih;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNot() {
        return not;
    }

    public void setNot(String not) {
        this.not = not;
    }

    public String getNotsaat() {
        return notsaat;
    }

    public void setNotsaat(String notsaat) {
        this.notsaat = notsaat;
    }

    public String getNottarih() {
        return nottarih;
    }

    public void setNottarih(String nottarih) {
        this.nottarih = nottarih;
    }
}

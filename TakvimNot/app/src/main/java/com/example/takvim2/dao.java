package com.example.takvim2;



import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao

public interface dao {

    @Insert
    public void notEkle(Not not);

    @Query("select * from notlar")
    public List<Not> getNot();

    @Delete
    public void notSil(Not not);

    @Update
    public void notGuncelle(Not not);


}

package com.example.roomdatabaseexample;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "firstname")
    private String first;

    @Nullable
    @ColumnInfo(name = "lastname")
    private String last;

    @Nullable
    @ColumnInfo(name = "title")
    private String title;

    @Nullable
    @ColumnInfo(name = "department")
    private String department;

    public Word(@NonNull String first, @Nullable String last, @Nullable String title, @Nullable String department) {
        this.first = first;
        this.last = last;
        this.title = title;
        this.department = department;
    }

    public String getFirst(){return this.first;}

    public String getLast(){return this.last;}

    public String getTitle(){return this.title;}

    public String getDepartment(){return this.department;}
}
package com.example.mynotes;

import java.io.Serializable;
import java.util.Date;

public class Note implements Serializable {
    private String header;
    private Date date;
    private String filepath;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }
}

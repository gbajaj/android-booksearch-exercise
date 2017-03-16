package com.codepath.android.booksearch.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rparuthi on 3/15/2017.
 */

public class Response {
    @SerializedName("start")
    @Expose
    private Integer start;
    @SerializedName("num_found")
    @Expose
    private Integer numFound;
    @SerializedName("docs")
    @Expose
    private List<Doc> docs = null;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getNumFound() {
        return numFound;
    }

    public void setNumFound(Integer numFound) {
        this.numFound = numFound;
    }

    public List<Doc> getDocs() {
        return docs;
    }

    public void setDocs(List<Doc> docs) {
        this.docs = docs;
    }
}

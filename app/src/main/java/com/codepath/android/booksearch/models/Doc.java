package com.codepath.android.booksearch.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rparuthi on 3/15/2017.
 */

public class Doc {
    @SerializedName("title_suggest")
    @Expose
    private String titleSuggest;
    @SerializedName("edition_key")
    @Expose
    private List<Object> editionKey = null;
    @SerializedName("cover_i")
    @Expose
    private Integer coverI;
    @SerializedName("isbn")
    @Expose
    private List<Object> isbn = null;
    @SerializedName("has_fulltext")
    @Expose
    private Boolean hasFulltext;
    @SerializedName("text")
    @Expose
    private List<Object> text = null;
    @SerializedName("author_name")
    @Expose
    private List<Object> authorName = null;
    @SerializedName("contributor")
    @Expose
    private List<Object> contributor = null;
    @SerializedName("ia_loaded_id")
    @Expose
    private List<Object> iaLoadedId = null;
    @SerializedName("seed")
    @Expose
    private List<Object> seed = null;
    @SerializedName("oclc")
    @Expose
    private List<Object> oclc = null;
    @SerializedName("ia")
    @Expose
    private List<Object> ia = null;
    @SerializedName("author_key")
    @Expose
    private List<Object> authorKey = null;
    @SerializedName("subject")
    @Expose
    private List<Object> subject = null;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("lending_identifier_s")
    @Expose
    private String lendingIdentifierS;
    @SerializedName("ia_collection_s")
    @Expose
    private String iaCollectionS;
    @SerializedName("first_publish_year")
    @Expose
    private Integer firstPublishYear;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("ebook_count_i")
    @Expose
    private Integer ebookCountI;
    @SerializedName("publish_place")
    @Expose
    private List<Object> publishPlace = null;
    @SerializedName("ia_box_id")
    @Expose
    private List<Object> iaBoxId = null;
    @SerializedName("edition_count")
    @Expose
    private Integer editionCount;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("id_goodreads")
    @Expose
    private List<Object> idGoodreads = null;
    @SerializedName("author_alternative_name")
    @Expose
    private List<Object> authorAlternativeName = null;
    @SerializedName("public_scan_b")
    @Expose
    private Boolean publicScanB;
    @SerializedName("id_overdrive")
    @Expose
    private List<Object> idOverdrive = null;
    @SerializedName("publisher")
    @Expose
    private List<Object> publisher = null;
    @SerializedName("language")
    @Expose
    private List<Object> language = null;
    @SerializedName("lccn")
    @Expose
    private List<Object> lccn = null;
    @SerializedName("last_modified_i")
    @Expose
    private Integer lastModifiedI;
    @SerializedName("lending_edition_s")
    @Expose
    private String lendingEditionS;
    @SerializedName("id_librarything")
    @Expose
    private List<Object> idLibrarything = null;
    @SerializedName("cover_edition_key")
    @Expose
    private String coverEditionKey;
    @SerializedName("person")
    @Expose
    private List<Object> person = null;
    @SerializedName("publish_year")
    @Expose
    private List<Object> publishYear = null;
    @SerializedName("printdisabled_s")
    @Expose
    private String printdisabledS;
    @SerializedName("place")
    @Expose
    private List<Object> place = null;
    @SerializedName("time")
    @Expose
    private List<Object> time = null;
    @SerializedName("publish_date")
    @Expose
    private List<Object> publishDate = null;

    public String getTitleSuggest() {
        return titleSuggest;
    }

    public void setTitleSuggest(String titleSuggest) {
        this.titleSuggest = titleSuggest;
    }

    public List<Object> getEditionKey() {
        return editionKey;
    }

    public void setEditionKey(List<Object> editionKey) {
        this.editionKey = editionKey;
    }

    public Integer getCoverI() {
        return coverI;
    }

    public void setCoverI(Integer coverI) {
        this.coverI = coverI;
    }

    public List<Object> getIsbn() {
        return isbn;
    }

    public void setIsbn(List<Object> isbn) {
        this.isbn = isbn;
    }

    public Boolean getHasFulltext() {
        return hasFulltext;
    }

    public void setHasFulltext(Boolean hasFulltext) {
        this.hasFulltext = hasFulltext;
    }

    public List<Object> getText() {
        return text;
    }

    public void setText(List<Object> text) {
        this.text = text;
    }

    public List<Object> getAuthorName() {
        return authorName;
    }

    public void setAuthorName(List<Object> authorName) {
        this.authorName = authorName;
    }

    public List<Object> getContributor() {
        return contributor;
    }

    public void setContributor(List<Object> contributor) {
        this.contributor = contributor;
    }

    public List<Object> getIaLoadedId() {
        return iaLoadedId;
    }

    public void setIaLoadedId(List<Object> iaLoadedId) {
        this.iaLoadedId = iaLoadedId;
    }

    public List<Object> getSeed() {
        return seed;
    }

    public void setSeed(List<Object> seed) {
        this.seed = seed;
    }

    public List<Object> getOclc() {
        return oclc;
    }

    public void setOclc(List<Object> oclc) {
        this.oclc = oclc;
    }

    public List<Object> getIa() {
        return ia;
    }

    public void setIa(List<Object> ia) {
        this.ia = ia;
    }

    public List<Object> getAuthorKey() {
        return authorKey;
    }

    public void setAuthorKey(List<Object> authorKey) {
        this.authorKey = authorKey;
    }

    public List<Object> getSubject() {
        return subject;
    }

    public void setSubject(List<Object> subject) {
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLendingIdentifierS() {
        return lendingIdentifierS;
    }

    public void setLendingIdentifierS(String lendingIdentifierS) {
        this.lendingIdentifierS = lendingIdentifierS;
    }

    public String getIaCollectionS() {
        return iaCollectionS;
    }

    public void setIaCollectionS(String iaCollectionS) {
        this.iaCollectionS = iaCollectionS;
    }

    public Integer getFirstPublishYear() {
        return firstPublishYear;
    }

    public void setFirstPublishYear(Integer firstPublishYear) {
        this.firstPublishYear = firstPublishYear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getEbookCountI() {
        return ebookCountI;
    }

    public void setEbookCountI(Integer ebookCountI) {
        this.ebookCountI = ebookCountI;
    }

    public List<Object> getPublishPlace() {
        return publishPlace;
    }

    public void setPublishPlace(List<Object> publishPlace) {
        this.publishPlace = publishPlace;
    }

    public List<Object> getIaBoxId() {
        return iaBoxId;
    }

    public void setIaBoxId(List<Object> iaBoxId) {
        this.iaBoxId = iaBoxId;
    }

    public Integer getEditionCount() {
        return editionCount;
    }

    public void setEditionCount(Integer editionCount) {
        this.editionCount = editionCount;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<Object> getIdGoodreads() {
        return idGoodreads;
    }

    public void setIdGoodreads(List<Object> idGoodreads) {
        this.idGoodreads = idGoodreads;
    }

    public List<Object> getAuthorAlternativeName() {
        return authorAlternativeName;
    }

    public void setAuthorAlternativeName(List<Object> authorAlternativeName) {
        this.authorAlternativeName = authorAlternativeName;
    }

    public Boolean getPublicScanB() {
        return publicScanB;
    }

    public void setPublicScanB(Boolean publicScanB) {
        this.publicScanB = publicScanB;
    }

    public List<Object> getIdOverdrive() {
        return idOverdrive;
    }

    public void setIdOverdrive(List<Object> idOverdrive) {
        this.idOverdrive = idOverdrive;
    }

    public List<Object> getPublisher() {
        return publisher;
    }

    public void setPublisher(List<Object> publisher) {
        this.publisher = publisher;
    }

    public List<Object> getLanguage() {
        return language;
    }

    public void setLanguage(List<Object> language) {
        this.language = language;
    }

    public List<Object> getLccn() {
        return lccn;
    }

    public void setLccn(List<Object> lccn) {
        this.lccn = lccn;
    }

    public Integer getLastModifiedI() {
        return lastModifiedI;
    }

    public void setLastModifiedI(Integer lastModifiedI) {
        this.lastModifiedI = lastModifiedI;
    }

    public String getLendingEditionS() {
        return lendingEditionS;
    }

    public void setLendingEditionS(String lendingEditionS) {
        this.lendingEditionS = lendingEditionS;
    }

    public List<Object> getIdLibrarything() {
        return idLibrarything;
    }

    public void setIdLibrarything(List<Object> idLibrarything) {
        this.idLibrarything = idLibrarything;
    }
    public String getCoverUrl() {
        return "http://covers.openlibrary.org/b/olid/" + getCoverEditionKey() + "-L.jpg?default=false";
    }

    public String getCoverEditionKey() {
        return coverEditionKey;
    }

    public void setCoverEditionKey(String coverEditionKey) {
        this.coverEditionKey = coverEditionKey;
    }

    public List<Object> getPerson() {
        return person;
    }

    public void setPerson(List<Object> person) {
        this.person = person;
    }

    public List<Object> getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(List<Object> publishYear) {
        this.publishYear = publishYear;
    }

    public String getPrintdisabledS() {
        return printdisabledS;
    }

    public void setPrintdisabledS(String printdisabledS) {
        this.printdisabledS = printdisabledS;
    }

    public List<Object> getPlace() {
        return place;
    }

    public void setPlace(List<Object> place) {
        this.place = place;
    }

    public List<Object> getTime() {
        return time;
    }

    public void setTime(List<Object> time) {
        this.time = time;
    }

    public List<Object> getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(List<Object> publishDate) {
        this.publishDate = publishDate;
    }
}

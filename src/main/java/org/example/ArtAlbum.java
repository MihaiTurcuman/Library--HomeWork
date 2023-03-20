package org.example;

public class ArtAlbum extends Book{

    private String paperQuality;

    @Override
    public String toString() {
        return "Art album, name: " + name +
                "number of pages: " + numberOfPages + "Paper Quality: " + getPaperQuality ();
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }
}

package utils;

public enum WebServiceEndPoints {

    URI(Endpoints.ADD_PET, Endpoints.SEARCH_PET);

    private final String url;
    private final String url1;


    WebServiceEndPoints(String url, String url1) {
        this.url = url;
        this.url1 = url1;

    }

    public String getUrl() {
        return url;
    }
    public String getUrl1() {
        return url1;
    }

}

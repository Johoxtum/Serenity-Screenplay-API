package models;


import models.headers.Header;

import java.util.HashMap;
import java.util.Map;

public class GetHeader {

    private GetHeader(){}

    public static final Map <String,String> headers = new HashMap<>();

    public static Map <String,String> basicHeaders (){

        headers.put(Header.CONTENT_TYPE.getHeader(), Header.CONTENT_TYPE.getValue());
        headers.put(Header.ACEPT.getHeader(), Header.ACEPT.getValue());


        return headers;
    }
}
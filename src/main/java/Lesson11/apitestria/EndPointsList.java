package Lesson11.apitestria;

import lesson6.part2.CourseList;
import lesson6.part2.Faculty;

import java.util.Locale;

public enum  EndPointsList {
    BaseUrl ("https://developers.ria.com/auto/"),
    Categories ("categories/"),
    Marks ("marks/");

    private String url;

    EndPointsList (String url){
        this.url = url;
    }


    public String getUrl(){
        return this.url;
    }

}

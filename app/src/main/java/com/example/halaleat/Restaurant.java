package com.example.halaleat;

import java.util.*;
import java.io.*;
import java.util.Arrays;


public class Restaurant{

    private String name;
    private String hours;
    private String address;
    private double v;
    private double v1;

    public static final Restaurant[] philidelphiaRestaurant = {
            new Restaurant("Nafi Food Express","Opens 10am-6pm (Mon-Fri)","Address: 3440 PA-3, Philadelphia, PA 19104", 39.955783, -75.192094),
            new Restaurant("Halal Cart ", "Opens 10 am-10pm (Mon-Sun)","Address: 12 S 33rd St, Philadelphia, PA 19104", 39.955177, -75.189454),
            new Restaurant("Saad's Halal Restaurant", "Opens 11 am - 10pm (Mon-Sat)","Address: 4500 Walnut St, Philadelphia, PA 19139", 39.955092, -75.211750),
            new Restaurant("Tang’s Halal Chinese Restaurant", "Opens: 11 am - 11pm (Mon-Sat) & 4 pm - 10pm (Sun)", "Address: 2223 Ridge Ave, Philadelphia, PA 19121", 39.980266, -75.171756),
            new Restaurant("Halal Gyro Express", "Opens: 9 am - 4pm (Mon-Fri)", "Address: 32 N 18th St, Philadelphia, PA 19103", 39.954364, -75.171137)
    };

    public static final Restaurant[] washingtonRestaurant = {
            new Restaurant("DCG - District Chicken & Gyro","Opens: 11 am - 10pm (Mon-Sun)", "3147 Dumbarton St NW, Washington, DC 20007",38.907766, -77.062966),
            new Restaurant("Metro Halal Food Cart", "Opens: 10 am - 3pm (Mon-Fri)", "Address: 1687 N Lynn St, Arlington, VA 22209", 38.894144, -77.070728),
            new Restaurant("Maydan","Opens: 5 pm - 11pm(Mon-Sat), 5 pm - 10pm(Sun)", "Address: 1346 Florida Ave NW, Washington, DC 20009", 38.919815, -77.030970),
            new Restaurant("Tempo the casual eatery", "Opens: 8:30 am - 8:30pm (Mon-Fri) & 11:30 am - 8:30pm(Sat)", "Address: 1195 20th St NW, Washington, DC 20036", 38.905549, -77.044081),
            new Restaurant("Bombay Street Food", "Open 12:00pm - 10pm", "Address: 1413 Park Rd NW, Washington, DC 20010", 38.930787, -77.032616)
    };

    public static final Restaurant[] newyorkRestaurant = {
            new Restaurant("Manhattan Halal Restaurant", "Opens: 11 am - 3am(Mon-Sun)", "Address: 156 W 29th St, New York, NY 10001", 40.759890, -73.979386),
            new Restaurant("Adel's Famous Halal Food", "Open: 11:00 am - 4:00 am", "Address: 1221 6th Ave, New York, NY 10020", 40.759545, -73.981117),
            new Restaurant("AFRIDI Halal Food", "Opens: 9:00 am - 9:00 pm", "Address: 254-21 Nassau Blvd, Little Neck, NY 11362",40.765390, -73.724513),
            new Restaurant("The Halal Guys", "Open: 10:00 am - 4:00 am", "Address: 6th Ave, New York, NY 10019", 40.761914, -73.978779),
            new Restaurant("Yemen Café", "Opens: 10 am - 11:30 pm", "Address: 176 Atlantic Ave, Brooklyn, NY 11201", 40.689880, -73.993595)
    };




    public Restaurant(String name, String hours, String address, Double v, Double v1){
        this.name = name;
        this.hours = hours;
        this.address = address;
        this.v = v;
        this.v1 = v1;
    }

    public String getName(){
        return this.name;
    }

    public String getHours(){
        return this.hours;
    }

    public String getAddress(){
        return this.address;
    }

    public Double getV(){
        return this.v;
    }

    public Double getV1(){
        return this.v1;
    }

}
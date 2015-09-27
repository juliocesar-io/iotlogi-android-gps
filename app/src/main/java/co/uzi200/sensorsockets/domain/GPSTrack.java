package co.uzi200.sensorsockets.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by uzi200 on 9/27/15.
 */
public class GPSTrack {

    private String key = "AXMB";

    private List<Object> points = new ArrayList<Object>() {
        {
            add(0);
            add(8.750099004178216);
            add(-75.88329896567437);
            add(10);
        }

    };

    @Override
    public String toString() {
        return "GPSTrack [key=" + key + ", points=" + "["
                + points + "]" + "]";
    }

}




package co.uzi200.sensorsockets.io;

import com.google.gson.Gson;
import co.uzi200.sensorsockets.domain.GPSTrack;
/**
 * Created by uzi200 on 9/27/15.
 */
public class JSONOut {

    private static GPSTrack a = new GPSTrack();

    private static Gson gson = new Gson();

    private static String out_json = "[" + gson.toJson(a) + "]";

    public static String getString(){

        return out_json;

    }


}

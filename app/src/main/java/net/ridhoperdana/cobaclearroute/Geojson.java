package net.ridhoperdana.cobaclearroute;

import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by RIDHO on 4/3/2017.
 */

public class Geojson {

    @SerializedName("type")
    String type = "FeatureCollection";

    @SerializedName("features")
    private Json features;

    public Json getFeatures() {
        return features;
    }

    public void setFeatures(Json features) {
        this.features = features;
    }

    public String getType() {
        return type;
    }
}

class Json implements Serializable {

    @SerializedName("type")
    private String type;

    @SerializedName("geometry")
    private Geometry geometry;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }
}

class Geometry implements Serializable
{
    @SerializedName("type")
    private String type;

    @SerializedName("coordinates")
    private ArrayList<String> coordinates;

    @SerializedName("properties")
    private String properties;

    public String getType() {
        return type;
    }

    public ArrayList<String> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<String> coordinates) {
        this.coordinates = coordinates;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }
}
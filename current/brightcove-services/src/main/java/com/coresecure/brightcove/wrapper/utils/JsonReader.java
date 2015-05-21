package com.coresecure.brightcove.wrapper.utils;
import java.io.IOException;

import org.apache.sling.commons.json.JSONArray;
import org.apache.sling.commons.json.JSONException;
import org.apache.sling.commons.json.JSONObject;

public class JsonReader {

  public static JSONObject readJsonFromString(String jsonText) throws IOException, JSONException {
	  JSONObject json = new JSONObject(jsonText);
      return json;
  }
  public static JSONArray readJsonArrayFromString(String jsonText) throws IOException, JSONException {
	  JSONArray json = new JSONArray(jsonText);
      return json;
  }

}
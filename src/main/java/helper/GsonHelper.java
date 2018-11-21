package helper;

import com.google.gson.*;


public class GsonHelper {
    public static <T> T fromJson(String requestBody, Class<T> type) {
        JsonObject jsonObject = (JsonObject) new JsonParser().parse(requestBody);
        JsonElement jsonElement = jsonObject.get("results");
        Gson gson = new Gson();
        return (T) new Gson().fromJson(jsonElement, type);
    }
}

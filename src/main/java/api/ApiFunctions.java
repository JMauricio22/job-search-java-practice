package api;

import feign.Feign;
import feign.gson.GsonDecoder;

public class ApiFunctions {
    public static <T> T buildApi(Class<T> clazz, String url) {
        return Feign
                .builder()
                .decoder(new GsonDecoder())
                .target(clazz, url);
    }
}

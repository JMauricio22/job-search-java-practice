package api;

import api.JobPosition;
import feign.Headers;
import feign.QueryMap;
import feign.RequestLine;

import java.util.List;
import java.util.Map;

@Headers("Accept: application/json")
public interface JobsApi {

    @RequestLine("GET /jobs")
    JobResource jobs(@QueryMap Map<String, Object> queryMap);
}

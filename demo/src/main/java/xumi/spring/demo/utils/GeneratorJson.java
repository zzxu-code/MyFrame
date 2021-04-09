package xumi.spring.demo.utils;

import com.alibaba.fastjson.JSONObject;

public class GeneratorJson {

    public static JSONObject success(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("error","not_allowed");
        return jsonObject;
    }

    public static String resultJson(JSONObject param){
        JSONObject result = new JSONObject();
        result.put("result",param);
        return result.toJSONString();
    }


}

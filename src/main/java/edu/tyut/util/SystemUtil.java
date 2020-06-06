package edu.tyut.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;

/**
 * @author TYUT_LH
 */
public class SystemUtil {

    private static final Logger logger = Logger.getLogger(SystemUtil.class);

    public static String serialization(Object obj) {
        ObjectMapper serializer = new ObjectMapper();
        String json;
        try {
            json = serializer.writeValueAsString(obj);
            if (logger.isInfoEnabled()) {
                logger.info("序列化对象：" + obj.getClass().getName() + "完成");
            }
            return json;
        } catch (JsonProcessingException e) {
            logger.error("序列化对象：" + obj.getClass().getName() + "失败!" + e.getMessage(), e.getCause());
        }
        return null;
    }

    public static <T> T deserialization(String json, Class<T> type) {
        ObjectMapper deserializer = new ObjectMapper();
        T t;
        try {
            t = deserializer.readValue(json, type);
            if (logger.isInfoEnabled()) {
                logger.info("反序列化对象：" + type.getName() + "完成");
            }
            return t;
        } catch (JsonProcessingException e) {
            logger.error("反序列化对象：" + type.getName() + "失败!" + e.getMessage(), e.getCause());
        }
        return null;
    }

    public static String jsonToCookie(String json) {
        if (json == null) {
            logger.warn("json value is null");
            return null;
        }
        json = json.replaceAll(",", "&");
        json = json.replaceAll("\"", "#");
        return json;
    }

    public static String cookieToJson(String cookieValue) {
        if (cookieValue == null) {
            logger.warn("cookie value is null");
            return null;
        }
        cookieValue = cookieValue.replaceAll("&", ",");
        cookieValue = cookieValue.replaceAll("#", "\"");
        return cookieValue;
    }
}

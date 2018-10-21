package team.cloud.platform.utils;

import java.util.Random;

/**
 * @author Ernest
 * @date 2018/9/16下午7:34
 */
public class KeyUtil {
    /**
     * 生成唯一的主键
     * 格式: 时间+随机数
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(90000) + 10000;

        return "cloud" + System.currentTimeMillis() + String.valueOf(number);
    }
}

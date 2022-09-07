import redis.clients.jedis.Jedis;

import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        String ping = jedis.ping();
        System.out.println(ping);

//        Set<String> keys = jedis.keys("*");
//        for (String key : keys) {
//            System.out.println(key);
//        }

//        jedis.flushDB();
        jedis.set("k2","小红");
        String k2 = jedis.get("k2");
        System.out.println(k2);
    }
}

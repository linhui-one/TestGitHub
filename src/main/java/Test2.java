import redis.clients.jedis.Jedis;

import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        String ping = jedis.ping();
        System.out.println(ping);
        jedis.set("k2","小红");
        String k2 = jedis.get("k2");
        System.out.println(k2);
    }
}

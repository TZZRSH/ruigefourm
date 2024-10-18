import auth.RuiGeAuthApplication;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author: zhao_rui
 * @Desc:
 * @create: 2024-10-18 10:56
 **/

@SpringBootTest(classes = RuiGeAuthApplication.class)
@Slf4j
public class RedisTest {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    void testHasKey() {
        log.info("key 是否存在：{}", Boolean.TRUE.equals(redisTemplate.hasKey("name")));
    }

    @Test
    void setHasKey(){
        redisTemplate.opsForValue().set("name","瑞哥");
    }

    @Test
    void testGetValue() {
        log.info("value 值：{}", redisTemplate.opsForValue().get("name"));
    }

    @Test
    void testHash(){
        redisTemplate.opsForHash().put("myHash","name","赵瑞");
    }

    @Test
    void getHash(){
        log.info("value 值：{}", redisTemplate.opsForHash().get("myHash","name"));
    }

    @Test
    void deleteHash(){
        redisTemplate.opsForHash().delete("myHash","name");
    }

}

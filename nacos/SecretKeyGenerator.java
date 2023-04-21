import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class SecretKeyGenerator {

    public static SecretKey generate() {
        try {
            // 使用AES算法生成256位的SecretKey
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(256);
            return keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        SecretKey secretKey = generate();
        System.out.println(Base64.getEncoder().encodeToString(secretKey.getEncoded()));
    }
}
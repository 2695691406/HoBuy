package hobuy;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptUtils {
	public String MD5(String str) {
		MessageDigest digest;
		try {
			digest = MessageDigest.getInstance("MD5");
			digest.update(str.getBytes());
			byte[] md5Byte = digest.digest();
			BigInteger bigInteger = new BigInteger(1, md5Byte);
			String md5 = bigInteger.toString(16);
			md5 = md5 + md5.substring(11, 13);
			return md5;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}
	}
}

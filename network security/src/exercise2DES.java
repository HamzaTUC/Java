import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;




public class exercise2DES {
	
	
	
	
	
	
    public static void main(String[] args) throws Exception {
        // Read the previously stored SecretKey.
        SecretKey key = (SecretKey) readFromFile("secretkey.dat");

        // Read the SealedObject
        SealedObject sealedObject = (SealedObject) readFromFile("sealed.dat");

        // Preparing Cipher object from decryption.
        if (sealedObject != null) {
            String DES = sealedObject.getAlgorithm();

            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, key);

            String text = (String) sealedObject.getObject(cipher);
            System.out.println("Text = " + text);
           
        }
    }

    // Method for reading object stored in a file.
    private static Object readFromFile(String filename) throws Exception {
        try (FileInputStream fis = new FileInputStream(new File("C:\\Users\\gheza\\Desktop\\plain.txt"));
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

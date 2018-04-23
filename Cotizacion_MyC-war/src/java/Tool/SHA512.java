/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tool;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 *
 * @author jsDotx3
 */
public class SHA512 {

    public static String getPasswordEncrypt(String passwordToHash) {
        String toReturn = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-512");
            digest.reset();
            digest.update(passwordToHash.getBytes("utf8"));
            toReturn = String.format("%040x", new BigInteger(1, digest.digest()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return toReturn;
    }
}

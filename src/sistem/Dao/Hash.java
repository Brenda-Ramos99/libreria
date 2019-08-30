package sistem.Dao;

/**
 * nombre de la clase: Hash
 * version:1.0
 * fecha: 25/08/19
 * copyright:ITCA-FEPADE
 * @author william Villatoro
 */
public class Hash {
     public static String getHash(String txt, String hashTyped) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance(hashTyped);
            byte[] array = md.digest(txt.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; i++) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public static String sha(String txt) {
        return Hash.getHash(txt, "SHA");
    }
}

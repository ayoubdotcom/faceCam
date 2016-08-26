package model;

import java.util.ResourceBundle;

public class CaptionUtils {
    
    private static ResourceBundle CAPTIONS;
    
    static {
        try {
            System.out.print("caption passe");
            CAPTIONS = ResourceBundle.getBundle("Language_en_US");
            System.out.print("caption erreur");
        } catch (Throwable throwable){
            System.err.println("Could not load i18n file");
            throwable.printStackTrace();
           // System.exit(1);
        }
    }
    
    public static String getString(String key){
        String value = key;
        try {            
            value = CAPTIONS.getString(key);
        } catch (Exception e) {
            System.err.println("Could not find key " + key);
        }
        return value;
    }
}

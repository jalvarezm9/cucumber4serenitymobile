package training.home2.util;

public class Plataforma {

    private static final String IOS = "iOS";
    private static final String ANDROID = "Android";
    private static final String plataforma = System.getProperty("appium.platformName");

    public static boolean isIOS() {
        return IOS.equalsIgnoreCase(plataforma);
    }

    public static boolean isAndroid() {
        return ANDROID.equalsIgnoreCase(plataforma);
    }
}

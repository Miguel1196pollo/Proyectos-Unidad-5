package mx.edu.utng.seccion_05_sharedpreferences_lab.Utils;

import android.content.SharedPreferences;
/**
 * Created by Toshiba on 10/04/2017.
 */
public class Util {

    public static String getUserMailPrefs(SharedPreferences preferences) {
        return preferences.getString("email", "");
    }

    public static String getUserPassPrefs(SharedPreferences preferences) {
        return preferences.getString("pass", "");
    }

    public static void removeSharedPreferences(SharedPreferences preferences) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.remove("email");
        editor.remove("pass");
        editor.apply();
    }
}

package traversoft.com.customuicomponentsdemo;

import android.content.Context;
import android.graphics.Typeface;
import java.util.Hashtable;

public class TypefaceManager {

    private static final Hashtable<String, Typeface> cache = new Hashtable<String, Typeface>();

    public static Typeface get(Context context, String name) {

        synchronized(cache) {

            if (!cache.containsKey(name)) {

                Typeface t = Typeface.createFromAsset(context.getAssets(), String.format("fonts/%s.otf", name));
                cache.put(name, t);
            }
            return cache.get(name);
        }
    }

}
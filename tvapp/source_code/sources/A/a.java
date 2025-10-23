package A;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;
/* loaded from: classes.dex */
public abstract class a {
    public static File a(Context context) {
        return context.getCodeCacheDir();
    }

    public static Drawable b(Context context, int i7) {
        return context.getDrawable(i7);
    }

    public static File c(Context context) {
        return context.getNoBackupFilesDir();
    }
}

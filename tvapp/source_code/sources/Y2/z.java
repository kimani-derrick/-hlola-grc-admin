package Y2;

import android.system.ErrnoException;
import android.system.OsConstants;
/* loaded from: classes.dex */
public abstract class z {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Throwable th) {
        if ((th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES) {
            return true;
        }
        return false;
    }
}

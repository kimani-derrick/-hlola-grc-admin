package j2;

import Z2.H;
import android.media.MediaDrm;
/* loaded from: classes.dex */
public abstract class s {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th) {
        return H.t(H.u(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
    }
}

package S3;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArrayList f3148a = new CopyOnWriteArrayList();

    public static Y3.c a(String str) {
        boolean startsWith;
        Iterator it = f3148a.iterator();
        while (it.hasNext()) {
            Y3.c cVar = (Y3.c) it.next();
            synchronized (cVar) {
                startsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (startsWith) {
                return cVar;
            }
        }
        throw new GeneralSecurityException(AbstractC0515y1.x("No KMS client does support: ", str));
    }
}

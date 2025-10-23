package u5;

import android.os.Looper;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.HashSet;
import java.util.Iterator;
import p6.l;
/* renamed from: u5.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1299g {

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f15078a = new HashSet();

    public final void a() {
        if (l.f13186q == null) {
            l.f13186q = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == l.f13186q) {
            Iterator it = this.f15078a.iterator();
            if (!it.hasNext()) {
                return;
            }
            AbstractC0515y1.v(it.next());
            throw null;
        }
        throw new IllegalStateException("Must be called on the Main thread.");
    }
}

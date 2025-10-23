package h4;

import android.util.Log;
import f3.InterfaceC0696a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class d implements InterfaceC0696a {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference f10982a = new AtomicReference();

    @Override // f3.InterfaceC0696a
    public final void a(boolean z7) {
        synchronized (f.f10985k) {
            try {
                Iterator it = new ArrayList(f.f10986l.values()).iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    if (fVar.f10990e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = fVar.f10993i.iterator();
                        while (it2.hasNext()) {
                            f fVar2 = ((c) it2.next()).f10981a;
                            if (!z7) {
                                ((L4.e) fVar2.f10992h.get()).b();
                            } else {
                                fVar2.getClass();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

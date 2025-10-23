package T1;

import a2.C0198a;
import c2.C0391b;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public final class o implements V1.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3253a;

    @Override // y5.InterfaceC1496a
    public final Object get() {
        switch (this.f3253a) {
            case 0:
                return new r(0, Executors.newSingleThreadExecutor());
            case 1:
                return "com.google.android.datatransport.events";
            case 2:
                return Integer.valueOf(a2.l.f5005t);
            case 3:
                return C0198a.f;
            case 4:
                return new C0391b(1);
            default:
                return new C0391b(0);
        }
    }
}

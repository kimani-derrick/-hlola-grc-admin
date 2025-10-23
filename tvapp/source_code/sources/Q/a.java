package Q;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.gms.internal.measurement.G1;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class a extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2817a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2818b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7, Object obj) {
        super(null);
        this.f2817a = i7;
        this.f2818b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f2817a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z7) {
        Cursor cursor;
        switch (this.f2817a) {
            case 0:
                c cVar = (c) this.f2818b;
                if (cVar.f2822r && (cursor = cVar.f2823s) != null && !cursor.isClosed()) {
                    cVar.f2821q = cVar.f2823s.requery();
                    return;
                }
                return;
            case 1:
                ((D1) this.f2818b).f8241a.set(true);
                return;
            default:
                G1 g12 = (G1) this.f2818b;
                synchronized (g12.f8345u) {
                    g12.f8346v = null;
                    g12.f8343s.run();
                }
                synchronized (g12) {
                    try {
                        Iterator it = g12.f8347w.iterator();
                        if (it.hasNext()) {
                            AbstractC0515y1.v(it.next());
                            throw null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(new Handler());
        this.f2817a = 0;
        this.f2818b = cVar;
    }
}

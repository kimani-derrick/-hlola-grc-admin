package X5;

import D5.i;
import M5.g;
import W5.AbstractC0113u;
import W5.C0100g;
import W5.C0114v;
import W5.D;
import W5.G;
import W5.I;
import W5.InterfaceC0093a0;
import W5.m0;
import android.os.Handler;
import android.os.Looper;
import b6.o;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class e extends AbstractC0113u implements D {
    private volatile e _immediate;

    /* renamed from: s  reason: collision with root package name */
    public final Handler f4292s;

    /* renamed from: t  reason: collision with root package name */
    public final String f4293t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f4294u;

    /* renamed from: v  reason: collision with root package name */
    public final e f4295v;

    public e(Handler handler) {
        this(handler, null, false);
    }

    @Override // W5.AbstractC0113u
    public final void V(i iVar, Runnable runnable) {
        if (!this.f4292s.post(runnable)) {
            Y(iVar, runnable);
        }
    }

    @Override // W5.AbstractC0113u
    public final boolean W() {
        if (this.f4294u && g.a(Looper.myLooper(), this.f4292s.getLooper())) {
            return false;
        }
        return true;
    }

    public final void Y(i iVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC0093a0 interfaceC0093a0 = (InterfaceC0093a0) iVar.f(C0114v.f4028r);
        if (interfaceC0093a0 != null) {
            interfaceC0093a0.b(cancellationException);
        }
        G.f3946b.V(iVar, runnable);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof e) && ((e) obj).f4292s == this.f4292s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4292s);
    }

    @Override // W5.D
    public final I n(long j7, final Runnable runnable, i iVar) {
        if (j7 > 4611686018427387903L) {
            j7 = 4611686018427387903L;
        }
        if (this.f4292s.postDelayed(runnable, j7)) {
            return new I() { // from class: X5.c
                @Override // W5.I
                public final void d() {
                    e.this.f4292s.removeCallbacks(runnable);
                }
            };
        }
        Y(iVar, runnable);
        return m0.f4006q;
    }

    @Override // W5.AbstractC0113u
    public final String toString() {
        e eVar;
        String str;
        d6.d dVar = G.f3945a;
        e eVar2 = o.f7208a;
        if (this == eVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar2.f4295v;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            if (this == eVar) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.f4293t;
            if (str2 == null) {
                str2 = this.f4292s.toString();
            }
            if (this.f4294u) {
                return AbstractC0515y1.m(str2, ".immediate");
            }
            return str2;
        }
        return str;
    }

    @Override // W5.D
    public final void y(long j7, C0100g c0100g) {
        R3.a aVar = new R3.a(c0100g, 8, this);
        if (j7 > 4611686018427387903L) {
            j7 = 4611686018427387903L;
        }
        if (this.f4292s.postDelayed(aVar, j7)) {
            c0100g.y(new d(this, 0, aVar));
        } else {
            Y(c0100g.f3988u, aVar);
        }
    }

    public e(Handler handler, String str, boolean z7) {
        this.f4292s = handler;
        this.f4293t = str;
        this.f4294u = z7;
        this._immediate = z7 ? this : null;
        e eVar = this._immediate;
        if (eVar == null) {
            eVar = new e(handler, str, true);
            this._immediate = eVar;
        }
        this.f4295v = eVar;
    }
}

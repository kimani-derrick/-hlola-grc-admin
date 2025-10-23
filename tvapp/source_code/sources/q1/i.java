package q1;

import W5.AbstractC0117y;
import W5.p0;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import com.boxhdo.android.tv.R;
import z5.C1530l;
/* loaded from: classes.dex */
public abstract class i extends V {
    public final Z5.r d = Z5.s.a(0, 0, 7);

    /* renamed from: e  reason: collision with root package name */
    public final Z5.w f13241e = Z5.s.b(Boolean.FALSE);

    public final p0 d(boolean z7, L5.p pVar) {
        return AbstractC0117y.p(P.i(this), null, 0, new h(z7, this, pVar, null), 3);
    }

    public final Object e(Throwable th, D5.d dVar) {
        m lVar;
        boolean z7 = th instanceof H1.c;
        C1530l c1530l = C1530l.f16479a;
        E5.a aVar = E5.a.f612q;
        if (z7) {
            Object f = f(new l(R.string.message_no_internet), dVar);
            if (f == aVar) {
                return f;
            }
            return c1530l;
        } else if (th instanceof H1.b) {
            Object f7 = f(new l(R.string.msg_unknown_error), dVar);
            if (f7 == aVar) {
                return f7;
            }
            return c1530l;
        } else {
            String message = th.getMessage();
            if (message != null && !U5.n.X(message)) {
                lVar = new k(message);
            } else {
                lVar = new l(R.string.msg_unknown_error);
            }
            Object f8 = f(lVar, dVar);
            if (f8 == aVar) {
                return f8;
            }
            return c1530l;
        }
    }

    public final Object f(m mVar, D5.d dVar) {
        Object a7 = this.d.a(mVar, dVar);
        if (a7 == E5.a.f612q) {
            return a7;
        }
        return C1530l.f16479a;
    }
}

package dagger.hilt.android.internal.managers;

import android.content.Context;
import androidx.activity.l;
import androidx.lifecycle.V;
import androidx.lifecycle.Y;
import l0.C0967c;
import l0.C0968d;
/* loaded from: classes.dex */
public final class c implements Y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9333a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9334b;

    public c(l lVar) {
        this.f9334b = lVar;
    }

    @Override // androidx.lifecycle.Y
    public final V a(Class cls) {
        switch (this.f9333a) {
            case 0:
                Context context = (Context) this.f9334b;
                M5.g.f(context, "context");
                return new e(new h1.f(((h1.i) ((d) android.support.v4.media.session.b.g0(d.class, p6.d.l(context.getApplicationContext())))).f10905b));
            default:
                throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }
    }

    @Override // androidx.lifecycle.Y
    public final V b(Class cls, C0967c c0967c) {
        C0968d[] c0968dArr;
        switch (this.f9333a) {
            case 0:
                return a(cls);
            default:
                V v5 = null;
                for (C0968d c0968d : (C0968d[]) this.f9334b) {
                    if (M5.g.a(c0968d.f12234a, cls)) {
                        Object c5 = c0968d.f12235b.c(c0967c);
                        if (c5 instanceof V) {
                            v5 = (V) c5;
                        } else {
                            v5 = null;
                        }
                    }
                }
                if (v5 != null) {
                    return v5;
                }
                throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
        }
    }

    public c(C0968d[] c0968dArr) {
        M5.g.f(c0968dArr, "initializers");
        this.f9334b = c0968dArr;
    }
}

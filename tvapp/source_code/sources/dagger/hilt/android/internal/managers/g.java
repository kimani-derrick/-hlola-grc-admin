package dagger.hilt.android.internal.managers;

import T1.j;
import Z5.n;
import android.content.Context;
import androidx.fragment.app.C0271z;
import androidx.fragment.app.ComponentCallbacksC0269x;
import com.boxhdo.android.tv.App;
import h1.C0745d;
import w5.InterfaceC1436a;
import w5.InterfaceC1437b;
/* loaded from: classes.dex */
public final class g implements InterfaceC1437b {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f9335q = 0;

    /* renamed from: r  reason: collision with root package name */
    public final Object f9336r = new Object();

    /* renamed from: s  reason: collision with root package name */
    public volatile InterfaceC1436a f9337s;

    /* renamed from: t  reason: collision with root package name */
    public final Object f9338t;

    public g(n nVar) {
        this.f9338t = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r1 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.content.Context b(dagger.hilt.android.internal.managers.i r1) {
        /*
        L0:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto Lf
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 != 0) goto Lf
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L0
        Lf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dagger.hilt.android.internal.managers.g.b(dagger.hilt.android.internal.managers.i):android.content.Context");
    }

    private final Object c() {
        if (((h1.i) this.f9337s) == null) {
            synchronized (this.f9336r) {
                if (((h1.i) this.f9337s) == null) {
                    this.f9337s = new h1.i(new j((Context) ((App) ((n) this.f9338t).f4918q), (char) 0));
                }
            }
        }
        return (h1.i) this.f9337s;
    }

    public h1.g a() {
        q1.g gVar;
        q1.g gVar2;
        q1.g gVar3;
        ComponentCallbacksC0269x componentCallbacksC0269x = (ComponentCallbacksC0269x) this.f9338t;
        C0271z c0271z = componentCallbacksC0269x.f6107K;
        q1.g gVar4 = null;
        if (c0271z == null) {
            gVar = null;
        } else {
            gVar = c0271z.f6150v;
        }
        if (gVar != null) {
            if (c0271z == null) {
                gVar2 = null;
            } else {
                gVar2 = c0271z.f6150v;
            }
            boolean z7 = gVar2 instanceof InterfaceC1437b;
            if (c0271z == null) {
                gVar3 = null;
            } else {
                gVar3 = c0271z.f6150v;
            }
            android.support.v4.media.session.b.p(z7, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", gVar3.getClass());
            C0271z c0271z2 = componentCallbacksC0269x.f6107K;
            if (c0271z2 != null) {
                gVar4 = c0271z2.f6150v;
            }
            return new h1.g(((C0745d) ((h) android.support.v4.media.session.b.g0(h.class, gVar4))).f10872c);
        }
        throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
    }

    @Override // w5.InterfaceC1437b
    public final Object k() {
        switch (this.f9335q) {
            case 0:
                return c();
            default:
                if (((h1.g) this.f9337s) == null) {
                    synchronized (this.f9336r) {
                        try {
                            if (((h1.g) this.f9337s) == null) {
                                this.f9337s = a();
                            }
                        } finally {
                        }
                    }
                }
                return (h1.g) this.f9337s;
        }
    }

    public g(ComponentCallbacksC0269x componentCallbacksC0269x) {
        this.f9338t = componentCallbacksC0269x;
    }
}

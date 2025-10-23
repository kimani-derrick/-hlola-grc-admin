package s3;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class Y0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f13934q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ String f13935r = null;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ String f13936s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ String f13937t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ m1 f13938u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f13939v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ R0 f13940w;

    public Y0(R0 r02, AtomicReference atomicReference, String str, String str2, m1 m1Var, boolean z7) {
        this.f13934q = atomicReference;
        this.f13936s = str;
        this.f13937t = str2;
        this.f13938u = m1Var;
        this.f13939v = z7;
        this.f13940w = r02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        R0 r02;
        InterfaceC1149D interfaceC1149D;
        AtomicReference atomicReference2;
        List q5;
        synchronized (this.f13934q) {
            try {
                r02 = this.f13940w;
                interfaceC1149D = r02.f13866t;
            } catch (RemoteException e3) {
                this.f13940w.b().f13807v.e("(legacy) Failed to get user properties; remote exception", C1154I.J(this.f13935r), this.f13936s, e3);
                this.f13934q.set(Collections.emptyList());
                atomicReference = this.f13934q;
            }
            if (interfaceC1149D == null) {
                r02.b().f13807v.e("(legacy) Failed to get user properties; not connected to service", C1154I.J(this.f13935r), this.f13936s, this.f13937t);
                this.f13934q.set(Collections.emptyList());
                this.f13934q.notify();
                return;
            }
            if (TextUtils.isEmpty(this.f13935r)) {
                g3.n.g(this.f13938u);
                atomicReference2 = this.f13934q;
                q5 = interfaceC1149D.m(this.f13936s, this.f13937t, this.f13939v, this.f13938u);
            } else {
                atomicReference2 = this.f13934q;
                q5 = interfaceC1149D.q(this.f13935r, this.f13936s, this.f13937t, this.f13939v);
            }
            atomicReference2.set(q5);
            this.f13940w.V();
            atomicReference = this.f13934q;
            atomicReference.notify();
        }
    }
}

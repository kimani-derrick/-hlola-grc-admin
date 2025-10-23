package s3;

import android.os.RemoteException;
import android.text.TextUtils;
import java.io.Serializable;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class Q implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f13856q;

    /* renamed from: r  reason: collision with root package name */
    public final String f13857r;

    /* renamed from: s  reason: collision with root package name */
    public final Serializable f13858s;

    /* renamed from: t  reason: collision with root package name */
    public final Serializable f13859t;

    /* renamed from: u  reason: collision with root package name */
    public final Object f13860u;

    /* renamed from: v  reason: collision with root package name */
    public final Object f13861v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ P1.c f13862w;

    /* JADX WARN: Multi-variable type inference failed */
    public Q(C1160O c1160o, String str, URL url, byte[] bArr, Map map, s1 s1Var) {
        this.f13856q = 0;
        this.f13862w = c1160o;
        g3.n.c(str);
        this.f13858s = url;
        this.f13859t = bArr;
        this.f13860u = s1Var;
        this.f13857r = str;
        this.f13861v = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a() {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.Q.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        R0 r02;
        InterfaceC1149D interfaceC1149D;
        AtomicReference atomicReference2;
        List s6;
        switch (this.f13856q) {
            case 0:
                a();
                return;
            default:
                synchronized (((AtomicReference) this.f13858s)) {
                    try {
                        r02 = (R0) this.f13862w;
                        interfaceC1149D = r02.f13866t;
                    } catch (RemoteException e3) {
                        ((R0) this.f13862w).b().f13807v.e("(legacy) Failed to get conditional properties; remote exception", C1154I.J(this.f13857r), (String) this.f13859t, e3);
                        ((AtomicReference) this.f13858s).set(Collections.emptyList());
                        atomicReference = (AtomicReference) this.f13858s;
                    }
                    if (interfaceC1149D == null) {
                        r02.b().f13807v.e("(legacy) Failed to get conditional properties; not connected to service", C1154I.J(this.f13857r), (String) this.f13859t, (String) this.f13860u);
                        ((AtomicReference) this.f13858s).set(Collections.emptyList());
                        ((AtomicReference) this.f13858s).notify();
                    } else {
                        if (TextUtils.isEmpty(this.f13857r)) {
                            g3.n.g((m1) this.f13861v);
                            atomicReference2 = (AtomicReference) this.f13858s;
                            s6 = interfaceC1149D.w((String) this.f13859t, (String) this.f13860u, (m1) this.f13861v);
                        } else {
                            atomicReference2 = (AtomicReference) this.f13858s;
                            s6 = interfaceC1149D.s(this.f13857r, (String) this.f13859t, (String) this.f13860u);
                        }
                        atomicReference2.set(s6);
                        ((R0) this.f13862w).V();
                        atomicReference = (AtomicReference) this.f13858s;
                        atomicReference.notify();
                    }
                }
                return;
        }
    }

    public Q(R0 r02, AtomicReference atomicReference, String str, String str2, m1 m1Var) {
        this.f13856q = 1;
        this.f13858s = atomicReference;
        this.f13857r = null;
        this.f13859t = str;
        this.f13860u = str2;
        this.f13861v = m1Var;
        this.f13862w = r02;
    }
}

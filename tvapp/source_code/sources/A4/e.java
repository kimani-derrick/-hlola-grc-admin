package A4;

import android.os.RemoteException;
import g3.n;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import s3.C1169d0;
import s3.EnumC1196r0;
import s3.InterfaceC1149D;
import s3.L0;
import s3.M0;
import s3.R0;
import s3.V;
import s3.m1;
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f104q;

    /* renamed from: r  reason: collision with root package name */
    public Object f105r;

    /* renamed from: s  reason: collision with root package name */
    public Object f106s;

    /* renamed from: t  reason: collision with root package name */
    public Object f107t;

    public /* synthetic */ e(int i7) {
        this.f104q = i7;
    }

    private final void a() {
        AtomicReference atomicReference;
        synchronized (((AtomicReference) this.f105r)) {
            try {
            } catch (RemoteException e3) {
                ((R0) this.f107t).b().f13807v.c(e3, "Failed to get app instance id");
                atomicReference = (AtomicReference) this.f105r;
            }
            if (!((R0) this.f107t).B().P().i(EnumC1196r0.f14217s)) {
                ((R0) this.f107t).b().f13800A.d("Analytics storage consent denied; will not get app instance id");
                ((R0) this.f107t).E().h0(null);
                ((R0) this.f107t).B().f13898x.j(null);
                ((AtomicReference) this.f105r).set(null);
                ((AtomicReference) this.f105r).notify();
                return;
            }
            R0 r02 = (R0) this.f107t;
            InterfaceC1149D interfaceC1149D = r02.f13866t;
            if (interfaceC1149D == null) {
                r02.b().f13807v.d("Failed to get app instance id");
                ((AtomicReference) this.f105r).notify();
                return;
            }
            n.g((m1) this.f106s);
            ((AtomicReference) this.f105r).set(interfaceC1149D.v((m1) this.f106s));
            String str = (String) ((AtomicReference) this.f105r).get();
            if (str != null) {
                ((R0) this.f107t).E().h0(str);
                ((R0) this.f107t).B().f13898x.j(str);
            }
            ((R0) this.f107t).V();
            atomicReference = (AtomicReference) this.f105r;
            atomicReference.notify();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(int i7, IOException iOException, byte[] bArr, Map map) {
        C1169d0 d = ((L0) this.f107t).d();
        M0 m02 = new M0(0);
        m02.f13832s = this;
        m02.f13831r = i7;
        m02.f13833t = iOException;
        m02.f13834u = bArr;
        d.M(m02);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0156  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.e.run():void");
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i7) {
        this.f104q = i7;
        this.f107t = obj;
        this.f105r = obj2;
        this.f106s = obj3;
    }

    public e(L0 l02, String str, URL url, V v5) {
        this.f104q = 7;
        this.f107t = l02;
        n.c(str);
        this.f105r = url;
        this.f106s = v5;
    }
}

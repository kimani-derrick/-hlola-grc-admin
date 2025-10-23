package j2;

import H2.C0016q;
import Z2.AbstractC0156a;
import Z2.C0159d;
import Z2.H;
import Z4.Q;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import i2.InterfaceC0770b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
/* renamed from: j2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0834c implements k {

    /* renamed from: a  reason: collision with root package name */
    public final List f11768a;

    /* renamed from: b  reason: collision with root package name */
    public final x f11769b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.fragment.app.D f11770c;
    public final C0835d d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11771e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f11772g;

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f11773h;

    /* renamed from: i  reason: collision with root package name */
    public final C0159d f11774i;

    /* renamed from: j  reason: collision with root package name */
    public final L4.f f11775j;

    /* renamed from: k  reason: collision with root package name */
    public final f2.m f11776k;

    /* renamed from: l  reason: collision with root package name */
    public final L0.b f11777l;

    /* renamed from: m  reason: collision with root package name */
    public final UUID f11778m;
    public final Looper n;

    /* renamed from: o  reason: collision with root package name */
    public final Q f11779o;

    /* renamed from: p  reason: collision with root package name */
    public int f11780p;

    /* renamed from: q  reason: collision with root package name */
    public int f11781q;

    /* renamed from: r  reason: collision with root package name */
    public HandlerThread f11782r;

    /* renamed from: s  reason: collision with root package name */
    public HandlerC0832a f11783s;

    /* renamed from: t  reason: collision with root package name */
    public InterfaceC0770b f11784t;

    /* renamed from: u  reason: collision with root package name */
    public j f11785u;

    /* renamed from: v  reason: collision with root package name */
    public byte[] f11786v;

    /* renamed from: w  reason: collision with root package name */
    public byte[] f11787w;

    /* renamed from: x  reason: collision with root package name */
    public v f11788x;

    /* renamed from: y  reason: collision with root package name */
    public w f11789y;

    public C0834c(UUID uuid, x xVar, androidx.fragment.app.D d, C0835d c0835d, List list, int i7, boolean z7, boolean z8, byte[] bArr, HashMap hashMap, L0.b bVar, Looper looper, L4.f fVar, f2.m mVar) {
        List unmodifiableList;
        if (i7 == 1 || i7 == 3) {
            bArr.getClass();
        }
        this.f11778m = uuid;
        this.f11770c = d;
        this.d = c0835d;
        this.f11769b = xVar;
        this.f11771e = i7;
        this.f = z7;
        this.f11772g = z8;
        if (bArr != null) {
            this.f11787w = bArr;
            unmodifiableList = null;
        } else {
            list.getClass();
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.f11768a = unmodifiableList;
        this.f11773h = hashMap;
        this.f11777l = bVar;
        this.f11774i = new C0159d();
        this.f11775j = fVar;
        this.f11776k = mVar;
        this.f11780p = 2;
        this.n = looper;
        this.f11779o = new Q(this, looper, 1);
    }

    @Override // j2.k
    public final void a(n nVar) {
        p();
        int i7 = this.f11781q;
        if (i7 <= 0) {
            AbstractC0156a.q("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i8 = i7 - 1;
        this.f11781q = i8;
        if (i8 == 0) {
            this.f11780p = 0;
            Q q5 = this.f11779o;
            int i9 = H.f4603a;
            q5.removeCallbacksAndMessages(null);
            HandlerC0832a handlerC0832a = this.f11783s;
            synchronized (handlerC0832a) {
                handlerC0832a.removeCallbacksAndMessages(null);
                handlerC0832a.f11763a = true;
            }
            this.f11783s = null;
            this.f11782r.quit();
            this.f11782r = null;
            this.f11784t = null;
            this.f11785u = null;
            this.f11788x = null;
            this.f11789y = null;
            byte[] bArr = this.f11786v;
            if (bArr != null) {
                this.f11769b.u(bArr);
                this.f11786v = null;
            }
        }
        if (nVar != null) {
            this.f11774i.c(nVar);
            if (this.f11774i.b(nVar) == 0) {
                nVar.f();
            }
        }
        C0835d c0835d = this.d;
        int i10 = this.f11781q;
        g gVar = c0835d.f11790a;
        if (i10 == 1 && gVar.f11799E > 0 && gVar.f11795A != -9223372036854775807L) {
            gVar.f11798D.add(this);
            Handler handler = gVar.f11803J;
            handler.getClass();
            handler.postAtTime(new E1.b(18, this), this, SystemClock.uptimeMillis() + gVar.f11795A);
        } else if (i10 == 0) {
            gVar.f11796B.remove(this);
            if (gVar.f11800G == this) {
                gVar.f11800G = null;
            }
            if (gVar.f11801H == this) {
                gVar.f11801H = null;
            }
            androidx.fragment.app.D d = gVar.f11815x;
            HashSet hashSet = (HashSet) d.f5883r;
            hashSet.remove(this);
            if (((C0834c) d.f5884s) == this) {
                d.f5884s = null;
                if (!hashSet.isEmpty()) {
                    C0834c c0834c = (C0834c) hashSet.iterator().next();
                    d.f5884s = c0834c;
                    w e3 = c0834c.f11769b.e();
                    c0834c.f11789y = e3;
                    HandlerC0832a handlerC0832a2 = c0834c.f11783s;
                    int i11 = H.f4603a;
                    e3.getClass();
                    handlerC0832a2.getClass();
                    handlerC0832a2.obtainMessage(0, new C0833b(C0016q.f1156a.getAndIncrement(), true, SystemClock.elapsedRealtime(), e3)).sendToTarget();
                }
            }
            if (gVar.f11795A != -9223372036854775807L) {
                Handler handler2 = gVar.f11803J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                gVar.f11798D.remove(this);
            }
        }
        gVar.g();
    }

    @Override // j2.k
    public final boolean b() {
        p();
        return this.f;
    }

    @Override // j2.k
    public final void c(n nVar) {
        int i7;
        p();
        boolean z7 = false;
        if (this.f11781q < 0) {
            AbstractC0156a.q("DefaultDrmSession", "Session reference count less than zero: " + this.f11781q);
            this.f11781q = 0;
        }
        if (nVar != null) {
            C0159d c0159d = this.f11774i;
            synchronized (c0159d.f4622q) {
                try {
                    ArrayList arrayList = new ArrayList(c0159d.f4625t);
                    arrayList.add(nVar);
                    c0159d.f4625t = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) c0159d.f4623r.get(nVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(c0159d.f4624s);
                        hashSet.add(nVar);
                        c0159d.f4624s = Collections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = c0159d.f4623r;
                    if (num != null) {
                        i7 = num.intValue() + 1;
                    } else {
                        i7 = 1;
                    }
                    hashMap.put(nVar, Integer.valueOf(i7));
                } finally {
                }
            }
        }
        int i8 = this.f11781q + 1;
        this.f11781q = i8;
        if (i8 == 1) {
            if (this.f11780p == 2) {
                z7 = true;
            }
            AbstractC0156a.k(z7);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f11782r = handlerThread;
            handlerThread.start();
            this.f11783s = new HandlerC0832a(this, this.f11782r.getLooper());
            if (m()) {
                i(true);
            }
        } else if (nVar != null && j() && this.f11774i.b(nVar) == 1) {
            nVar.d(this.f11780p);
        }
        g gVar = this.d.f11790a;
        if (gVar.f11795A != -9223372036854775807L) {
            gVar.f11798D.remove(this);
            Handler handler = gVar.f11803J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // j2.k
    public final UUID d() {
        p();
        return this.f11778m;
    }

    @Override // j2.k
    public final boolean e(String str) {
        p();
        byte[] bArr = this.f11786v;
        AbstractC0156a.l(bArr);
        return this.f11769b.B(str, bArr);
    }

    @Override // j2.k
    public final j f() {
        p();
        if (this.f11780p == 1) {
            return this.f11785u;
        }
        return null;
    }

    @Override // j2.k
    public final InterfaceC0770b g() {
        p();
        return this.f11784t;
    }

    @Override // j2.k
    public final int getState() {
        p();
        return this.f11780p;
    }

    public final void h(f2.d dVar) {
        Set<n> set;
        C0159d c0159d = this.f11774i;
        synchronized (c0159d.f4622q) {
            set = c0159d.f4624s;
        }
        for (n nVar : set) {
            nVar.a();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:58|(2:59|60)|(6:62|63|64|65|(1:67)|69)|72|63|64|65|(0)|69) */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e A[Catch: NumberFormatException -> 0x0092, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0092, blocks: (B:39:0x0086, B:41:0x008e), top: B:66:0x0086 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(boolean r11) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.C0834c.i(boolean):void");
    }

    public final boolean j() {
        int i7 = this.f11780p;
        if (i7 != 3 && i7 != 4) {
            return false;
        }
        return true;
    }

    public final void k(Exception exc, int i7) {
        int i8;
        Set<n> set;
        int i9 = H.f4603a;
        if (i9 >= 21 && s.a(exc)) {
            i8 = s.b(exc);
        } else {
            if (i9 < 23 || !t.a(exc)) {
                if (i9 < 18 || !r.b(exc)) {
                    if (i9 >= 18 && r.a(exc)) {
                        i8 = 6007;
                    } else if (exc instanceof E) {
                        i8 = 6001;
                    } else if (exc instanceof C0836e) {
                        i8 = 6003;
                    } else if (exc instanceof C0831C) {
                        i8 = 6008;
                    } else if (i7 != 1) {
                        if (i7 == 2) {
                            i8 = 6004;
                        } else if (i7 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i8 = 6002;
            }
            i8 = 6006;
        }
        this.f11785u = new j(i8, exc);
        AbstractC0156a.r("DefaultDrmSession", "DRM session error", exc);
        C0159d c0159d = this.f11774i;
        synchronized (c0159d.f4622q) {
            set = c0159d.f4624s;
        }
        for (n nVar : set) {
            nVar.e(exc);
        }
        if (this.f11780p != 4) {
            this.f11780p = 1;
        }
    }

    public final void l(Exception exc, boolean z7) {
        int i7;
        if (exc instanceof NotProvisionedException) {
            androidx.fragment.app.D d = this.f11770c;
            ((HashSet) d.f5883r).add(this);
            if (((C0834c) d.f5884s) == null) {
                d.f5884s = this;
                w e3 = this.f11769b.e();
                this.f11789y = e3;
                HandlerC0832a handlerC0832a = this.f11783s;
                int i8 = H.f4603a;
                e3.getClass();
                handlerC0832a.getClass();
                handlerC0832a.obtainMessage(0, new C0833b(C0016q.f1156a.getAndIncrement(), true, SystemClock.elapsedRealtime(), e3)).sendToTarget();
                return;
            }
            return;
        }
        if (z7) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        k(exc, i7);
    }

    public final boolean m() {
        Set<n> set;
        if (j()) {
            return true;
        }
        try {
            byte[] C3 = this.f11769b.C();
            this.f11786v = C3;
            this.f11769b.p(C3, this.f11776k);
            this.f11784t = this.f11769b.y(this.f11786v);
            this.f11780p = 3;
            C0159d c0159d = this.f11774i;
            synchronized (c0159d.f4622q) {
                set = c0159d.f4624s;
            }
            for (n nVar : set) {
                nVar.d(3);
            }
            this.f11786v.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            androidx.fragment.app.D d = this.f11770c;
            ((HashSet) d.f5883r).add(this);
            if (((C0834c) d.f5884s) == null) {
                d.f5884s = this;
                w e3 = this.f11769b.e();
                this.f11789y = e3;
                HandlerC0832a handlerC0832a = this.f11783s;
                int i7 = H.f4603a;
                e3.getClass();
                handlerC0832a.getClass();
                handlerC0832a.obtainMessage(0, new C0833b(C0016q.f1156a.getAndIncrement(), true, SystemClock.elapsedRealtime(), e3)).sendToTarget();
            }
            return false;
        } catch (Exception e7) {
            k(e7, 1);
            return false;
        }
    }

    public final void n(int i7, boolean z7, byte[] bArr) {
        try {
            v h7 = this.f11769b.h(bArr, this.f11768a, i7, this.f11773h);
            this.f11788x = h7;
            HandlerC0832a handlerC0832a = this.f11783s;
            int i8 = H.f4603a;
            h7.getClass();
            handlerC0832a.getClass();
            handlerC0832a.obtainMessage(1, new C0833b(C0016q.f1156a.getAndIncrement(), z7, SystemClock.elapsedRealtime(), h7)).sendToTarget();
        } catch (Exception e3) {
            l(e3, true);
        }
    }

    public final Map o() {
        p();
        byte[] bArr = this.f11786v;
        if (bArr == null) {
            return null;
        }
        return this.f11769b.n(bArr);
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.n;
        if (currentThread != looper.getThread()) {
            AbstractC0156a.L("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}

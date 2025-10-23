package g3;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import s3.C1155J;
import s3.InterfaceC1149D;
import s3.X0;
/* renamed from: g3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0733b {

    /* renamed from: u  reason: collision with root package name */
    public static final d3.c[] f10758u = new d3.c[0];

    /* renamed from: a  reason: collision with root package name */
    public J3.e f10759a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f10760b;

    /* renamed from: c  reason: collision with root package name */
    public final w f10761c;
    public final d3.d d;

    /* renamed from: e  reason: collision with root package name */
    public final o f10762e;
    public final Object f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f10763g;

    /* renamed from: h  reason: collision with root package name */
    public j f10764h;

    /* renamed from: i  reason: collision with root package name */
    public Z5.n f10765i;

    /* renamed from: j  reason: collision with root package name */
    public IInterface f10766j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f10767k;

    /* renamed from: l  reason: collision with root package name */
    public q f10768l;

    /* renamed from: m  reason: collision with root package name */
    public int f10769m;
    public final X0 n;

    /* renamed from: o  reason: collision with root package name */
    public final X0 f10770o;

    /* renamed from: p  reason: collision with root package name */
    public final int f10771p;

    /* renamed from: q  reason: collision with root package name */
    public final String f10772q;

    /* renamed from: r  reason: collision with root package name */
    public d3.b f10773r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f10774s;

    /* renamed from: t  reason: collision with root package name */
    public final AtomicInteger f10775t;

    public AbstractC0733b(Context context, Looper looper, X0 x02, X0 x03) {
        synchronized (w.f10830h) {
            try {
                if (w.f10831i == null) {
                    w.f10831i = new w(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        w wVar = w.f10831i;
        d3.d dVar = d3.d.f9227b;
        this.f = new Object();
        this.f10763g = new Object();
        this.f10767k = new ArrayList();
        this.f10769m = 1;
        this.f10773r = null;
        this.f10774s = false;
        this.f10775t = new AtomicInteger(0);
        n.h(context, "Context must not be null");
        this.f10760b = context;
        n.h(looper, "Looper must not be null");
        n.h(wVar, "Supervisor must not be null");
        this.f10761c = wVar;
        n.h(dVar, "API availability must not be null");
        this.d = dVar;
        this.f10762e = new o(this, looper);
        this.f10771p = 93;
        this.n = x02;
        this.f10770o = x03;
        this.f10772q = null;
    }

    public static /* bridge */ /* synthetic */ void e(AbstractC0733b abstractC0733b) {
        int i7;
        int i8;
        synchronized (abstractC0733b.f) {
            i7 = abstractC0733b.f10769m;
        }
        if (i7 == 3) {
            abstractC0733b.f10774s = true;
            i8 = 5;
        } else {
            i8 = 4;
        }
        o oVar = abstractC0733b.f10762e;
        oVar.sendMessage(oVar.obtainMessage(i8, abstractC0733b.f10775t.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean f(AbstractC0733b abstractC0733b, int i7, int i8, InterfaceC1149D interfaceC1149D) {
        synchronized (abstractC0733b.f) {
            try {
                if (abstractC0733b.f10769m != i7) {
                    return false;
                }
                abstractC0733b.g(i8, interfaceC1149D);
                return true;
            } finally {
            }
        }
    }

    public final void a() {
        this.d.getClass();
        int a7 = d3.d.a(this.f10760b, 12451000);
        if (a7 != 0) {
            g(1, null);
            this.f10765i = new Z5.n((C1155J) this);
            int i7 = this.f10775t.get();
            o oVar = this.f10762e;
            oVar.sendMessage(oVar.obtainMessage(3, i7, a7, null));
            return;
        }
        this.f10765i = new Z5.n((C1155J) this);
        g(2, null);
    }

    public final IInterface b() {
        IInterface iInterface;
        synchronized (this.f) {
            try {
                if (this.f10769m != 5) {
                    if (c()) {
                        iInterface = this.f10766j;
                        n.h(iInterface, "Client is connected but service is null");
                    } else {
                        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                    }
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public final boolean c() {
        boolean z7;
        synchronized (this.f) {
            if (this.f10769m == 4) {
                z7 = true;
            } else {
                z7 = false;
            }
        }
        return z7;
    }

    public final boolean d() {
        boolean z7;
        synchronized (this.f) {
            int i7 = this.f10769m;
            z7 = true;
            if (i7 != 2 && i7 != 3) {
                z7 = false;
            }
        }
        return z7;
    }

    public final void g(int i7, InterfaceC1149D interfaceC1149D) {
        boolean z7;
        boolean z8;
        boolean z9;
        if (i7 != 4) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (interfaceC1149D == null) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (z7 == z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        n.a(z9);
        synchronized (this.f) {
            try {
                this.f10769m = i7;
                this.f10766j = interfaceC1149D;
                if (i7 != 1) {
                    if (i7 != 2 && i7 != 3) {
                        if (i7 == 4) {
                            n.g(interfaceC1149D);
                            System.currentTimeMillis();
                        }
                    } else {
                        q qVar = this.f10768l;
                        if (qVar != null && this.f10759a != null) {
                            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for com.google.android.gms.measurement.START on com.google.android.gms");
                            w wVar = this.f10761c;
                            this.f10759a.getClass();
                            this.f10759a.getClass();
                            if (this.f10772q == null) {
                                this.f10760b.getClass();
                            }
                            this.f10759a.getClass();
                            wVar.a("com.google.android.gms.measurement.START", "com.google.android.gms", qVar, false);
                            this.f10775t.incrementAndGet();
                        }
                        q qVar2 = new q(this, this.f10775t.get());
                        this.f10768l = qVar2;
                        this.f10759a = new J3.e(24);
                        w wVar2 = this.f10761c;
                        String str = this.f10772q;
                        if (str == null) {
                            str = this.f10760b.getClass().getName();
                        }
                        this.f10759a.getClass();
                        if (!wVar2.b(new u("com.google.android.gms.measurement.START", "com.google.android.gms", false), qVar2, str)) {
                            this.f10759a.getClass();
                            Log.w("GmsClient", "unable to connect to service: com.google.android.gms.measurement.START on com.google.android.gms");
                            int i8 = this.f10775t.get();
                            s sVar = new s(this, 16);
                            o oVar = this.f10762e;
                            oVar.sendMessage(oVar.obtainMessage(7, i8, -1, sVar));
                        }
                    }
                } else {
                    q qVar3 = this.f10768l;
                    if (qVar3 != null) {
                        w wVar3 = this.f10761c;
                        this.f10759a.getClass();
                        this.f10759a.getClass();
                        if (this.f10772q == null) {
                            this.f10760b.getClass();
                        }
                        this.f10759a.getClass();
                        wVar3.a("com.google.android.gms.measurement.START", "com.google.android.gms", qVar3, false);
                        this.f10768l = null;
                    }
                }
            } finally {
            }
        }
    }
}

package com.boxhdo.android.tv;

import L1.b;
import L1.h;
import U4.c;
import U4.f;
import U4.p;
import V4.k;
import Z5.n;
import android.app.Application;
import com.google.android.gms.internal.measurement.K1;
import dagger.hilt.android.internal.managers.g;
import h1.C0742a;
import h1.C0743b;
import h1.InterfaceC0744c;
import h1.i;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import t3.AbstractC1245i;
import t3.C1248l;
import t3.C1251o;
import w5.InterfaceC1437b;
/* loaded from: classes.dex */
public final class App extends Application implements InterfaceC1437b {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f7769u = 0;

    /* renamed from: q  reason: collision with root package name */
    public boolean f7770q = false;

    /* renamed from: r  reason: collision with root package name */
    public final g f7771r = new g(new n(this));

    /* renamed from: s  reason: collision with root package name */
    public b f7772s;

    /* renamed from: t  reason: collision with root package name */
    public h f7773t;

    public final void a() {
        if (!this.f7770q) {
            this.f7770q = true;
            i iVar = (i) ((InterfaceC0744c) this.f7771r.k());
            this.f7772s = (b) iVar.f.get();
            this.f7773t = (h) iVar.f10915h.get();
        }
        super.onCreate();
    }

    @Override // w5.InterfaceC1437b
    public final Object k() {
        return this.f7771r.k();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, U4.k] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, U4.k] */
    @Override // android.app.Application
    public final void onCreate() {
        a();
        try {
            f a7 = ((p) h4.f.c().b(p.class)).a();
            M5.g.e(a7, "getInstance()");
            ?? obj = new Object();
            obj.f3459a = k.f3694i;
            long seconds = TimeUnit.MINUTES.toSeconds(15L);
            if (seconds >= 0) {
                obj.f3459a = seconds;
                ?? obj2 = new Object();
                obj2.f3459a = obj.f3459a;
                m3.g.e(a7.f3452b, new c(a7, 0, obj2));
                C1251o a8 = a7.a();
                a8.f14596b.m(new C1248l(AbstractC1245i.f14574a, new C0742a(this, a7, 0)));
                a8.o();
                C0743b c0743b = new C0743b(a7, this);
                K1 k12 = a7.f3456h;
                synchronized (k12) {
                    ((LinkedHashSet) k12.f8367r).add(c0743b);
                    k12.q();
                }
                return;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + seconds + " is an invalid argument");
        } catch (Exception unused) {
        }
    }
}

package q3;

import android.os.Bundle;
import android.os.SystemClock;
import g3.n;
import j.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m3.i;
import o.j;
import s3.C1154I;
import s3.C1164b;
import s3.C1169d0;
import s3.C1175g0;
import s3.C1212z0;
import s3.N0;
import s3.O0;
import s3.RunnableC1189n0;
import s3.u1;
import s3.x1;
/* loaded from: classes.dex */
public final class b extends AbstractC1109a {

    /* renamed from: a  reason: collision with root package name */
    public final C1175g0 f13388a;

    /* renamed from: b  reason: collision with root package name */
    public final C1212z0 f13389b;

    public b(C1175g0 c1175g0) {
        n.g(c1175g0);
        this.f13388a = c1175g0;
        C1212z0 c1212z0 = c1175g0.F;
        C1175g0.g(c1212z0);
        this.f13389b = c1212z0;
    }

    @Override // s3.K0
    public final long a() {
        x1 x1Var = this.f13388a.f14035B;
        C1175g0.h(x1Var);
        return x1Var.P0();
    }

    @Override // s3.K0
    public final int b(String str) {
        n.c(str);
        return 25;
    }

    @Override // s3.K0
    public final void c(String str, String str2, Bundle bundle) {
        C1212z0 c1212z0 = this.f13388a.F;
        C1175g0.g(c1212z0);
        c1212z0.P(str, str2, bundle);
    }

    @Override // s3.K0
    public final void d(Bundle bundle) {
        C1212z0 c1212z0 = this.f13389b;
        ((C1175g0) c1212z0.f2765q).f14037D.getClass();
        c1212z0.g0(bundle, System.currentTimeMillis());
    }

    @Override // s3.K0
    public final void e(String str, String str2, Bundle bundle) {
        C1212z0 c1212z0 = this.f13389b;
        ((C1175g0) c1212z0.f2765q).f14037D.getClass();
        c1212z0.Q(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // s3.K0
    public final void f(String str) {
        C1175g0 c1175g0 = this.f13388a;
        C1164b m7 = c1175g0.m();
        c1175g0.f14037D.getClass();
        m7.M(SystemClock.elapsedRealtime(), str);
    }

    @Override // s3.K0
    public final String g() {
        return (String) this.f13389b.f14412w.get();
    }

    @Override // s3.K0
    public final String h() {
        N0 n02 = ((C1175g0) this.f13389b.f2765q).f14038E;
        C1175g0.g(n02);
        O0 o02 = n02.f13838s;
        if (o02 != null) {
            return o02.f13847a;
        }
        return null;
    }

    @Override // s3.K0
    public final List i(String str, String str2) {
        C1212z0 c1212z0 = this.f13389b;
        if (c1212z0.d().O()) {
            c1212z0.b().f13807v.d("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        } else if (i.f()) {
            c1212z0.b().f13807v.d("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            C1169d0 c1169d0 = ((C1175g0) c1212z0.f2765q).f14065z;
            C1175g0.i(c1169d0);
            c1169d0.H(atomicReference, 5000L, "get conditional user properties", new d(c1212z0, atomicReference, str, str2, 2));
            List list = (List) atomicReference.get();
            if (list == null) {
                c1212z0.b().f13807v.c(null, "Timed out waiting for get conditional user properties");
                return new ArrayList();
            }
            return x1.z0(list);
        }
    }

    @Override // s3.K0
    public final void j(String str) {
        C1175g0 c1175g0 = this.f13388a;
        C1164b m7 = c1175g0.m();
        c1175g0.f14037D.getClass();
        m7.I(SystemClock.elapsedRealtime(), str);
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.Map, o.j] */
    @Override // s3.K0
    public final Map k(String str, String str2, boolean z7) {
        C1154I b7;
        String str3;
        C1212z0 c1212z0 = this.f13389b;
        if (c1212z0.d().O()) {
            b7 = c1212z0.b();
            str3 = "Cannot get user properties from analytics worker thread";
        } else if (i.f()) {
            b7 = c1212z0.b();
            str3 = "Cannot get user properties from main thread";
        } else {
            AtomicReference atomicReference = new AtomicReference();
            C1169d0 c1169d0 = ((C1175g0) c1212z0.f2765q).f14065z;
            C1175g0.i(c1169d0);
            c1169d0.H(atomicReference, 5000L, "get user properties", new RunnableC1189n0(c1212z0, atomicReference, str, str2, z7, 1));
            List<u1> list = (List) atomicReference.get();
            if (list == null) {
                C1154I b8 = c1212z0.b();
                b8.f13807v.c(Boolean.valueOf(z7), "Timed out waiting for handle get user properties, includeInternal");
                return Collections.emptyMap();
            }
            ?? jVar = new j(list.size());
            for (u1 u1Var : list) {
                Object a7 = u1Var.a();
                if (a7 != null) {
                    jVar.put(u1Var.f14254r, a7);
                }
            }
            return jVar;
        }
        b7.f13807v.d(str3);
        return Collections.emptyMap();
    }

    @Override // s3.K0
    public final String l() {
        N0 n02 = ((C1175g0) this.f13389b.f2765q).f14038E;
        C1175g0.g(n02);
        O0 o02 = n02.f13838s;
        if (o02 != null) {
            return o02.f13848b;
        }
        return null;
    }

    @Override // s3.K0
    public final String m() {
        return (String) this.f13389b.f14412w.get();
    }
}

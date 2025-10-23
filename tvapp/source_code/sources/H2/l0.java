package H2;

import Y2.C0148q;
import Y2.InterfaceC0143l;
import Z2.AbstractC0156a;
import android.net.Uri;
import com.google.android.gms.internal.measurement.S1;
import e2.C0593J;
import e2.C0597b0;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class l0 extends AbstractC0000a {

    /* renamed from: h  reason: collision with root package name */
    public final C0148q f1120h;

    /* renamed from: i  reason: collision with root package name */
    public final InterfaceC0143l f1121i;

    /* renamed from: j  reason: collision with root package name */
    public final e2.K f1122j;

    /* renamed from: l  reason: collision with root package name */
    public final L4.f f1124l;
    public final h0 n;

    /* renamed from: o  reason: collision with root package name */
    public final e2.Z f1126o;

    /* renamed from: p  reason: collision with root package name */
    public Y2.W f1127p;

    /* renamed from: k  reason: collision with root package name */
    public final long f1123k = -9223372036854775807L;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f1125m = true;

    /* JADX WARN: Type inference failed for: r15v0, types: [e2.O, e2.P] */
    public l0(e2.Y y3, InterfaceC0143l interfaceC0143l, L4.f fVar) {
        e2.U u7;
        e2.Q q5;
        this.f1121i = interfaceC0143l;
        this.f1124l = fVar;
        boolean z7 = true;
        e2.N n = new e2.N();
        S1 s12 = new S1();
        List emptyList = Collections.emptyList();
        O3.U u8 = O3.U.f2621u;
        e2.V v5 = e2.V.f9769s;
        Uri uri = Uri.EMPTY;
        String uri2 = y3.f9789q.toString();
        uri2.getClass();
        O3.E s6 = O3.E.s(O3.E.x(y3));
        if (s12.f8415a != null && ((UUID) s12.f8418e) == null) {
            z7 = false;
        }
        AbstractC0156a.k(z7);
        if (uri != null) {
            if (((UUID) s12.f8418e) != null) {
                q5 = new e2.Q(s12);
            } else {
                q5 = null;
            }
            u7 = new e2.U(uri, null, q5, null, emptyList, null, s6, null);
        } else {
            u7 = null;
        }
        e2.Z z8 = new e2.Z(uri2, new e2.O(n), u7, new e2.T(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C0597b0.f9850Y, v5);
        this.f1126o = z8;
        C0593J c0593j = new C0593J();
        c0593j.f9605k = (String) w4.l0.p(y3.f9790r, "text/x-unknown");
        c0593j.f9599c = y3.f9791s;
        c0593j.d = y3.f9792t;
        c0593j.f9600e = y3.f9793u;
        c0593j.f9598b = y3.f9794v;
        String str = y3.f9795w;
        c0593j.f9597a = str != null ? str : null;
        this.f1122j = new e2.K(c0593j);
        Map emptyMap = Collections.emptyMap();
        Uri uri3 = y3.f9789q;
        AbstractC0156a.m(uri3, "The uri must be set.");
        this.f1120h = new C0148q(uri3, 0L, 1, null, emptyMap, 0L, -1L, null, 1, null);
        this.n = new h0(-9223372036854775807L, true, false, z8);
    }

    @Override // H2.AbstractC0000a
    public final InterfaceC0022x a(A a7, Y2.r rVar, long j7) {
        Y2.W w7 = this.f1127p;
        C.d dVar = new C.d((CopyOnWriteArrayList) this.f1011c.f326t, 0, a7);
        return new k0(this.f1120h, this.f1121i, w7, this.f1122j, this.f1123k, this.f1124l, dVar, this.f1125m);
    }

    @Override // H2.AbstractC0000a
    public final e2.Z g() {
        return this.f1126o;
    }

    @Override // H2.AbstractC0000a
    public final void k(Y2.W w7) {
        this.f1127p = w7;
        l(this.n);
    }

    @Override // H2.AbstractC0000a
    public final void m(InterfaceC0022x interfaceC0022x) {
        ((k0) interfaceC0022x).f1115y.c(null);
    }

    @Override // H2.AbstractC0000a
    public final void i() {
    }

    @Override // H2.AbstractC0000a
    public final void o() {
    }
}

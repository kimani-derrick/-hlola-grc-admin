package o1;

import H2.g0;
import Z2.H;
import android.util.Pair;
import com.boxhdo.android.tv.ui.activity.player.TvPlayerActivity;
import e2.C0585B;
import e2.C0591H;
import e2.H0;
import e2.I0;
import e2.J0;
import e2.p0;
import e2.z0;
import java.util.ArrayList;
import k3.AbstractC0958a;
import q1.C1104f;
import z5.C1530l;
/* loaded from: classes.dex */
public final class k extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f12858u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvPlayerActivity f12859v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(D5.d dVar, TvPlayerActivity tvPlayerActivity) {
        super(2, dVar);
        this.f12859v = tvPlayerActivity;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        k kVar = new k(dVar, this.f12859v);
        kVar.f12858u = obj;
        return kVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((k) h(dVar, (C1104f) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        z0 z0Var;
        int i7;
        boolean z7;
        Pair Y6;
        AbstractC0958a.H(obj);
        Object a7 = ((C1104f) this.f12858u).a();
        if (a7 != null) {
            A a8 = (A) a7;
            if (!M5.g.a(a8, z.f12887a)) {
                boolean z8 = a8 instanceof x;
                TvPlayerActivity tvPlayerActivity = this.f12859v;
                if (z8) {
                    int i8 = TvPlayerActivity.f7794Y;
                    tvPlayerActivity.e0(((x) a8).f12884a, ((C0585B) tvPlayerActivity.c0()).M());
                    tvPlayerActivity.i0();
                } else if (a8 instanceof y) {
                    y yVar = (y) a8;
                    int i9 = TvPlayerActivity.f7794Y;
                    tvPlayerActivity.e0(yVar.f12885a, yVar.f12886b);
                } else if (M5.g.a(a8, z.f12888b)) {
                    int i10 = TvPlayerActivity.f7794Y;
                    P1.c cVar = (P1.c) tvPlayerActivity.c0();
                    cVar.getClass();
                    C0585B c0585b = (C0585B) cVar;
                    c0585b.q0();
                    ArrayList arrayList = c0585b.f9424E;
                    int size = arrayList.size();
                    int min = Math.min(Integer.MAX_VALUE, size);
                    if (size > 0 && min != 0) {
                        p0 p0Var = c0585b.f9472w0;
                        int Q4 = c0585b.Q(p0Var);
                        long H6 = c0585b.H(p0Var);
                        int size2 = arrayList.size();
                        c0585b.W++;
                        c0585b.c0(min);
                        z0 z0Var2 = new z0(arrayList, c0585b.f9445b0);
                        J0 j02 = p0Var.f10043a;
                        if (j02.q() || z0Var2.q()) {
                            int i11 = -1;
                            z0Var = z0Var2;
                            i7 = 0;
                            if (!j02.q() && z0Var.q()) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (!z7) {
                                i11 = Q4;
                            }
                            if (z7) {
                                H6 = -9223372036854775807L;
                            }
                            Y6 = c0585b.Y(z0Var, i11, H6);
                        } else {
                            Y6 = j02.j((I0) c0585b.f2765q, c0585b.f9423D, Q4, H.J(H6));
                            Object obj2 = Y6.first;
                            if (z0Var2.b(obj2) != -1) {
                                i7 = 0;
                                z0Var = z0Var2;
                            } else {
                                i7 = 0;
                                z0Var = z0Var2;
                                Object H7 = C0591H.H((I0) c0585b.f2765q, c0585b.f9423D, c0585b.f9439U, c0585b.f9440V, obj2, j02, z0Var);
                                if (H7 != null) {
                                    H0 h02 = c0585b.f9423D;
                                    z0Var.h(H7, h02);
                                    int i12 = h02.f9554s;
                                    I0 i02 = (I0) c0585b.f2765q;
                                    z0Var.n(i12, i02, 0L);
                                    Y6 = c0585b.Y(z0Var, i12, H.S(i02.f9578C));
                                } else {
                                    Y6 = c0585b.Y(z0Var, -1, -9223372036854775807L);
                                }
                            }
                        }
                        p0 X6 = c0585b.X(p0Var, z0Var, Y6);
                        int i13 = X6.f10046e;
                        if (i13 != 1 && i13 != 4 && min > 0 && min == size2 && Q4 >= X6.f10043a.p()) {
                            X6 = X6.g(4);
                        }
                        p0 p0Var2 = X6;
                        g0 g0Var = c0585b.f9445b0;
                        Z2.D d = c0585b.f9420A.f9544x;
                        d.getClass();
                        Z2.C b7 = Z2.D.b();
                        b7.f4595a = d.f4597a.obtainMessage(20, i7, min, g0Var);
                        b7.b();
                        c0585b.o0(p0Var2, 0, 1, !p0Var2.f10044b.f1180a.equals(c0585b.f9472w0.f10044b.f1180a), 4, c0585b.N(p0Var2), -1, false);
                    }
                } else if (M5.g.a(a8, z.f12889c)) {
                    int i14 = TvPlayerActivity.f7794Y;
                    tvPlayerActivity.j0();
                }
            }
        }
        return C1530l.f16479a;
    }
}

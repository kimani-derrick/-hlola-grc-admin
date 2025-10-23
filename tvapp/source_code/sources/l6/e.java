package l6;

import h6.C0751a;
import h6.J;
import h6.s;
import h6.t;
import java.io.IOException;
import o6.C1072a;
import o6.EnumC1073b;
import o6.F;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final l f12313a;

    /* renamed from: b  reason: collision with root package name */
    public final C0751a f12314b;

    /* renamed from: c  reason: collision with root package name */
    public final i f12315c;
    public final h6.n d;

    /* renamed from: e  reason: collision with root package name */
    public n f12316e;
    public s f;

    /* renamed from: g  reason: collision with root package name */
    public int f12317g;

    /* renamed from: h  reason: collision with root package name */
    public int f12318h;

    /* renamed from: i  reason: collision with root package name */
    public int f12319i;

    /* renamed from: j  reason: collision with root package name */
    public J f12320j;

    public e(l lVar, C0751a c0751a, i iVar, h6.n nVar) {
        M5.g.f(lVar, "connectionPool");
        M5.g.f(nVar, "eventListener");
        this.f12313a = lVar;
        this.f12314b = c0751a;
        this.f12315c = iVar;
        this.d = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l6.k a(int r14, int r15, int r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.e.a(int, int, int, boolean, boolean):l6.k");
    }

    public final boolean b(t tVar) {
        M5.g.f(tVar, "url");
        t tVar2 = this.f12314b.f11124h;
        if (tVar.f11207e == tVar2.f11207e && M5.g.a(tVar.d, tVar2.d)) {
            return true;
        }
        return false;
    }

    public final void c(IOException iOException) {
        M5.g.f(iOException, "e");
        this.f12320j = null;
        if (iOException instanceof F) {
            if (((F) iOException).f12984q == EnumC1073b.f12989v) {
                this.f12317g++;
                return;
            }
        }
        if (iOException instanceof C1072a) {
            this.f12318h++;
        } else {
            this.f12319i++;
        }
    }
}

package m1;

import A5.k;
import A5.q;
import M5.g;
import Z5.u;
import a.AbstractC0189a;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.O;
import androidx.fragment.app.Q;
import androidx.fragment.app.S;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import n0.C1019j;
import n0.M;
import p0.e;
import z5.C1524f;
@M("fragment")
/* renamed from: m1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0986a extends e {

    /* renamed from: g  reason: collision with root package name */
    public final Context f12381g;

    /* renamed from: h  reason: collision with root package name */
    public final S f12382h;

    /* renamed from: i  reason: collision with root package name */
    public final int f12383i;

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashSet f12384j;

    public C0986a(Context context, S s6, int i7) {
        super(context, s6, i7);
        this.f12381g = context;
        this.f12382h = s6;
        this.f12383i = i7;
        this.f12384j = new LinkedHashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0011 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0181  */
    @Override // p0.e, n0.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.List r18, n0.C1002D r19) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.C0986a.d(java.util.List, n0.D):void");
    }

    @Override // p0.e, n0.N
    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f12384j;
            linkedHashSet.clear();
            q.R(stringArrayList, linkedHashSet);
        }
    }

    @Override // p0.e, n0.N
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f12384j;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return AbstractC0189a.h(new C1524f("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // p0.e, n0.N
    public final void i(C1019j c1019j, boolean z7) {
        g.f(c1019j, "popUpTo");
        S s6 = this.f12382h;
        if (s6.R()) {
            return;
        }
        if (z7) {
            List list = (List) ((u) b().f12559e.f3382r).getValue();
            C1019j c1019j2 = (C1019j) k.W(list);
            for (C1019j c1019j3 : k.g0(list.subList(list.indexOf(c1019j), list.size()))) {
                if (!g.a(c1019j3, c1019j2)) {
                    s6.y(new Q(s6, c1019j3.f12547v, 1), false);
                    this.f12384j.add(c1019j3.f12547v);
                }
            }
        } else {
            s6.y(new O(s6, c1019j.f12547v, -1), false);
        }
        b().c(c1019j, z7);
    }
}

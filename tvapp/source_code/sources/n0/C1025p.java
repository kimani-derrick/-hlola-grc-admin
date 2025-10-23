package n0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import z5.C1530l;
/* renamed from: n0.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1025p extends M5.h implements L5.l {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ M5.l f12573r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ List f12574s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ M5.m f12575t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ C0999A f12576u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Bundle f12577v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1025p(M5.l lVar, ArrayList arrayList, M5.m mVar, C0999A c0999a, Bundle bundle) {
        super(1);
        this.f12573r = lVar;
        this.f12574s = arrayList;
        this.f12575t = mVar;
        this.f12576u = c0999a;
        this.f12577v = bundle;
    }

    @Override // L5.l
    public final Object c(Object obj) {
        List list;
        C1019j c1019j = (C1019j) obj;
        M5.g.f(c1019j, "entry");
        this.f12573r.f2312q = true;
        List list2 = this.f12574s;
        int indexOf = list2.indexOf(c1019j);
        if (indexOf != -1) {
            M5.m mVar = this.f12575t;
            int i7 = indexOf + 1;
            list = list2.subList(mVar.f2313q, i7);
            mVar.f2313q = i7;
        } else {
            list = A5.t.f135q;
        }
        this.f12576u.a(c1019j.f12543r, this.f12577v, c1019j, list);
        return C1530l.f16479a;
    }
}

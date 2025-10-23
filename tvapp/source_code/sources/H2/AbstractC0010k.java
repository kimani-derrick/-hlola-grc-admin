package H2;

import Z2.AbstractC0156a;
import android.os.Handler;
import e2.J0;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: H2.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0010k extends AbstractC0000a {

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f1100h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public Handler f1101i;

    /* renamed from: j  reason: collision with root package name */
    public Y2.W f1102j;

    @Override // H2.AbstractC0000a
    public final void c() {
        for (C0009j c0009j : this.f1100h.values()) {
            c0009j.f1094a.b(c0009j.f1095b);
        }
    }

    @Override // H2.AbstractC0000a
    public final void e() {
        for (C0009j c0009j : this.f1100h.values()) {
            c0009j.f1094a.d(c0009j.f1095b);
        }
    }

    @Override // H2.AbstractC0000a
    public void i() {
        for (C0009j c0009j : this.f1100h.values()) {
            c0009j.f1094a.i();
        }
    }

    @Override // H2.AbstractC0000a
    public void o() {
        HashMap hashMap = this.f1100h;
        for (C0009j c0009j : hashMap.values()) {
            c0009j.f1094a.n(c0009j.f1095b);
            AbstractC0000a abstractC0000a = c0009j.f1094a;
            C4.b bVar = c0009j.f1096c;
            abstractC0000a.q(bVar);
            abstractC0000a.p(bVar);
        }
        hashMap.clear();
    }

    public abstract A r(Object obj, A a7);

    public abstract void u(Object obj, AbstractC0000a abstractC0000a, J0 j02);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [H2.i, H2.B] */
    /* JADX WARN: Type inference failed for: r3v1, types: [H2.G, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [j2.m, java.lang.Object] */
    public final void v(final Object obj, AbstractC0000a abstractC0000a) {
        HashMap hashMap = this.f1100h;
        AbstractC0156a.f(!hashMap.containsKey(obj));
        ?? r12 = new B() { // from class: H2.i
            @Override // H2.B
            public final void a(AbstractC0000a abstractC0000a2, J0 j02) {
                AbstractC0010k.this.u(obj, abstractC0000a2, j02);
            }
        };
        C4.b bVar = new C4.b(this, obj);
        hashMap.put(obj, new C0009j(abstractC0000a, r12, bVar));
        Handler handler = this.f1101i;
        handler.getClass();
        C.d dVar = abstractC0000a.f1011c;
        dVar.getClass();
        ?? obj2 = new Object();
        obj2.f900a = handler;
        obj2.f901b = bVar;
        ((CopyOnWriteArrayList) dVar.f326t).add(obj2);
        Handler handler2 = this.f1101i;
        handler2.getClass();
        j2.n nVar = abstractC0000a.d;
        nVar.getClass();
        ?? obj3 = new Object();
        obj3.f11831a = handler2;
        obj3.f11832b = bVar;
        nVar.f11835c.add(obj3);
        Y2.W w7 = this.f1102j;
        f2.m mVar = this.f1013g;
        AbstractC0156a.l(mVar);
        abstractC0000a.j(r12, w7, mVar);
        if (!(!this.f1010b.isEmpty())) {
            abstractC0000a.b(r12);
        }
    }

    public long s(long j7, Object obj) {
        return j7;
    }

    public int t(int i7, Object obj) {
        return i7;
    }
}

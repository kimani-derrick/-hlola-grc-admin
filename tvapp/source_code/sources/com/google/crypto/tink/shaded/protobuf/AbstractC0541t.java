package com.google.crypto.tink.shaded.protobuf;
/* renamed from: com.google.crypto.tink.shaded.protobuf.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0541t implements P, Cloneable {

    /* renamed from: q  reason: collision with root package name */
    public final AbstractC0543v f9163q;

    /* renamed from: r  reason: collision with root package name */
    public AbstractC0543v f9164r;

    public AbstractC0541t(AbstractC0543v abstractC0543v) {
        this.f9163q = abstractC0543v;
        if (!abstractC0543v.p()) {
            this.f9164r = abstractC0543v.t();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public static void l(AbstractC0543v abstractC0543v, Object obj) {
        Y y3 = Y.f9094c;
        y3.getClass();
        y3.a(abstractC0543v.getClass()).b(abstractC0543v, obj);
    }

    public final AbstractC0543v c() {
        AbstractC0543v e3 = e();
        e3.getClass();
        if (AbstractC0543v.o(e3, true)) {
            return e3;
        }
        throw new d0();
    }

    public /* bridge */ AbstractC0543v d() {
        return e();
    }

    public final AbstractC0543v e() {
        if (!this.f9164r.p()) {
            return this.f9164r;
        }
        this.f9164r.q();
        return this.f9164r;
    }

    public final AbstractC0541t g() {
        AbstractC0541t d = this.f9163q.d();
        d.f9164r = e();
        return d;
    }

    public final void i() {
        if (!this.f9164r.p()) {
            AbstractC0543v t5 = this.f9163q.t();
            l(t5, this.f9164r);
            this.f9164r = t5;
        }
    }

    public final void k(AbstractC0543v abstractC0543v) {
        if (this.f9163q.equals(abstractC0543v)) {
            return;
        }
        i();
        l(this.f9164r, abstractC0543v);
    }
}

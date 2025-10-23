package androidx.datastore.preferences.protobuf;
/* renamed from: androidx.datastore.preferences.protobuf.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0241u implements Cloneable {

    /* renamed from: q  reason: collision with root package name */
    public final AbstractC0243w f5823q;

    /* renamed from: r  reason: collision with root package name */
    public AbstractC0243w f5824r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5825s = false;

    public AbstractC0241u(AbstractC0243w abstractC0243w) {
        this.f5823q = abstractC0243w;
        this.f5824r = (AbstractC0243w) abstractC0243w.d(4);
    }

    public static void e(AbstractC0243w abstractC0243w, AbstractC0243w abstractC0243w2) {
        Y y3 = Y.f5733c;
        y3.getClass();
        y3.a(abstractC0243w.getClass()).b(abstractC0243w, abstractC0243w2);
    }

    public final AbstractC0243w b() {
        AbstractC0243w c5 = c();
        if (c5.g()) {
            return c5;
        }
        throw new F0.c();
    }

    public final AbstractC0243w c() {
        if (this.f5825s) {
            return this.f5824r;
        }
        AbstractC0243w abstractC0243w = this.f5824r;
        abstractC0243w.getClass();
        Y y3 = Y.f5733c;
        y3.getClass();
        y3.a(abstractC0243w.getClass()).f(abstractC0243w);
        this.f5825s = true;
        return this.f5824r;
    }

    public final Object clone() {
        AbstractC0241u abstractC0241u = (AbstractC0241u) this.f5823q.d(5);
        AbstractC0243w c5 = c();
        abstractC0241u.d();
        e(abstractC0241u.f5824r, c5);
        return abstractC0241u;
    }

    public final void d() {
        if (this.f5825s) {
            AbstractC0243w abstractC0243w = (AbstractC0243w) this.f5824r.d(4);
            e(abstractC0243w, this.f5824r);
            this.f5824r = abstractC0243w;
            this.f5825s = false;
        }
    }
}

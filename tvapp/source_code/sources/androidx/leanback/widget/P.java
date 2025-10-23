package androidx.leanback.widget;
/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a  reason: collision with root package name */
    public final O f6437a = new O(0);

    /* renamed from: b  reason: collision with root package name */
    public AbstractC0283b0 f6438b;

    public P(AbstractC0281a0 abstractC0281a0) {
        c(new D0(abstractC0281a0));
    }

    public abstract Object a(int i7);

    public final void b() {
        this.f6437a.b();
    }

    public final void c(AbstractC0283b0 abstractC0283b0) {
        if (abstractC0283b0 == null) {
            throw new IllegalArgumentException("Presenter selector must not be null");
        }
        boolean z7 = this.f6438b != null;
        this.f6438b = abstractC0283b0;
        if (z7) {
            b();
        }
    }

    public abstract int d();

    public P(AbstractC0283b0 abstractC0283b0) {
        c(abstractC0283b0);
    }
}

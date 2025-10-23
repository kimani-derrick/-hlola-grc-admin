package J;
/* loaded from: classes.dex */
public final class c extends b {
    public final Object d;

    public c() {
        super(12);
        this.d = new Object();
    }

    @Override // J.b
    public final Object a() {
        Object a7;
        synchronized (this.d) {
            a7 = super.a();
        }
        return a7;
    }

    @Override // J.b
    public final boolean c(Object obj) {
        boolean c5;
        synchronized (this.d) {
            c5 = super.c(obj);
        }
        return c5;
    }
}

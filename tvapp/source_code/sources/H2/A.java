package H2;
/* loaded from: classes.dex */
public final class A extends C0023y {
    public A(int i7, long j7, Object obj) {
        super(obj, -1, -1, j7, i7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [H2.y, H2.A] */
    public final A b(Object obj) {
        C0023y c0023y;
        if (this.f1180a.equals(obj)) {
            c0023y = this;
        } else {
            c0023y = new C0023y(obj, this.f1181b, this.f1182c, this.d, this.f1183e);
        }
        return new C0023y(c0023y);
    }
}

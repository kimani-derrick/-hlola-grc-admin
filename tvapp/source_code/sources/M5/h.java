package M5;

import java.io.Serializable;
/* loaded from: classes.dex */
public abstract class h implements e, Serializable {

    /* renamed from: q  reason: collision with root package name */
    public final int f2309q;

    public h(int i7) {
        this.f2309q = i7;
    }

    @Override // M5.e
    public final int e() {
        return this.f2309q;
    }

    public final String toString() {
        p.f2316a.getClass();
        String a7 = q.a(this);
        g.e(a7, "renderLambdaToString(...)");
        return a7;
    }
}

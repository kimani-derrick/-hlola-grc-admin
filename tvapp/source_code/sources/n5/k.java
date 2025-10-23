package n5;

import java.io.IOException;
/* loaded from: classes.dex */
public abstract class k {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, v6.h, v6.f] */
    public final Object a(String str) {
        ?? obj = new Object();
        obj.o0(str);
        o oVar = new o(obj);
        Object b7 = b(oVar);
        if (!c() && oVar.V() != 10) {
            throw new RuntimeException("JSON document was not fully consumed.");
        }
        return b7;
    }

    public abstract Object b(n nVar);

    public boolean c() {
        return this instanceof j;
    }

    public final o5.a d() {
        if (this instanceof o5.a) {
            return (o5.a) this;
        }
        return new o5.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, v6.f] */
    public final String e(Object obj) {
        ?? obj2 = new Object();
        try {
            f(new p(obj2), obj);
            return obj2.b0();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }

    public abstract void f(q qVar, Object obj);
}

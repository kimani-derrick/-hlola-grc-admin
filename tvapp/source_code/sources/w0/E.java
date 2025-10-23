package w0;

import java.util.concurrent.Executors;
import k.C0852F;
/* loaded from: classes.dex */
public abstract class E extends L {
    public final C1351e d;

    public E(AbstractC1348b abstractC1348b) {
        D d = new D(this);
        C0852F c0852f = new C0852F(24, this);
        synchronized (AbstractC1348b.f15508a) {
            try {
                if (AbstractC1348b.f15509b == null) {
                    AbstractC1348b.f15509b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1351e c1351e = new C1351e(c0852f, new t2.i(AbstractC1348b.f15509b, abstractC1348b, 9, false));
        this.d = c1351e;
        c1351e.d.add(d);
    }

    @Override // w0.L
    public final int a() {
        return this.d.f.size();
    }
}

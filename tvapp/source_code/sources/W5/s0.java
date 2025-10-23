package W5;
/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f4019a = new ThreadLocal();

    public static Q a() {
        ThreadLocal threadLocal = f4019a;
        Q q5 = (Q) threadLocal.get();
        if (q5 == null) {
            C0097d c0097d = new C0097d(Thread.currentThread());
            threadLocal.set(c0097d);
            return c0097d;
        }
        return q5;
    }
}

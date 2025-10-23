package W5;
/* loaded from: classes.dex */
public abstract class Q extends AbstractC0113u {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f3960v = 0;

    /* renamed from: s  reason: collision with root package name */
    public long f3961s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3962t;

    /* renamed from: u  reason: collision with root package name */
    public A5.i f3963u;

    public final void Y(boolean z7) {
        long j7;
        long j8 = this.f3961s;
        if (z7) {
            j7 = 4294967296L;
        } else {
            j7 = 1;
        }
        long j9 = j8 - j7;
        this.f3961s = j9;
        if (j9 <= 0 && this.f3962t) {
            shutdown();
        }
    }

    public abstract Thread Z();

    public final void a0(boolean z7) {
        long j7;
        long j8 = this.f3961s;
        if (z7) {
            j7 = 4294967296L;
        } else {
            j7 = 1;
        }
        this.f3961s = j7 + j8;
        if (!z7) {
            this.f3962t = true;
        }
    }

    public abstract long b0();

    public final boolean c0() {
        Object s6;
        A5.i iVar = this.f3963u;
        if (iVar == null) {
            return false;
        }
        if (iVar.isEmpty()) {
            s6 = null;
        } else {
            s6 = iVar.s();
        }
        F f = (F) s6;
        if (f == null) {
            return false;
        }
        f.run();
        return true;
    }

    public void d0(long j7, N n) {
        RunnableC0118z.f4044z.h0(j7, n);
    }

    public abstract void shutdown();
}

package b0;
/* renamed from: b0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0353e {

    /* renamed from: a  reason: collision with root package name */
    public final long f7007a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7008b;

    public C0353e(long j7, long j8) {
        if (j8 == 0) {
            this.f7007a = 0L;
            this.f7008b = 1L;
            return;
        }
        this.f7007a = j7;
        this.f7008b = j8;
    }

    public final String toString() {
        return this.f7007a + "/" + this.f7008b;
    }
}

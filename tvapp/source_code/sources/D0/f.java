package D0;

import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class f extends RuntimeException {

    /* renamed from: q  reason: collision with root package name */
    public final int f458q;

    /* renamed from: r  reason: collision with root package name */
    public final Throwable f459r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i7, Throwable th) {
        super(th);
        AbstractC1111a.x("callbackName", i7);
        this.f458q = i7;
        this.f459r = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f459r;
    }
}

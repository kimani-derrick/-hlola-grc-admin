package b6;
/* loaded from: classes.dex */
public final class g extends RuntimeException {

    /* renamed from: q  reason: collision with root package name */
    public final transient D5.i f7186q;

    public g(D5.i iVar) {
        this.f7186q = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f7186q.toString();
    }
}

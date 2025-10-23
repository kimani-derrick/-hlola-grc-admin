package a6;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class a extends CancellationException {

    /* renamed from: q  reason: collision with root package name */
    public final transient Z5.c f5195q;

    public a(Z5.c cVar) {
        super("Flow was aborted, no more elements needed");
        this.f5195q = cVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

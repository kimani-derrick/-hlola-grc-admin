package W5;

import java.util.concurrent.CancellationException;
/* renamed from: W5.b0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0095b0 extends CancellationException {

    /* renamed from: q  reason: collision with root package name */
    public final transient InterfaceC0093a0 f3975q;

    public C0095b0(String str, Throwable th, InterfaceC0093a0 interfaceC0093a0) {
        super(str);
        this.f3975q = interfaceC0093a0;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0095b0) {
                C0095b0 c0095b0 = (C0095b0) obj;
                if (!M5.g.a(c0095b0.getMessage(), getMessage()) || !M5.g.a(c0095b0.f3975q, this.f3975q) || !M5.g.a(c0095b0.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int i7;
        String message = getMessage();
        M5.g.c(message);
        int hashCode = (this.f3975q.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i7 = cause.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode + i7;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f3975q;
    }
}

package W5;

import java.util.concurrent.CancellationException;
/* renamed from: W5.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0108o {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4007a;

    /* renamed from: b  reason: collision with root package name */
    public final C0098e f4008b;

    /* renamed from: c  reason: collision with root package name */
    public final L5.l f4009c;
    public final Object d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f4010e;

    public C0108o(Object obj, C0098e c0098e, L5.l lVar, Object obj2, Throwable th) {
        this.f4007a = obj;
        this.f4008b = c0098e;
        this.f4009c = lVar;
        this.d = obj2;
        this.f4010e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0108o a(C0108o c0108o, C0098e c0098e, CancellationException cancellationException, int i7) {
        Object obj = c0108o.f4007a;
        if ((i7 & 2) != 0) {
            c0098e = c0108o.f4008b;
        }
        C0098e c0098e2 = c0098e;
        L5.l lVar = c0108o.f4009c;
        Object obj2 = c0108o.d;
        CancellationException cancellationException2 = cancellationException;
        if ((i7 & 16) != 0) {
            cancellationException2 = c0108o.f4010e;
        }
        c0108o.getClass();
        return new C0108o(obj, c0098e2, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0108o)) {
            return false;
        }
        C0108o c0108o = (C0108o) obj;
        if (M5.g.a(this.f4007a, c0108o.f4007a) && M5.g.a(this.f4008b, c0108o.f4008b) && M5.g.a(this.f4009c, c0108o.f4009c) && M5.g.a(this.d, c0108o.d) && M5.g.a(this.f4010e, c0108o.f4010e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i7 = 0;
        Object obj = this.f4007a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i8 = hashCode * 31;
        C0098e c0098e = this.f4008b;
        if (c0098e == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c0098e.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        L5.l lVar = this.f4009c;
        if (lVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = lVar.hashCode();
        }
        int i10 = (i9 + hashCode3) * 31;
        Object obj2 = this.d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i11 = (i10 + hashCode4) * 31;
        Throwable th = this.f4010e;
        if (th != null) {
            i7 = th.hashCode();
        }
        return i11 + i7;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f4007a + ", cancelHandler=" + this.f4008b + ", onCancellation=" + this.f4009c + ", idempotentResume=" + this.d + ", cancelCause=" + this.f4010e + ')';
    }

    public /* synthetic */ C0108o(Object obj, C0098e c0098e, L5.l lVar, CancellationException cancellationException, int i7) {
        this(obj, (i7 & 2) != 0 ? null : c0098e, (i7 & 4) != 0 ? null : lVar, (Object) null, (i7 & 16) != 0 ? null : cancellationException);
    }
}

package W5;

import java.util.concurrent.Future;
import z5.C1530l;
/* renamed from: W5.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098e implements n0, L5.l {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f3980q;

    /* renamed from: r  reason: collision with root package name */
    public final Object f3981r;

    public /* synthetic */ C0098e(int i7, Object obj) {
        this.f3980q = i7;
        this.f3981r = obj;
    }

    public final void a(Throwable th) {
        switch (this.f3980q) {
            case 0:
                if (th != null) {
                    ((Future) this.f3981r).cancel(false);
                    return;
                }
                return;
            case 1:
                ((I) this.f3981r).d();
                return;
            default:
                ((L5.l) this.f3981r).c(th);
                return;
        }
    }

    @Override // L5.l
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        switch (this.f3980q) {
            case 0:
                a((Throwable) obj);
                return C1530l.f16479a;
            case 1:
                a((Throwable) obj);
                return C1530l.f16479a;
            default:
                a((Throwable) obj);
                return C1530l.f16479a;
        }
    }

    public final String toString() {
        switch (this.f3980q) {
            case 0:
                return "CancelFutureOnCancel[" + ((Future) this.f3981r) + ']';
            case 1:
                return "DisposeOnCancel[" + ((I) this.f3981r) + ']';
            default:
                return "InvokeOnCancel[" + ((L5.l) this.f3981r).getClass().getSimpleName() + '@' + AbstractC0117y.j(this) + ']';
        }
    }
}

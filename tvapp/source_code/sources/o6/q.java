package o6;

import java.io.IOException;
/* loaded from: classes.dex */
public final class q extends k6.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ s f13035e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, s sVar, long j7) {
        super(str, true);
        this.f13035e = sVar;
        this.f = j7;
    }

    @Override // k6.a
    public final long a() {
        s sVar;
        boolean z7;
        synchronized (this.f13035e) {
            sVar = this.f13035e;
            long j7 = sVar.f13042D;
            long j8 = sVar.f13041C;
            if (j7 < j8) {
                z7 = true;
            } else {
                sVar.f13041C = j8 + 1;
                z7 = false;
            }
        }
        if (z7) {
            sVar.b(null);
            return -1L;
        }
        try {
            sVar.f13052O.n(1, 0, false);
        } catch (IOException e3) {
            sVar.b(e3);
        }
        return this.f;
    }
}

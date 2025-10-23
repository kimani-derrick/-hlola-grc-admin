package o6;

import java.io.IOException;
/* loaded from: classes.dex */
public final class r extends k6.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ s f13036e;
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ long f13037g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, s sVar, int i7, long j7) {
        super(str, true);
        this.f13036e = sVar;
        this.f = i7;
        this.f13037g = j7;
    }

    @Override // k6.a
    public final long a() {
        s sVar = this.f13036e;
        try {
            sVar.f13052O.y(this.f13037g, this.f);
            return -1L;
        } catch (IOException e3) {
            sVar.b(e3);
            return -1L;
        }
    }
}

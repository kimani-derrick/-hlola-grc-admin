package o6;

import java.io.IOException;
/* loaded from: classes.dex */
public final class k extends k6.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ s f13020e;
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f13021g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, s sVar, int i7, int i8) {
        super(str, true);
        this.f13020e = sVar;
        this.f = i7;
        this.f13021g = i8;
    }

    @Override // k6.a
    public final long a() {
        int i7 = this.f;
        int i8 = this.f13021g;
        s sVar = this.f13020e;
        sVar.getClass();
        try {
            sVar.f13052O.n(i7, i8, true);
            return -1L;
        } catch (IOException e3) {
            sVar.b(e3);
            return -1L;
        }
    }
}

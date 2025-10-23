package o6;

import java.io.IOException;
/* loaded from: classes.dex */
public final class j extends k6.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f13018e;
    public final /* synthetic */ s f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f13019g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, s sVar, Object obj, int i7) {
        super(str, true);
        this.f13018e = i7;
        this.f = sVar;
        this.f13019g = obj;
    }

    @Override // k6.a
    public final long a() {
        switch (this.f13018e) {
            case 0:
                s sVar = this.f;
                sVar.f13056r.a(sVar, (E) ((M5.o) this.f13019g).f2315q);
                return -1L;
            default:
                try {
                    this.f.f13056r.b((A) this.f13019g);
                } catch (IOException e3) {
                    p6.n nVar = p6.n.f13188a;
                    p6.n nVar2 = p6.n.f13188a;
                    String k5 = M5.g.k(this.f.f13058t, "Http2Connection.Listener failure for ");
                    nVar2.getClass();
                    p6.n.i(4, k5, e3);
                    try {
                        ((A) this.f13019g).c(EnumC1073b.f12986s, e3);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
        }
    }
}

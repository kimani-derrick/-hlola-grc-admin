package o6;

import java.io.IOException;
/* loaded from: classes.dex */
public final class p extends k6.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f13032e;
    public final /* synthetic */ s f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f13033g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ EnumC1073b f13034h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(String str, s sVar, int i7, EnumC1073b enumC1073b, int i8) {
        super(str, true);
        this.f13032e = i8;
        this.f = sVar;
        this.f13033g = i7;
        this.f13034h = enumC1073b;
    }

    @Override // k6.a
    public final long a() {
        switch (this.f13032e) {
            case 0:
                D d = this.f.f13040B;
                EnumC1073b enumC1073b = this.f13034h;
                d.getClass();
                M5.g.f(enumC1073b, "errorCode");
                synchronized (this.f) {
                    this.f.f13054Q.remove(Integer.valueOf(this.f13033g));
                }
                return -1L;
            default:
                s sVar = this.f;
                try {
                    int i7 = this.f13033g;
                    EnumC1073b enumC1073b2 = this.f13034h;
                    sVar.getClass();
                    M5.g.f(enumC1073b2, "statusCode");
                    sVar.f13052O.r(i7, enumC1073b2);
                    return -1L;
                } catch (IOException e3) {
                    sVar.b(e3);
                    return -1L;
                }
        }
    }
}

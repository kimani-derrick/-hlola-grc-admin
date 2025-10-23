package o6;

import java.io.IOException;
import v6.C1341f;
/* loaded from: classes.dex */
public final class n extends k6.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ s f13026e;
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C1341f f13027g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f13028h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, s sVar, int i7, C1341f c1341f, int i8, boolean z7) {
        super(str, true);
        this.f13026e = sVar;
        this.f = i7;
        this.f13027g = c1341f;
        this.f13028h = i8;
    }

    @Override // k6.a
    public final long a() {
        try {
            D d = this.f13026e.f13040B;
            C1341f c1341f = this.f13027g;
            int i7 = this.f13028h;
            d.getClass();
            M5.g.f(c1341f, "source");
            c1341f.p(i7);
            this.f13026e.f13052O.r(this.f, EnumC1073b.f12990w);
            synchronized (this.f13026e) {
                this.f13026e.f13054Q.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}

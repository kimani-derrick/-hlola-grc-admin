package o6;

import java.io.IOException;
import java.util.List;
/* loaded from: classes.dex */
public final class o extends k6.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f13029e = 1;
    public final /* synthetic */ s f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f13030g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ List f13031h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, s sVar, int i7, List list) {
        super(str, true);
        this.f = sVar;
        this.f13030g = i7;
        this.f13031h = list;
    }

    private final long b() {
        D d = this.f.f13040B;
        List list = this.f13031h;
        d.getClass();
        M5.g.f(list, "responseHeaders");
        try {
            this.f.f13052O.r(this.f13030g, EnumC1073b.f12990w);
            synchronized (this.f) {
                this.f.f13054Q.remove(Integer.valueOf(this.f13030g));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }

    @Override // k6.a
    public final long a() {
        switch (this.f13029e) {
            case 0:
                return b();
            default:
                D d = this.f.f13040B;
                List list = this.f13031h;
                d.getClass();
                M5.g.f(list, "requestHeaders");
                try {
                    this.f.f13052O.r(this.f13030g, EnumC1073b.f12990w);
                    synchronized (this.f) {
                        this.f.f13054Q.remove(Integer.valueOf(this.f13030g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, s sVar, int i7, List list, boolean z7) {
        super(str, true);
        this.f = sVar;
        this.f13030g = i7;
        this.f13031h = list;
    }
}

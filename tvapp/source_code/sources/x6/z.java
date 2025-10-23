package x6;

import java.util.Objects;
/* loaded from: classes.dex */
public final class z extends V {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f16343b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16344c;
    public final InterfaceC1480m d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f16345e;

    public z(int i7, String str, boolean z7) {
        this.f16343b = i7;
        switch (i7) {
            case 1:
                C1468a c1468a = C1468a.f16299r;
                Objects.requireNonNull(str, "name == null");
                this.f16344c = str;
                this.d = c1468a;
                this.f16345e = z7;
                return;
            default:
                C1468a c1468a2 = C1468a.f16299r;
                Objects.requireNonNull(str, "name == null");
                this.f16344c = str;
                this.d = c1468a2;
                this.f16345e = z7;
                return;
        }
    }

    @Override // x6.V
    public final void a(K k5, Object obj) {
        String str;
        String str2;
        switch (this.f16343b) {
            case 0:
                if (obj != null && (str = (String) this.d.o(obj)) != null) {
                    k5.a(this.f16344c, str, this.f16345e);
                    return;
                }
                return;
            default:
                if (obj != null && (str2 = (String) this.d.o(obj)) != null) {
                    k5.d(this.f16344c, str2, this.f16345e);
                    return;
                }
                return;
        }
    }
}

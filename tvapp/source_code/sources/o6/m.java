package o6;

import java.io.IOException;
import z5.C1530l;
/* loaded from: classes.dex */
public final class m implements L5.a {

    /* renamed from: q  reason: collision with root package name */
    public final w f13024q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ s f13025r;

    public m(s sVar, w wVar) {
        M5.g.f(sVar, "this$0");
        this.f13025r = sVar;
        this.f13024q = wVar;
    }

    @Override // L5.a
    public final Object b() {
        EnumC1073b enumC1073b;
        s sVar = this.f13025r;
        w wVar = this.f13024q;
        EnumC1073b enumC1073b2 = EnumC1073b.f12987t;
        IOException e3 = null;
        try {
            wVar.b(this);
            while (wVar.a(false, this)) {
            }
            enumC1073b = EnumC1073b.f12985r;
            try {
                try {
                    sVar.a(enumC1073b, EnumC1073b.f12990w, null);
                } catch (IOException e7) {
                    e3 = e7;
                    EnumC1073b enumC1073b3 = EnumC1073b.f12986s;
                    sVar.a(enumC1073b3, enumC1073b3, e3);
                    i6.b.d(wVar);
                    return C1530l.f16479a;
                }
            } catch (Throwable th) {
                th = th;
                sVar.a(enumC1073b, enumC1073b2, e3);
                i6.b.d(wVar);
                throw th;
            }
        } catch (IOException e8) {
            e3 = e8;
            enumC1073b = enumC1073b2;
        } catch (Throwable th2) {
            th = th2;
            enumC1073b = enumC1073b2;
            sVar.a(enumC1073b, enumC1073b2, e3);
            i6.b.d(wVar);
            throw th;
        }
        i6.b.d(wVar);
        return C1530l.f16479a;
    }
}

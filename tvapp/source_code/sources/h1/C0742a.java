package h1;

import com.boxhdo.android.tv.App;
import t3.C1251o;
import t3.InterfaceC1239c;
import z5.C1528j;
/* renamed from: h1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0742a implements InterfaceC1239c {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f10865q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ App f10866r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ U4.f f10867s;

    public /* synthetic */ C0742a(App app, U4.f fVar, int i7) {
        this.f10865q = i7;
        this.f10866r = app;
        this.f10867s = fVar;
    }

    @Override // t3.InterfaceC1239c
    public final void a(C1251o c1251o) {
        U4.f fVar = this.f10867s;
        App app = this.f10866r;
        switch (this.f10865q) {
            case 0:
                int i7 = App.f7769u;
                M5.g.f(app, "this$0");
                M5.g.f(fVar, "$remoteConfig");
                M5.g.f(c1251o, "it");
                if (c1251o.i()) {
                    L1.h hVar = app.f7773t;
                    if (hVar != null) {
                        C1528j a7 = hVar.a(new C1528j("", "", ""), false);
                        L1.h hVar2 = app.f7773t;
                        if (hVar2 != null) {
                            hVar2.a(new C1528j(fVar.b((String) a7.f16475q), fVar.b((String) a7.f16476r), fVar.b((String) a7.f16477s)), true);
                            return;
                        } else {
                            M5.g.l("f");
                            throw null;
                        }
                    }
                    M5.g.l("f");
                    throw null;
                }
                return;
            default:
                M5.g.f(app, "this$0");
                M5.g.f(fVar, "$remoteConfig");
                M5.g.f(c1251o, "it");
                if (c1251o.i()) {
                    L1.h hVar3 = app.f7773t;
                    if (hVar3 != null) {
                        C1528j a8 = hVar3.a(new C1528j("", "", ""), false);
                        L1.h hVar4 = app.f7773t;
                        if (hVar4 != null) {
                            hVar4.a(new C1528j(fVar.b((String) a8.f16475q), fVar.b((String) a8.f16476r), fVar.b((String) a8.f16477s)), true);
                            return;
                        } else {
                            M5.g.l("f");
                            throw null;
                        }
                    }
                    M5.g.l("f");
                    throw null;
                }
                return;
        }
    }
}

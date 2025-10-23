package L4;

import android.content.Context;
import o4.C1069a;
/* loaded from: classes.dex */
public final /* synthetic */ class c implements M4.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2133a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2134b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2135c;

    public /* synthetic */ c(h4.f fVar, Context context) {
        this.f2133a = 1;
        this.f2135c = fVar;
        this.f2134b = context;
    }

    @Override // M4.b
    public final Object get() {
        switch (this.f2133a) {
            case 0:
                return new i((Context) this.f2134b, (String) this.f2135c);
            case 1:
                h4.f fVar = (h4.f) this.f2135c;
                String d = fVar.d();
                K4.a aVar = (K4.a) fVar.d.c(K4.a.class);
                return new R4.a((Context) this.f2134b, d);
            default:
                o4.d dVar = (o4.d) this.f2134b;
                dVar.getClass();
                C1069a c1069a = (C1069a) this.f2135c;
                return c1069a.f.h(new H.e(c1069a, dVar));
        }
    }

    public /* synthetic */ c(Object obj, int i7, Object obj2) {
        this.f2133a = i7;
        this.f2134b = obj;
        this.f2135c = obj2;
    }
}

package f1;

import W5.InterfaceC0116x;
import java.util.LinkedHashMap;
import k3.AbstractC0958a;
import w4.l0;
import z5.C1524f;
import z5.C1530l;
/* renamed from: f1.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0690r extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f10306u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f10307v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f10308w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ C0694v f10309x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f10310y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f10311z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0690r(int i7, int i8, C0694v c0694v, String str, String str2, D5.d dVar) {
        super(2, dVar);
        this.f10307v = i7;
        this.f10308w = i8;
        this.f10309x = c0694v;
        this.f10310y = str;
        this.f10311z = str2;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0690r(this.f10307v, this.f10308w, this.f10309x, this.f10310y, this.f10311z, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0690r) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f10306u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            LinkedHashMap K6 = A5.w.K(new C1524f("page", String.valueOf(this.f10307v)), new C1524f("limit", String.valueOf(this.f10308w)));
            C0694v c0694v = this.f10309x;
            this.f10306u = 1;
            obj = c0694v.f10322a.b().g(l0.s(c0694v.f10323b) + g6.o.f10858a.T() + this.f10310y + "/" + this.f10311z, K6, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return new Y0.b(obj);
    }
}

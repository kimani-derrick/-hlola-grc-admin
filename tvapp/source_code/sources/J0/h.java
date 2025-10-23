package J0;

import L5.p;
import N0.k;
import W5.InterfaceC0116x;
import android.graphics.Bitmap;
import java.util.ArrayList;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class h extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public int f1291u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ S0.g f1292v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ j f1293w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ T0.f f1294x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ c f1295y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Bitmap f1296z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(S0.g gVar, j jVar, T0.f fVar, c cVar, Bitmap bitmap, D5.d dVar) {
        super(2, dVar);
        this.f1292v = gVar;
        this.f1293w = jVar;
        this.f1294x = fVar;
        this.f1295y = cVar;
        this.f1296z = bitmap;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new h(this.f1292v, this.f1293w, this.f1294x, this.f1295y, this.f1296z, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((h) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        boolean z7;
        E5.a aVar = E5.a.f612q;
        int i7 = this.f1291u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            ArrayList arrayList = this.f1293w.f;
            if (this.f1296z != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            T0.f fVar = this.f1294x;
            c cVar = this.f1295y;
            S0.g gVar = this.f1292v;
            k kVar = new k(gVar, arrayList, 0, gVar, fVar, cVar, z7);
            this.f1291u = 1;
            obj = kVar.b(gVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}

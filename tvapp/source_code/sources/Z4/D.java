package Z4;

import W5.InterfaceC0116x;
import android.content.Context;
import android.util.Log;
import java.io.IOException;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class D extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f4746u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ E f4747v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f4748w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(E e3, String str, D5.d dVar) {
        super(2, dVar);
        this.f4747v = e3;
        this.f4748w = str;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new D(this.f4747v, this.f4748w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((D) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f4746u;
        try {
            if (i7 != 0) {
                if (i7 == 1) {
                    AbstractC0958a.H(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC0958a.H(obj);
                C0186x c0186x = E.f4749e;
                Context context = this.f4747v.f4750a;
                c0186x.getClass();
                T4.c a7 = E.f.a(context, C0186x.f4873a[0]);
                C c5 = new C(this.f4748w, null);
                this.f4746u = 1;
                if (a7.F(new Y.f(c5, null), this) == aVar) {
                    return aVar;
                }
            }
        } catch (IOException e3) {
            Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e3);
        }
        return C1530l.f16479a;
    }
}

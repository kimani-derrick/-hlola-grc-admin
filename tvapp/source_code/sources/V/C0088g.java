package V;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.Iterator;
import java.util.List;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: V.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0088g extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public Iterator f3548u;

    /* renamed from: v  reason: collision with root package name */
    public Object f3549v;

    /* renamed from: w  reason: collision with root package name */
    public int f3550w;

    /* renamed from: x  reason: collision with root package name */
    public /* synthetic */ Object f3551x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ List f3552y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f3553z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0088g(List list, List list2, D5.d dVar) {
        super(2, dVar);
        this.f3552y = list;
        this.f3553z = list2;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        C0088g c0088g = new C0088g(this.f3552y, this.f3553z, dVar);
        c0088g.f3551x = obj;
        return c0088g;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0088g) h((D5.d) obj2, obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        Iterator it;
        List list;
        int i7 = this.f3550w;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    it = this.f3548u;
                    list = (List) this.f3551x;
                    AbstractC0958a.H(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Object obj2 = this.f3549v;
                Iterator it2 = this.f3548u;
                List list2 = (List) this.f3551x;
                AbstractC0958a.H(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj = obj2;
                    it = it2;
                    list = list2;
                } else {
                    list2.add(new F5.i(1, null));
                    this.f3551x = list2;
                    this.f3548u = it2;
                    this.f3549v = null;
                    this.f3550w = 2;
                    throw null;
                }
            }
        } else {
            AbstractC0958a.H(obj);
            obj = this.f3551x;
            it = this.f3552y.iterator();
            list = this.f3553z;
        }
        if (!it.hasNext()) {
            return obj;
        }
        AbstractC0515y1.v(it.next());
        this.f3551x = list;
        this.f3548u = it;
        this.f3549v = obj;
        this.f3550w = 1;
        throw null;
    }
}

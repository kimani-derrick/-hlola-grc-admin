package e1;

import W5.InterfaceC0116x;
import h6.B;
import h6.G;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: e1.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0582p extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public e6.a f9405u;

    /* renamed from: v  reason: collision with root package name */
    public Object f9406v;

    /* renamed from: w  reason: collision with root package name */
    public G f9407w;

    /* renamed from: x  reason: collision with root package name */
    public int f9408x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ C0583q f9409y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ G f9410z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0582p(C0583q c0583q, G g7, D5.d dVar) {
        super(2, dVar);
        this.f9409y = c0583q;
        this.f9410z = g7;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0582p(this.f9409y, this.f9410z, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0582p) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [e6.a] */
    @Override // F5.a
    public final Object p(Object obj) {
        C0583q c0583q;
        e6.d dVar;
        G g7;
        Object obj2;
        Throwable th;
        G g8;
        E5.a aVar = E5.a.f612q;
        int i7 = this.f9408x;
        try {
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        g8 = (G) this.f9406v;
                        obj2 = this.f9405u;
                        try {
                            AbstractC0958a.H(obj);
                            H.e b7 = g8.f11095q.b();
                            b7.z("Authorization", (String) obj);
                            B q5 = b7.q();
                            ((e6.d) obj2).e(null);
                            return q5;
                        } catch (Throwable th2) {
                            th = th2;
                            ((e6.d) obj2).e(null);
                            throw th;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g7 = this.f9407w;
                c0583q = (C0583q) this.f9406v;
                ?? r62 = this.f9405u;
                AbstractC0958a.H(obj);
                dVar = r62;
            } else {
                AbstractC0958a.H(obj);
                c0583q = this.f9409y;
                dVar = c0583q.f9412r;
                this.f9405u = dVar;
                this.f9406v = c0583q;
                g7 = this.f9410z;
                this.f9407w = g7;
                this.f9408x = 1;
                if (dVar.d(this) == aVar) {
                    return aVar;
                }
            }
            this.f9405u = dVar;
            this.f9406v = g7;
            this.f9407w = null;
            this.f9408x = 2;
            Object b8 = ((C0580n) c0583q.f9411q.get()).b(true, this);
            if (b8 == aVar) {
                return aVar;
            }
            g8 = g7;
            obj2 = dVar;
            obj = b8;
            H.e b72 = g8.f11095q.b();
            b72.z("Authorization", (String) obj);
            B q52 = b72.q();
            ((e6.d) obj2).e(null);
            return q52;
        } catch (Throwable th3) {
            obj2 = dVar;
            th = th3;
            ((e6.d) obj2).e(null);
            throw th;
        }
    }
}

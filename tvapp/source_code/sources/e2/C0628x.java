package e2;

import f2.C0695a;
/* renamed from: e2.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0628x implements Z2.m {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f10086q = 0;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ a3.z f10087r;

    public /* synthetic */ C0628x(a3.z zVar) {
        this.f10087r = zVar;
    }

    @Override // Z2.m
    public final void c(Object obj) {
        switch (this.f10086q) {
            case 0:
                ((t0) obj).z(this.f10087r);
                return;
            default:
                f2.k kVar = (f2.k) obj;
                C.d dVar = kVar.f10381o;
                a3.z zVar = this.f10087r;
                if (dVar != null) {
                    K k5 = (K) dVar.f325s;
                    if (k5.f9660H == -1) {
                        C0593J a7 = k5.a();
                        a7.f9609p = zVar.f5138q;
                        a7.f9610q = zVar.f5139r;
                        kVar.f10381o = new C.d(new K(a7), dVar.f324r, (String) dVar.f326t, 6);
                    }
                }
                int i7 = zVar.f5138q;
                return;
        }
    }

    public /* synthetic */ C0628x(C0695a c0695a, a3.z zVar) {
        this.f10087r = zVar;
    }
}

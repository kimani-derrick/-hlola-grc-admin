package h6;

import v6.C1344i;
import v6.InterfaceC1342g;
/* loaded from: classes.dex */
public final class C extends E {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11074a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final v f11075b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f11076c;

    public C(v vVar, C1344i c1344i) {
        this.f11075b = vVar;
        this.f11076c = c1344i;
    }

    @Override // h6.E
    public final long a() {
        switch (this.f11074a) {
            case 0:
                return ((C1344i) this.f11076c).d();
            default:
                return ((E) this.f11076c).a();
        }
    }

    @Override // h6.E
    public final v b() {
        switch (this.f11074a) {
            case 0:
                return this.f11075b;
            default:
                return this.f11075b;
        }
    }

    @Override // h6.E
    public final void c(InterfaceC1342g interfaceC1342g) {
        switch (this.f11074a) {
            case 0:
                interfaceC1342g.i((C1344i) this.f11076c);
                return;
            default:
                ((E) this.f11076c).c(interfaceC1342g);
                return;
        }
    }

    public C(E e3, v vVar) {
        this.f11076c = e3;
        this.f11075b = vVar;
    }
}

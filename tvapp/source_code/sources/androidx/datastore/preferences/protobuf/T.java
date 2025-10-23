package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public final class T implements InterfaceC0223b0 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0220a f5728a;

    /* renamed from: b  reason: collision with root package name */
    public final k0 f5729b;

    /* renamed from: c  reason: collision with root package name */
    public final C0236o f5730c;

    public T(k0 k0Var, C0236o c0236o, AbstractC0220a abstractC0220a) {
        this.f5729b = k0Var;
        c0236o.getClass();
        this.f5730c = c0236o;
        this.f5728a = abstractC0220a;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0223b0
    public final boolean a(Object obj) {
        this.f5730c.getClass();
        AbstractC0515y1.v(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0223b0
    public final void b(Object obj, Object obj2) {
        c0.B(this.f5729b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0223b0
    public final boolean c(Object obj, Object obj2) {
        k0 k0Var = this.f5729b;
        k0Var.getClass();
        j0 j0Var = ((AbstractC0243w) obj).unknownFields;
        k0Var.getClass();
        if (!j0Var.equals(((AbstractC0243w) obj2).unknownFields)) {
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0223b0
    public final int d(Object obj) {
        this.f5729b.getClass();
        j0 j0Var = ((AbstractC0243w) obj).unknownFields;
        int i7 = j0Var.d;
        if (i7 == -1) {
            int i8 = 0;
            for (int i9 = 0; i9 < j0Var.f5787a; i9++) {
                i8 += C0232k.t(3, (C0228g) j0Var.f5789c[i9]) + C0232k.L(2, j0Var.f5788b[i9] >>> 3) + (C0232k.K(1) * 2);
            }
            j0Var.d = i8;
            return i8;
        }
        return i7;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0223b0
    public final Object e() {
        return ((AbstractC0241u) ((AbstractC0243w) this.f5728a).d(5)).c();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0223b0
    public final void f(Object obj) {
        this.f5729b.getClass();
        ((AbstractC0243w) obj).unknownFields.f5790e = false;
        this.f5730c.getClass();
        AbstractC0515y1.v(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0223b0
    public final int g(Object obj) {
        this.f5729b.getClass();
        return ((AbstractC0243w) obj).unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0223b0
    public final void h(Object obj, C0230i c0230i, C0235n c0235n) {
        this.f5729b.getClass();
        AbstractC0243w abstractC0243w = (AbstractC0243w) obj;
        if (abstractC0243w.unknownFields == j0.f) {
            abstractC0243w.unknownFields = j0.b();
        }
        this.f5730c.getClass();
        AbstractC0515y1.v(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0223b0
    public final void i(Object obj, K k5) {
        this.f5730c.getClass();
        AbstractC0515y1.v(obj);
        throw null;
    }
}

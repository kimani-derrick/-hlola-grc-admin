package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.C0230i;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.android.gms.internal.measurement.Z1;
/* loaded from: classes.dex */
public final class T implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0523a f9089a;

    /* renamed from: b  reason: collision with root package name */
    public final f0 f9090b;

    /* renamed from: c  reason: collision with root package name */
    public final C0537o f9091c;

    public T(f0 f0Var, C0537o c0537o, AbstractC0523a abstractC0523a) {
        this.f9090b = f0Var;
        c0537o.getClass();
        this.f9091c = c0537o;
        this.f9089a = abstractC0523a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final boolean a(Object obj) {
        this.f9091c.getClass();
        AbstractC0515y1.v(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final void b(Object obj, Object obj2) {
        c0.B(this.f9090b, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final boolean c(Object obj, Object obj2) {
        f0 f0Var = this.f9090b;
        f0Var.getClass();
        e0 e0Var = ((AbstractC0543v) obj).unknownFields;
        f0Var.getClass();
        if (!e0Var.equals(((AbstractC0543v) obj2).unknownFields)) {
            return false;
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final int d(Object obj) {
        this.f9090b.getClass();
        e0 e0Var = ((AbstractC0543v) obj).unknownFields;
        int i7 = e0Var.d;
        if (i7 == -1) {
            int i8 = 0;
            for (int i9 = 0; i9 < e0Var.f9110a; i9++) {
                i8 += C0533k.K(3, (AbstractC0530h) e0Var.f9112c[i9]) + C0533k.c0(2, e0Var.f9111b[i9] >>> 3) + (C0533k.b0(1) * 2);
            }
            e0Var.d = i8;
            return i8;
        }
        return i7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object e() {
        AbstractC0523a abstractC0523a = this.f9089a;
        return abstractC0523a instanceof AbstractC0543v ? ((AbstractC0543v) abstractC0523a).t() : abstractC0523a.d().d();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final void f(Object obj) {
        this.f9090b.getClass();
        f0.b(obj);
        this.f9091c.getClass();
        AbstractC0515y1.v(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final int g(Object obj) {
        this.f9090b.getClass();
        return ((AbstractC0543v) obj).unknownFields.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final void h(Object obj, K k5) {
        this.f9091c.getClass();
        AbstractC0515y1.v(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final void i(Object obj, byte[] bArr, int i7, int i8, Z1 z12) {
        AbstractC0543v abstractC0543v = (AbstractC0543v) obj;
        if (abstractC0543v.unknownFields == e0.f) {
            abstractC0543v.unknownFields = e0.c();
        }
        AbstractC0515y1.v(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final void j(Object obj, C0230i c0230i, C0536n c0536n) {
        this.f9090b.getClass();
        f0.a(obj);
        this.f9091c.getClass();
        AbstractC0515y1.v(obj);
        throw null;
    }
}

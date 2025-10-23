package v2;

import k2.C0943h;
import k2.InterfaceC0946k;
import k2.InterfaceC0947l;
import k2.InterfaceC0948m;
import k2.w;
import k3.AbstractC0958a;
/* renamed from: v2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1320d implements InterfaceC0946k {

    /* renamed from: a  reason: collision with root package name */
    public InterfaceC0948m f15303a;

    /* renamed from: b  reason: collision with root package name */
    public w f15304b;

    /* renamed from: c  reason: collision with root package name */
    public int f15305c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public InterfaceC1318b f15306e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public long f15307g;

    /* JADX WARN: Removed duplicated region for block: B:62:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019e  */
    /* JADX WARN: Type inference failed for: r6v10, types: [s2.e, java.lang.Object] */
    @Override // k2.InterfaceC0946k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(k2.InterfaceC0947l r21, U4.k r22) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.C1320d.d(k2.l, U4.k):int");
    }

    @Override // k2.InterfaceC0946k
    public final void e(InterfaceC0948m interfaceC0948m) {
        this.f15303a = interfaceC0948m;
        this.f15304b = interfaceC0948m.q(0, 1);
        interfaceC0948m.l();
    }

    @Override // k2.InterfaceC0946k
    public final void h(long j7, long j8) {
        int i7;
        if (j7 == 0) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        this.f15305c = i7;
        InterfaceC1318b interfaceC1318b = this.f15306e;
        if (interfaceC1318b != null) {
            interfaceC1318b.b(j8);
        }
    }

    @Override // k2.InterfaceC0946k
    public final boolean j(InterfaceC0947l interfaceC0947l) {
        return AbstractC0958a.f((C0943h) interfaceC0947l);
    }

    @Override // k2.InterfaceC0946k
    public final void a() {
    }
}

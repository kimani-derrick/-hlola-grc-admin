package x6;

import z5.C1530l;
/* renamed from: x6.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1485s extends M5.h implements L5.l {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f16324r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ InterfaceC1470c f16325s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1485s(InterfaceC1470c interfaceC1470c, int i7) {
        super(1);
        this.f16324r = i7;
        this.f16325s = interfaceC1470c;
    }

    @Override // L5.l
    public final Object c(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.f16324r) {
            case 0:
                this.f16325s.cancel();
                return C1530l.f16479a;
            default:
                this.f16325s.cancel();
                return C1530l.f16479a;
        }
    }
}

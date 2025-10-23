package f1;

import W5.InterfaceC0116x;
import z5.C1530l;
/* renamed from: f1.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0667H extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f10223u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0669J f10224v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f10225w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0667H(C0669J c0669j, boolean z7, D5.d dVar) {
        super(2, dVar);
        this.f10224v = c0669j;
        this.f10225w = z7;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0667H(this.f10224v, this.f10225w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0667H) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
        if ((r11 instanceof z5.C1525g) != false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9 A[RETURN] */
    @Override // F5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.C0667H.p(java.lang.Object):java.lang.Object");
    }
}

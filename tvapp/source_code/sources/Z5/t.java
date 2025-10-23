package Z5;

import W5.C0100g;
/* loaded from: classes.dex */
public final class t extends a6.d {

    /* renamed from: a  reason: collision with root package name */
    public long f4941a;

    /* renamed from: b  reason: collision with root package name */
    public C0100g f4942b;

    @Override // a6.d
    public final boolean a(a6.b bVar) {
        r rVar = (r) bVar;
        if (this.f4941a >= 0) {
            return false;
        }
        long j7 = rVar.f4935x;
        if (j7 < rVar.f4936y) {
            rVar.f4936y = j7;
        }
        this.f4941a = j7;
        return true;
    }

    @Override // a6.d
    public final D5.d[] b(a6.b bVar) {
        long j7 = this.f4941a;
        this.f4941a = -1L;
        this.f4942b = null;
        return ((r) bVar).s(j7);
    }
}

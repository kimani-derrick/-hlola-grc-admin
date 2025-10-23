package u;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public m f14631a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f14632b;

    public static long a(f fVar, long j7) {
        m mVar = fVar.d;
        if (mVar instanceof i) {
            return j7;
        }
        ArrayList arrayList = fVar.f14627k;
        int size = arrayList.size();
        long j8 = j7;
        for (int i7 = 0; i7 < size; i7++) {
            d dVar = (d) arrayList.get(i7);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.d != mVar) {
                    j8 = Math.min(j8, a(fVar2, fVar2.f + j7));
                }
            }
        }
        if (fVar == mVar.f14641i) {
            long j9 = mVar.j();
            f fVar3 = mVar.f14640h;
            long j10 = j7 - j9;
            return Math.min(Math.min(j8, a(fVar3, j10)), j10 - fVar3.f);
        }
        return j8;
    }

    public static long b(f fVar, long j7) {
        m mVar = fVar.d;
        if (mVar instanceof i) {
            return j7;
        }
        ArrayList arrayList = fVar.f14627k;
        int size = arrayList.size();
        long j8 = j7;
        for (int i7 = 0; i7 < size; i7++) {
            d dVar = (d) arrayList.get(i7);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.d != mVar) {
                    j8 = Math.max(j8, b(fVar2, fVar2.f + j7));
                }
            }
        }
        if (fVar == mVar.f14640h) {
            long j9 = mVar.j();
            f fVar3 = mVar.f14641i;
            long j10 = j7 + j9;
            return Math.max(Math.max(j8, b(fVar3, j10)), j10 - fVar3.f);
        }
        return j8;
    }
}

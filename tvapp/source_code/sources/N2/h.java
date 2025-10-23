package N2;

import M2.l;
/* loaded from: classes.dex */
public final class h extends l implements Comparable {

    /* renamed from: A  reason: collision with root package name */
    public long f2484A;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        if (d(4) != hVar.d(4)) {
            if (!d(4)) {
                return -1;
            }
        } else {
            long j7 = this.f11353v - hVar.f11353v;
            if (j7 == 0) {
                j7 = this.f2484A - hVar.f2484A;
                if (j7 == 0) {
                    return 0;
                }
            }
            if (j7 <= 0) {
                return -1;
            }
        }
        return 1;
    }
}

package O3;

import java.util.Objects;
/* loaded from: classes.dex */
public final class G extends AbstractC0080y {
    @Override // O3.AbstractC0080y
    public final /* bridge */ /* synthetic */ AbstractC0080y c(Object obj) {
        h(obj);
        return this;
    }

    public final void h(Object obj) {
        obj.getClass();
        a(obj);
    }

    public final H i() {
        int i7 = this.f2714b;
        if (i7 != 0) {
            if (i7 != 1) {
                H r3 = H.r(i7, this.f2713a);
                this.f2714b = r3.size();
                this.f2715c = true;
                return r3;
            }
            Object obj = this.f2713a[0];
            Objects.requireNonNull(obj);
            int i8 = H.f2601s;
            return new h0(obj);
        }
        int i9 = H.f2601s;
        return a0.f2647z;
    }
}

package g3;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.F;
import o3.AbstractC1068b;
/* loaded from: classes.dex */
public final class k extends F implements m {
    public final boolean D() {
        boolean z7;
        Parcel z8 = z(A(), 7);
        int i7 = AbstractC1068b.f12916a;
        if (z8.readInt() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        z8.recycle();
        return z7;
    }
}

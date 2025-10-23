package m3;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.F;
import l3.BinderC0971b;
import l3.InterfaceC0970a;
import o3.AbstractC1068b;
/* loaded from: classes.dex */
public final class l extends F {
    public final InterfaceC0970a D(BinderC0971b binderC0971b, String str, int i7, BinderC0971b binderC0971b2) {
        Parcel A6 = A();
        AbstractC1068b.c(A6, binderC0971b);
        A6.writeString(str);
        A6.writeInt(i7);
        AbstractC1068b.c(A6, binderC0971b2);
        Parcel z7 = z(A6, 2);
        InterfaceC0970a z8 = BinderC0971b.z(z7.readStrongBinder());
        z7.recycle();
        return z8;
    }

    public final InterfaceC0970a E(BinderC0971b binderC0971b, String str, int i7, BinderC0971b binderC0971b2) {
        Parcel A6 = A();
        AbstractC1068b.c(A6, binderC0971b);
        A6.writeString(str);
        A6.writeInt(i7);
        AbstractC1068b.c(A6, binderC0971b2);
        Parcel z7 = z(A6, 3);
        InterfaceC0970a z8 = BinderC0971b.z(z7.readStrongBinder());
        z7.recycle();
        return z8;
    }
}

package x0;

import android.os.IBinder;
import android.os.Parcel;
/* renamed from: x0.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1451g implements InterfaceC1452h {
    public IBinder d;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.d;
    }

    @Override // x0.InterfaceC1452h
    public final void r(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC1452h.f16160b);
            obtain.writeStringArray(strArr);
            this.d.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}

package n3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: n3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1033b implements InterfaceC1035d, IInterface {
    public final IBinder d;

    public C1033b(IBinder iBinder) {
        this.d = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.d;
    }

    public final Parcel y(Parcel parcel, int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.d.transact(i7, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e3) {
                obtain.recycle();
                throw e3;
            }
        } finally {
            parcel.recycle();
        }
    }
}

package o3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: o3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1067a extends Binder implements IInterface {
    public AbstractBinderC1067a(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 > 16777215) {
            if (super.onTransact(i7, parcel, parcel2, i8)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return y(i7, parcel, parcel2);
    }

    public boolean y(int i7, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

package b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class c extends Binder implements b {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f6991e = 0;
    public final /* synthetic */ d d;

    public c(d dVar) {
        this.d = dVar;
        attachInterface(this, b.f6990a);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        Object obj;
        String str = b.f6990a;
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i7 == 1598968902) {
            parcel2.writeString(str);
            return true;
        } else if (i7 != 1) {
            return super.onTransact(i7, parcel, parcel2, i8);
        } else {
            int readInt = parcel.readInt();
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            d dVar = this.d;
            dVar.getClass();
            dVar.a(readInt, (Bundle) obj);
            return true;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

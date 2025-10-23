package o3;

import android.os.BadParcelableException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* renamed from: o3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1068b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f12916a = 0;

    static {
        AbstractC1068b.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        throw new BadParcelableException(AbstractC0515y1.l("Parcel data not fully consumed, unread size: ", dataAvail));
    }

    public static void c(Parcel parcel, IInterface iInterface) {
        IBinder asBinder;
        if (iInterface == null) {
            asBinder = null;
        } else {
            asBinder = iInterface.asBinder();
        }
        parcel.writeStrongBinder(asBinder);
    }
}

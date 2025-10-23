package x0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
/* renamed from: x0.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1456l extends Binder implements InterfaceC1453i {
    public final /* synthetic */ MultiInstanceInvalidationService d;

    public BinderC1456l(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.d = multiInstanceInvalidationService;
        attachInterface(this, InterfaceC1453i.f16161c);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [x0.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [x0.g, java.lang.Object] */
    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        String str = InterfaceC1453i.f16161c;
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i7 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        InterfaceC1452h interfaceC1452h = null;
        InterfaceC1452h interfaceC1452h2 = null;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return super.onTransact(i7, parcel, parcel2, i8);
                }
                y(parcel.readInt(), parcel.createStringArray());
            } else {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(InterfaceC1452h.f16160b);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC1452h)) {
                        interfaceC1452h2 = (InterfaceC1452h) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.d = readStrongBinder;
                        interfaceC1452h2 = obj;
                    }
                }
                int readInt = parcel.readInt();
                M5.g.f(interfaceC1452h2, "callback");
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.d;
                synchronized (multiInstanceInvalidationService.f6986s) {
                    multiInstanceInvalidationService.f6986s.unregister(interfaceC1452h2);
                    String str2 = (String) multiInstanceInvalidationService.f6985r.remove(Integer.valueOf(readInt));
                }
                parcel2.writeNoException();
            }
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(InterfaceC1452h.f16160b);
                if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof InterfaceC1452h)) {
                    interfaceC1452h = (InterfaceC1452h) queryLocalInterface2;
                } else {
                    ?? obj2 = new Object();
                    obj2.d = readStrongBinder2;
                    interfaceC1452h = obj2;
                }
            }
            int z7 = z(interfaceC1452h, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(z7);
        }
        return true;
    }

    public final void y(int i7, String[] strArr) {
        M5.g.f(strArr, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.d;
        synchronized (multiInstanceInvalidationService.f6986s) {
            String str = (String) multiInstanceInvalidationService.f6985r.get(Integer.valueOf(i7));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.f6986s.beginBroadcast();
            for (int i8 = 0; i8 < beginBroadcast; i8++) {
                Object broadcastCookie = multiInstanceInvalidationService.f6986s.getBroadcastCookie(i8);
                M5.g.d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                Integer num = (Integer) broadcastCookie;
                int intValue = num.intValue();
                String str2 = (String) multiInstanceInvalidationService.f6985r.get(num);
                if (i7 != intValue && M5.g.a(str, str2)) {
                    try {
                        ((InterfaceC1452h) multiInstanceInvalidationService.f6986s.getBroadcastItem(i8)).r(strArr);
                    } catch (RemoteException e3) {
                        Log.w("ROOM", "Error invoking a remote callback", e3);
                    }
                }
            }
            multiInstanceInvalidationService.f6986s.finishBroadcast();
        }
    }

    public final int z(InterfaceC1452h interfaceC1452h, String str) {
        M5.g.f(interfaceC1452h, "callback");
        int i7 = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.d;
        synchronized (multiInstanceInvalidationService.f6986s) {
            try {
                int i8 = multiInstanceInvalidationService.f6984q + 1;
                multiInstanceInvalidationService.f6984q = i8;
                if (multiInstanceInvalidationService.f6986s.register(interfaceC1452h, Integer.valueOf(i8))) {
                    multiInstanceInvalidationService.f6985r.put(Integer.valueOf(i8), str);
                    i7 = i8;
                } else {
                    multiInstanceInvalidationService.f6984q--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i7;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

package g3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import o3.AbstractBinderC1067a;
import o3.AbstractC1068b;
/* loaded from: classes.dex */
public final class p extends AbstractBinderC1067a {
    public AbstractC0733b d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10812e;

    public p(AbstractC0733b abstractC0733b, int i7) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.d = abstractC0733b;
        this.f10812e = i7;
    }

    @Override // o3.AbstractBinderC1067a
    public final boolean y(int i7, Parcel parcel, Parcel parcel2) {
        int i8 = this.f10812e;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                t tVar = (t) AbstractC1068b.a(parcel, t.CREATOR);
                AbstractC1068b.b(parcel);
                n.h(this.d, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                n.g(tVar);
                Bundle bundle = tVar.f10818q;
                n.h(this.d, "onPostInitComplete can be called only once per call to getRemoteService");
                AbstractC0733b abstractC0733b = this.d;
                abstractC0733b.getClass();
                r rVar = new r(abstractC0733b, readInt, readStrongBinder, bundle);
                o oVar = abstractC0733b.f10762e;
                oVar.sendMessage(oVar.obtainMessage(1, i8, -1, rVar));
                this.d = null;
            } else {
                parcel.readInt();
                Bundle bundle2 = (Bundle) AbstractC1068b.a(parcel, Bundle.CREATOR);
                AbstractC1068b.b(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            AbstractC1068b.b(parcel);
            n.h(this.d, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC0733b abstractC0733b2 = this.d;
            abstractC0733b2.getClass();
            r rVar2 = new r(abstractC0733b2, parcel.readInt(), parcel.readStrongBinder(), (Bundle) AbstractC1068b.a(parcel, Bundle.CREATOR));
            o oVar2 = abstractC0733b2.f10762e;
            oVar2.sendMessage(oVar2.obtainMessage(1, i8, -1, rVar2));
            this.d = null;
        }
        parcel2.writeNoException();
        return true;
    }
}

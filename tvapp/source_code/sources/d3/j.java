package d3;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import l3.BinderC0971b;
import l3.InterfaceC0970a;
import o3.AbstractBinderC1067a;
import o3.AbstractC1068b;
/* loaded from: classes.dex */
public abstract class j extends AbstractBinderC1067a implements g3.i {
    public final int d;

    public j(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        boolean z7;
        if (bArr.length == 25) {
            z7 = true;
        } else {
            z7 = false;
        }
        g3.n.a(z7);
        this.d = Arrays.hashCode(bArr);
    }

    public static byte[] z(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e3) {
            throw new AssertionError(e3);
        }
    }

    public abstract byte[] A();

    @Override // g3.i
    public final InterfaceC0970a c() {
        return new BinderC0971b(A());
    }

    public final boolean equals(Object obj) {
        InterfaceC0970a c5;
        if (obj != null && (obj instanceof g3.i)) {
            try {
                g3.i iVar = (g3.i) obj;
                if (iVar.l() != this.d || (c5 = iVar.c()) == null) {
                    return false;
                }
                return Arrays.equals(A(), (byte[]) BinderC0971b.A(c5));
            } catch (RemoteException e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }

    @Override // g3.i
    public final int l() {
        return this.d;
    }

    @Override // o3.AbstractBinderC1067a
    public final boolean y(int i7, Parcel parcel, Parcel parcel2) {
        if (i7 != 1) {
            if (i7 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.d);
        } else {
            InterfaceC0970a c5 = c();
            parcel2.writeNoException();
            AbstractC1068b.c(parcel2, c5);
        }
        return true;
    }
}

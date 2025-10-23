package D2;

import Z2.AbstractC0156a;
import Z2.H;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e2.C0595a0;
import e2.K;
import java.util.Arrays;
import x2.InterfaceC1460b;
/* loaded from: classes.dex */
public final class a implements InterfaceC1460b {
    public static final Parcelable.Creator<a> CREATOR = new A2.a(15);

    /* renamed from: q  reason: collision with root package name */
    public final String f504q;

    /* renamed from: r  reason: collision with root package name */
    public final byte[] f505r;

    /* renamed from: s  reason: collision with root package name */
    public final int f506s;

    /* renamed from: t  reason: collision with root package name */
    public final int f507t;

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i7 = H.f4603a;
        this.f504q = readString;
        this.f505r = parcel.createByteArray();
        this.f506s = parcel.readInt();
        this.f507t = parcel.readInt();
    }

    @Override // x2.InterfaceC1460b
    public final /* synthetic */ byte[] b() {
        return null;
    }

    @Override // x2.InterfaceC1460b
    public final /* synthetic */ void c(C0595a0 c0595a0) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f504q.equals(aVar.f504q) && Arrays.equals(this.f505r, aVar.f505r) && this.f506s == aVar.f506s && this.f507t == aVar.f507t) {
            return true;
        }
        return false;
    }

    @Override // x2.InterfaceC1460b
    public final /* synthetic */ K f() {
        return null;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f505r) + AbstractC0515y1.i(527, 31, this.f504q)) * 31) + this.f506s) * 31) + this.f507t;
    }

    public final String toString() {
        String o7;
        boolean z7;
        boolean z8;
        byte[] bArr = this.f505r;
        int i7 = this.f507t;
        if (i7 != 1) {
            if (i7 != 23) {
                if (i7 != 67) {
                    int i8 = H.f4603a;
                    StringBuilder sb = new StringBuilder(bArr.length * 2);
                    for (int i9 = 0; i9 < bArr.length; i9++) {
                        sb.append(Character.forDigit((bArr[i9] >> 4) & 15, 16));
                        sb.append(Character.forDigit(bArr[i9] & 15, 16));
                    }
                    o7 = sb.toString();
                } else {
                    int i10 = H.f4603a;
                    if (bArr.length == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    AbstractC0156a.f(z8);
                    o7 = String.valueOf((bArr[1] << 16) | (bArr[0] << 24) | (bArr[2] << 8) | bArr[3]);
                }
            } else {
                int i11 = H.f4603a;
                if (bArr.length == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                AbstractC0156a.f(z7);
                o7 = String.valueOf(Float.intBitsToFloat(((bArr[1] & 255) << 16) | (bArr[0] << 24) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)));
            }
        } else {
            o7 = H.o(bArr);
        }
        return "mdta: key=" + this.f504q + ", value=" + o7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f504q);
        parcel.writeByteArray(this.f505r);
        parcel.writeInt(this.f506s);
        parcel.writeInt(this.f507t);
    }

    public a(String str, byte[] bArr, int i7, int i8) {
        this.f504q = str;
        this.f505r = bArr;
        this.f506s = i7;
        this.f507t = i8;
    }
}

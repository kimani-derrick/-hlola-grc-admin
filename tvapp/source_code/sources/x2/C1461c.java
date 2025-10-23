package x2;

import Z2.H;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
/* renamed from: x2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1461c implements Parcelable {
    public static final Parcelable.Creator<C1461c> CREATOR = new Object();

    /* renamed from: q  reason: collision with root package name */
    public final InterfaceC1460b[] f16206q;

    /* renamed from: r  reason: collision with root package name */
    public final long f16207r;

    public C1461c(long j7, InterfaceC1460b... interfaceC1460bArr) {
        this.f16207r = j7;
        this.f16206q = interfaceC1460bArr;
    }

    public final C1461c a(InterfaceC1460b... interfaceC1460bArr) {
        if (interfaceC1460bArr.length == 0) {
            return this;
        }
        int i7 = H.f4603a;
        InterfaceC1460b[] interfaceC1460bArr2 = this.f16206q;
        Object[] copyOf = Arrays.copyOf(interfaceC1460bArr2, interfaceC1460bArr2.length + interfaceC1460bArr.length);
        System.arraycopy(interfaceC1460bArr, 0, copyOf, interfaceC1460bArr2.length, interfaceC1460bArr.length);
        return new C1461c(this.f16207r, (InterfaceC1460b[]) copyOf);
    }

    public final InterfaceC1460b d(int i7) {
        return this.f16206q[i7];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f16206q.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1461c.class != obj.getClass()) {
            return false;
        }
        C1461c c1461c = (C1461c) obj;
        if (Arrays.equals(this.f16206q, c1461c.f16206q) && this.f16207r == c1461c.f16207r) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return h4.b.x(this.f16207r) + (Arrays.hashCode(this.f16206q) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f16206q));
        long j7 = this.f16207r;
        if (j7 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j7;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        InterfaceC1460b[] interfaceC1460bArr = this.f16206q;
        parcel.writeInt(interfaceC1460bArr.length);
        for (InterfaceC1460b interfaceC1460b : interfaceC1460bArr) {
            parcel.writeParcelable(interfaceC1460b, 0);
        }
        parcel.writeLong(this.f16207r);
    }

    public C1461c(Parcel parcel) {
        this.f16206q = new InterfaceC1460b[parcel.readInt()];
        int i7 = 0;
        while (true) {
            InterfaceC1460b[] interfaceC1460bArr = this.f16206q;
            if (i7 >= interfaceC1460bArr.length) {
                this.f16207r = parcel.readLong();
                return;
            } else {
                interfaceC1460bArr[i7] = (InterfaceC1460b) parcel.readParcelable(InterfaceC1460b.class.getClassLoader());
                i7++;
            }
        }
    }

    public C1461c(List list) {
        this((InterfaceC1460b[]) list.toArray(new InterfaceC1460b[0]));
    }

    public C1461c(InterfaceC1460b... interfaceC1460bArr) {
        this(-9223372036854775807L, interfaceC1460bArr);
    }
}

package z2;

import Z2.H;
import android.os.Parcel;
import android.os.Parcelable;
import e2.C0593J;
import e2.C0595a0;
import e2.K;
import java.util.Arrays;
import s3.C1199t;
import x2.InterfaceC1460b;
/* renamed from: z2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1513a implements InterfaceC1460b {
    public static final Parcelable.Creator<C1513a> CREATOR;

    /* renamed from: w  reason: collision with root package name */
    public static final K f16437w;

    /* renamed from: x  reason: collision with root package name */
    public static final K f16438x;

    /* renamed from: q  reason: collision with root package name */
    public final String f16439q;

    /* renamed from: r  reason: collision with root package name */
    public final String f16440r;

    /* renamed from: s  reason: collision with root package name */
    public final long f16441s;

    /* renamed from: t  reason: collision with root package name */
    public final long f16442t;

    /* renamed from: u  reason: collision with root package name */
    public final byte[] f16443u;

    /* renamed from: v  reason: collision with root package name */
    public int f16444v;

    static {
        C0593J c0593j = new C0593J();
        c0593j.f9605k = "application/id3";
        f16437w = c0593j.a();
        C0593J c0593j2 = new C0593J();
        c0593j2.f9605k = "application/x-scte35";
        f16438x = c0593j2.a();
        CREATOR = new C1199t(9);
    }

    public C1513a(Parcel parcel) {
        String readString = parcel.readString();
        int i7 = H.f4603a;
        this.f16439q = readString;
        this.f16440r = parcel.readString();
        this.f16441s = parcel.readLong();
        this.f16442t = parcel.readLong();
        this.f16443u = parcel.createByteArray();
    }

    @Override // x2.InterfaceC1460b
    public final byte[] b() {
        if (f() != null) {
            return this.f16443u;
        }
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
        if (obj == null || C1513a.class != obj.getClass()) {
            return false;
        }
        C1513a c1513a = (C1513a) obj;
        if (this.f16441s == c1513a.f16441s && this.f16442t == c1513a.f16442t && H.a(this.f16439q, c1513a.f16439q) && H.a(this.f16440r, c1513a.f16440r) && Arrays.equals(this.f16443u, c1513a.f16443u)) {
            return true;
        }
        return false;
    }

    @Override // x2.InterfaceC1460b
    public final K f() {
        String str = this.f16439q;
        str.getClass();
        char c5 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c5 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c5 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c5 = 2;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                return f16438x;
            case 1:
            case 2:
                return f16437w;
            default:
                return null;
        }
    }

    public final int hashCode() {
        int i7;
        if (this.f16444v == 0) {
            int i8 = 0;
            String str = this.f16439q;
            if (str != null) {
                i7 = str.hashCode();
            } else {
                i7 = 0;
            }
            int i9 = (527 + i7) * 31;
            String str2 = this.f16440r;
            if (str2 != null) {
                i8 = str2.hashCode();
            }
            long j7 = this.f16441s;
            long j8 = this.f16442t;
            this.f16444v = Arrays.hashCode(this.f16443u) + ((((((i9 + i8) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31);
        }
        return this.f16444v;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f16439q + ", id=" + this.f16442t + ", durationMs=" + this.f16441s + ", value=" + this.f16440r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f16439q);
        parcel.writeString(this.f16440r);
        parcel.writeLong(this.f16441s);
        parcel.writeLong(this.f16442t);
        parcel.writeByteArray(this.f16443u);
    }

    public C1513a(String str, String str2, long j7, long j8, byte[] bArr) {
        this.f16439q = str;
        this.f16440r = str2;
        this.f16441s = j7;
        this.f16442t = j8;
        this.f16443u = bArr;
    }
}

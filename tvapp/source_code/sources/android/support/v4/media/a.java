package android.support.v4.media;

import a.AbstractC0189a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.i;
import androidx.fragment.app.C0248b;
import androidx.fragment.app.C0249c;
import androidx.fragment.app.L;
import androidx.fragment.app.T;
import androidx.fragment.app.X;
import b.d;
import com.google.android.gms.common.api.Scope;
import com.google.android.material.datepicker.m;
import d3.n;
import g3.C0734c;
import g3.C0735d;
import g3.f;
import g3.t;
import h2.C0746a;
import h2.C0747b;
import j2.h;
import n0.C1020k;
import s3.C1168d;
import s3.C1176h;
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5261a;

    public /* synthetic */ a(int i7) {
        this.f5261a = i7;
    }

    public static void a(C0735d c0735d, Parcel parcel, int i7) {
        int P6 = AbstractC0189a.P(parcel, 20293);
        int i8 = c0735d.f10787q;
        AbstractC0189a.R(parcel, 1, 4);
        parcel.writeInt(i8);
        AbstractC0189a.R(parcel, 2, 4);
        parcel.writeInt(c0735d.f10788r);
        AbstractC0189a.R(parcel, 3, 4);
        parcel.writeInt(c0735d.f10789s);
        AbstractC0189a.M(parcel, 4, c0735d.f10790t);
        AbstractC0189a.K(parcel, 5, c0735d.f10791u);
        AbstractC0189a.N(parcel, 6, c0735d.f10792v, i7);
        AbstractC0189a.J(parcel, 7, c0735d.f10793w);
        AbstractC0189a.L(parcel, 8, c0735d.f10794x, i7);
        AbstractC0189a.N(parcel, 10, c0735d.f10795y, i7);
        AbstractC0189a.N(parcel, 11, c0735d.f10796z, i7);
        AbstractC0189a.R(parcel, 12, 4);
        parcel.writeInt(c0735d.f10783A ? 1 : 0);
        AbstractC0189a.R(parcel, 13, 4);
        parcel.writeInt(c0735d.f10784B);
        boolean z7 = c0735d.f10785C;
        AbstractC0189a.R(parcel, 14, 4);
        parcel.writeInt(z7 ? 1 : 0);
        AbstractC0189a.M(parcel, 15, c0735d.f10786D);
        AbstractC0189a.Q(parcel, P6);
    }

    /* JADX WARN: Removed duplicated region for block: B:224:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04c7  */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, g3.t] */
    /* JADX WARN: Type inference failed for: r1v13, types: [androidx.fragment.app.L, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.fragment.app.T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [b.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [b.a, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createFromParcel(final android.os.Parcel r25) {
        /*
            Method dump skipped, instructions count: 1382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.a.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f5261a) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i7];
            case 1:
                return new MediaDescriptionCompat[i7];
            case 2:
                return new MediaMetadataCompat[i7];
            case 3:
                return new RatingCompat[i7];
            case 4:
                return new androidx.activity.result.a[i7];
            case 5:
                return new i[i7];
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C0248b[i7];
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C0249c[i7];
            case 8:
                return new L[i7];
            case 9:
                return new T[i7];
            case 10:
                return new X[i7];
            case 11:
                return new d[i7];
            case 12:
                return new com.google.android.material.datepicker.b[i7];
            case 13:
                return new com.google.android.material.datepicker.d[i7];
            case 14:
                return new m[i7];
            case 15:
                return new d3.b[i7];
            case 16:
                return new d3.c[i7];
            case 17:
                return new n[i7];
            case 18:
                return new Scope[i7];
            case 19:
                return new f[i7];
            case 20:
                return new t[i7];
            case 21:
                return new C0734c[i7];
            case 22:
                return new C0735d[i7];
            case 23:
                return new C0746a[i7];
            case 24:
                return new C0747b[i7];
            case 25:
                return new j2.i[i7];
            case 26:
                return new h[i7];
            case 27:
                return new C1020k[i7];
            case 28:
                return new C1168d[i7];
            default:
                return new C1176h[i7];
        }
    }
}

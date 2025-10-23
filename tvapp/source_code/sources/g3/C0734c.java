package g3;

import a.AbstractC0189a;
import android.os.Parcel;
import android.os.Parcelable;
import h3.AbstractC0748a;
/* renamed from: g3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0734c extends AbstractC0748a {
    public static final Parcelable.Creator<C0734c> CREATOR = new android.support.v4.media.a(21);

    /* renamed from: q  reason: collision with root package name */
    public final f f10776q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f10777r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f10778s;

    /* renamed from: t  reason: collision with root package name */
    public final int[] f10779t;

    /* renamed from: u  reason: collision with root package name */
    public final int f10780u;

    /* renamed from: v  reason: collision with root package name */
    public final int[] f10781v;

    public C0734c(f fVar, boolean z7, boolean z8, int[] iArr, int i7, int[] iArr2) {
        this.f10776q = fVar;
        this.f10777r = z7;
        this.f10778s = z8;
        this.f10779t = iArr;
        this.f10780u = i7;
        this.f10781v = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int P6 = AbstractC0189a.P(parcel, 20293);
        AbstractC0189a.L(parcel, 1, this.f10776q, i7);
        AbstractC0189a.R(parcel, 2, 4);
        parcel.writeInt(this.f10777r ? 1 : 0);
        AbstractC0189a.R(parcel, 3, 4);
        parcel.writeInt(this.f10778s ? 1 : 0);
        int[] iArr = this.f10779t;
        if (iArr != null) {
            int P7 = AbstractC0189a.P(parcel, 4);
            parcel.writeIntArray(iArr);
            AbstractC0189a.Q(parcel, P7);
        }
        AbstractC0189a.R(parcel, 5, 4);
        parcel.writeInt(this.f10780u);
        int[] iArr2 = this.f10781v;
        if (iArr2 != null) {
            int P8 = AbstractC0189a.P(parcel, 6);
            parcel.writeIntArray(iArr2);
            AbstractC0189a.Q(parcel, P8);
        }
        AbstractC0189a.Q(parcel, P6);
    }
}

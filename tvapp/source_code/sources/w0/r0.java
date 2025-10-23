package w0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import s3.C1199t;
/* loaded from: classes.dex */
public final class r0 implements Parcelable {
    public static final Parcelable.Creator<r0> CREATOR = new C1199t(7);

    /* renamed from: q  reason: collision with root package name */
    public int f15640q;

    /* renamed from: r  reason: collision with root package name */
    public int f15641r;

    /* renamed from: s  reason: collision with root package name */
    public int f15642s;

    /* renamed from: t  reason: collision with root package name */
    public int[] f15643t;

    /* renamed from: u  reason: collision with root package name */
    public int f15644u;

    /* renamed from: v  reason: collision with root package name */
    public int[] f15645v;

    /* renamed from: w  reason: collision with root package name */
    public List f15646w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f15647x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f15648y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f15649z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f15640q);
        parcel.writeInt(this.f15641r);
        parcel.writeInt(this.f15642s);
        if (this.f15642s > 0) {
            parcel.writeIntArray(this.f15643t);
        }
        parcel.writeInt(this.f15644u);
        if (this.f15644u > 0) {
            parcel.writeIntArray(this.f15645v);
        }
        parcel.writeInt(this.f15647x ? 1 : 0);
        parcel.writeInt(this.f15648y ? 1 : 0);
        parcel.writeInt(this.f15649z ? 1 : 0);
        parcel.writeList(this.f15646w);
    }
}

package I0;

import android.os.Parcel;
import android.util.SparseIntArray;
import o.C1052e;
import o.j;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class b extends a {
    public final SparseIntArray d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f1208e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1209g;

    /* renamed from: h  reason: collision with root package name */
    public final String f1210h;

    /* renamed from: i  reason: collision with root package name */
    public int f1211i;

    /* renamed from: j  reason: collision with root package name */
    public int f1212j;

    /* renamed from: k  reason: collision with root package name */
    public int f1213k;

    /* JADX WARN: Type inference failed for: r5v0, types: [o.e, o.j] */
    /* JADX WARN: Type inference failed for: r6v0, types: [o.e, o.j] */
    /* JADX WARN: Type inference failed for: r7v0, types: [o.e, o.j] */
    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new j(), new j(), new j());
    }

    @Override // I0.a
    public final b a() {
        Parcel parcel = this.f1208e;
        int dataPosition = parcel.dataPosition();
        int i7 = this.f1212j;
        if (i7 == this.f) {
            i7 = this.f1209g;
        }
        return new b(parcel, dataPosition, i7, AbstractC1111a.t(new StringBuilder(), this.f1210h, "  "), this.f1205a, this.f1206b, this.f1207c);
    }

    @Override // I0.a
    public final boolean e(int i7) {
        while (this.f1212j < this.f1209g) {
            int i8 = this.f1213k;
            if (i8 == i7) {
                return true;
            }
            if (String.valueOf(i8).compareTo(String.valueOf(i7)) > 0) {
                return false;
            }
            int i9 = this.f1212j;
            Parcel parcel = this.f1208e;
            parcel.setDataPosition(i9);
            int readInt = parcel.readInt();
            this.f1213k = parcel.readInt();
            this.f1212j += readInt;
        }
        if (this.f1213k != i7) {
            return false;
        }
        return true;
    }

    @Override // I0.a
    public final void i(int i7) {
        int i8 = this.f1211i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f1208e;
        if (i8 >= 0) {
            int i9 = sparseIntArray.get(i8);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i9);
            parcel.writeInt(dataPosition - i9);
            parcel.setDataPosition(dataPosition);
        }
        this.f1211i = i7;
        sparseIntArray.put(i7, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i7);
    }

    public b(Parcel parcel, int i7, int i8, String str, C1052e c1052e, C1052e c1052e2, C1052e c1052e3) {
        super(c1052e, c1052e2, c1052e3);
        this.d = new SparseIntArray();
        this.f1211i = -1;
        this.f1213k = -1;
        this.f1208e = parcel;
        this.f = i7;
        this.f1209g = i8;
        this.f1212j = i7;
        this.f1210h = str;
    }
}

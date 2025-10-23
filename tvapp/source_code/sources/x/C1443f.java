package x;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
/* renamed from: x.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1443f extends S.b {
    public static final Parcelable.Creator<C1443f> CREATOR = new A3.b(7);

    /* renamed from: s  reason: collision with root package name */
    public SparseArray f16143s;

    public C1443f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f16143s = new SparseArray(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            this.f16143s.append(iArr[i7], readParcelableArray[i7]);
        }
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8;
        super.writeToParcel(parcel, i7);
        SparseArray sparseArray = this.f16143s;
        if (sparseArray != null) {
            i8 = sparseArray.size();
        } else {
            i8 = 0;
        }
        parcel.writeInt(i8);
        int[] iArr = new int[i8];
        Parcelable[] parcelableArr = new Parcelable[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            iArr[i9] = this.f16143s.keyAt(i9);
            parcelableArr[i9] = (Parcelable) this.f16143s.valueAt(i9);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i7);
    }
}

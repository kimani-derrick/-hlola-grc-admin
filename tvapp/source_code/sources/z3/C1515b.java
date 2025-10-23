package z3;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* renamed from: z3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1515b extends S.b {
    public static final Parcelable.Creator<C1515b> CREATOR = new A3.b(8);

    /* renamed from: s  reason: collision with root package name */
    public final int f16445s;

    /* renamed from: t  reason: collision with root package name */
    public final int f16446t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f16447u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f16448v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f16449w;

    public C1515b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f16445s = parcel.readInt();
        this.f16446t = parcel.readInt();
        this.f16447u = parcel.readInt() == 1;
        this.f16448v = parcel.readInt() == 1;
        this.f16449w = parcel.readInt() == 1;
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f16445s);
        parcel.writeInt(this.f16446t);
        parcel.writeInt(this.f16447u ? 1 : 0);
        parcel.writeInt(this.f16448v ? 1 : 0);
        parcel.writeInt(this.f16449w ? 1 : 0);
    }

    public C1515b(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f16445s = bottomSheetBehavior.F;
        this.f16446t = bottomSheetBehavior.d;
        this.f16447u = bottomSheetBehavior.f8768b;
        this.f16448v = bottomSheetBehavior.f8748C;
        this.f16449w = bottomSheetBehavior.f8749D;
    }
}

package L3;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class x extends S.b {
    public static final Parcelable.Creator<x> CREATOR = new A3.b(2);

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f2124s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2125t;

    /* renamed from: u  reason: collision with root package name */
    public CharSequence f2126u;

    /* renamed from: v  reason: collision with root package name */
    public CharSequence f2127v;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f2128w;

    public x(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f2124s = (CharSequence) creator.createFromParcel(parcel);
        this.f2125t = parcel.readInt() == 1;
        this.f2126u = (CharSequence) creator.createFromParcel(parcel);
        this.f2127v = (CharSequence) creator.createFromParcel(parcel);
        this.f2128w = (CharSequence) creator.createFromParcel(parcel);
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f2124s) + " hint=" + ((Object) this.f2126u) + " helperText=" + ((Object) this.f2127v) + " placeholderText=" + ((Object) this.f2128w) + "}";
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        TextUtils.writeToParcel(this.f2124s, parcel, i7);
        parcel.writeInt(this.f2125t ? 1 : 0);
        TextUtils.writeToParcel(this.f2126u, parcel, i7);
        TextUtils.writeToParcel(this.f2127v, parcel, i7);
        TextUtils.writeToParcel(this.f2128w, parcel, i7);
    }
}

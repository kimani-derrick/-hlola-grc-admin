package androidx.leanback.widget;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: androidx.leanback.widget.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0319w implements Parcelable.Creator {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.leanback.widget.x] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ?? obj = new Object();
        obj.f6665r = Bundle.EMPTY;
        obj.f6664q = parcel.readInt();
        obj.f6665r = parcel.readBundle(C0321y.class.getClassLoader());
        return obj;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new C0320x[i7];
    }
}
